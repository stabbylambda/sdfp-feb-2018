package com.gildedrose

class GildedRose(val items: List<Item>) {
    fun updateQuality() : GildedRose {
        return GildedRose(items.map { this.updateQuality(this.updateSellIn(it)) })
    }

    private fun updateSellIn(item: Item): Item {

        return if (!item.isHandOfRagnaros) {
            item.copy(sellIn = item.sellIn - 1)
        } else {
            item
        }

    }

    private fun updateQuality(originalItem: Item): Item {
        var item = originalItem.copy()

        if (!item.isAgedBrie && !item.isBackstagePass) {
            if (item.quality > 0) {
                if (!item.isHandOfRagnaros) {
                    item = item.copy(quality = item.quality - 1)
                }
            }
        } else {
            if (item.quality < 50) {
                item = item.copy(quality = item.quality + 1)

                if (item.isBackstagePass) {
                    if (item.sellIn < 11) {
                        if (item.quality < 50) {
                            item = item.copy(quality = item.quality + 1)
                        }
                    }

                    if (item.sellIn < 6) {
                        if (item.quality < 50) {
                            item = item.copy(quality = item.quality + 1)
                        }
                    }
                }
            }
        }

        if (item.sellIn < 0) {
            if (!item.isAgedBrie) {
                if (!item.isBackstagePass) {
                    if (item.quality > 0) {
                        if (!item.isHandOfRagnaros) {
                            item = item.copy(quality = item.quality - 1)
                        }
                    }
                } else {
                    item = item.copy(quality = item.quality - item.quality)
                }
            } else {
                if (item.quality < 50) {
                    item = item.copy(quality = item.quality + 1)
                }
            }
        }
        return item
    }

}

