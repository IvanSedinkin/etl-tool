package com.sedinkin.model

data class ScrapingResult(val countries: MutableList<CountryStat> = mutableListOf(), var count: Int = 0)
