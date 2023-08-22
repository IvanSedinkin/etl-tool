/**
 * Data class for transferring and typing country data
 */
data class CountryStat(
    var name: String = "",
    var densityKilometers: Int = 0,
    var densityMiles: Int = 0,
    var population: Int = 0,
    var areaKilometers: Int = 0,
    var areaMiles: Int = 0
    )
