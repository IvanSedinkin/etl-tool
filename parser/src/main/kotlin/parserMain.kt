import com.sedinkin.model.ScrapingResult
import it.skrape.core.htmlDocument
import it.skrape.fetcher.HttpFetcher
import it.skrape.fetcher.extractIt
import it.skrape.fetcher.skrape
import it.skrape.selects.html5.table
import it.skrape.selects.html5.tr

fun main(){
    // Set your website URL
    val website_url = "https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_population_density"
    val countries = skrape(HttpFetcher) {
        request {
            // Tell skrape{it} which URL to fetch data from
            url = website_url
        }


        extractIt<ScrapingResult> { results ->
            htmlDocument{
                val countryRows = table(".wikitable") {
                    tr{
                        findAll{this}
                    }
                }
                countryRows.drop(2).forEach {
                    println(it)
                }
            }
        }
    }
}