package com.kakapo.gameoflife

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Game of Life",
    ) {
        App()
    }
}