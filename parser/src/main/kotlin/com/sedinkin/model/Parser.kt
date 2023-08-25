package com.sedinkin.model

import it.skrape.core.htmlDocument
import it.skrape.fetcher.HttpFetcher
import it.skrape.fetcher.extractIt
import it.skrape.fetcher.skrape
import it.skrape.selects.DocElement
import it.skrape.selects.html5.table
import it.skrape.selects.html5.tr

class Parser {
    fun parse(): MutableList<DocElement> {
        val data: MutableList<DocElement> = mutableListOf()
        val countries = skrape(HttpFetcher) {
            request {
                // Tell skrape{it} which URL to fetch data from
                url = sourceUrl
            }


            extractIt<ScrapingResult> { results ->
                htmlDocument {
                    val countryRows = table(".wikitable") {
                        tr {
                            findAll { this }
                        }
                    }
                    countryRows.drop(2).forEach {
                        data.add(it)
                    }
                }
            }
        }
        return data
    }

    companion object {
        const val sourceUrl = "https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_population_density"
    }
}