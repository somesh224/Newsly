package com.example.newsly

object ColorPicker {
    val colors = arrayOf(
        "#ffe4d2",
        "#fff5d4",
        "#e5ffe1",
        "#d8eeff",
        "#ffd2d2",
        "#b2abf1",
        "#75b3ff",
        "#1fadeb",
        "#fb9cf1",
        "#2be1f2"
    )
    var colorIndex = 1
    fun getColor(): String{
        return colors[colorIndex++ % colors.size]
    }
}