package com.gildedrose

data class Item(val name: String, val sellIn: Int, val quality: Int) {
    val isAgedBrie = name.equals("Aged Brie")
    val isBackstagePass = name.equals("Backstage passes to a TAFKAL80ETC concert")
    val isHandOfRagnaros = name.equals("Sulfuras, Hand of Ragnaros")

}