package com.sedinkin.model

import com.google.gson.annotations.SerializedName

/**
 * Data class for transferring and typing country data
 */
data class CountryStat(
    /** name of country */
    var name: String = "",
    /** density in kilometers */
    var densityKilometers: Int = 0,
    /** density in miles */
    var densityMiles: Int = 0,
    /** population */
    var population: Int = 0,
    /** area in kilometers */
    var areaKilometers: Int = 0,
    /** area in miles */
    var areaMiles: Int = 0
)
