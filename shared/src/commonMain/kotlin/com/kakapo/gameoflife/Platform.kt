package com.kakapo.gameoflife

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform