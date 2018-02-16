package com.gildedrose

import org.junit.Assert.*
import org.junit.Test

class GildedRoseTest {

    @Test fun foo() {
        val items = listOf(
                Item("+5 Dexterity Vest", 10, 20),
                Item("Aged Brie", 2, 0),
                Item("Elixir of the Mongoose", 5, 7),
                Item("Sulfuras, Hand of Ragnaros", 0, 80),
                Item("Sulfuras, Hand of Ragnaros", -1, 80),
                Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                Item("Conjured Mana Cake", 3, 6)
        )

        val app = GildedRose(items)
        val updated = app.updateQuality()

        app.items.forEach { item ->
            println("${item.name} ${item.sellIn} ${item.quality}")
        }
        println()
        println("========= WHAT =========")
        println()
        updated.items.forEach { item ->
            println("${item.name} ${item.sellIn} ${item.quality}")
        }

    }


}


