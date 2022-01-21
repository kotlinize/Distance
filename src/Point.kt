import kotlin.math.*

/**
 * Point class that holds a longitude and latitude.
 */
data class Point(
    val latitude: Double = 0.0,
    val longitude: Double = 0.0
) {

    /**
     * Gets a Distance to a given Point.
     *
     * @param [toDistanceUnits] takes the Distance Units of the value to be expected.
     * @param [pointToGoTo] takes in the Point to travel to.
     * @return a Pair of the Distance and Distance Unit from this point to a given point.
     */
    fun getDistanceToPoint(toDistanceUnits: DistanceUnit, pointToGoTo: Point): Pair<Double, DistanceUnit> {
        val currentLatitudeRadians = latitude / (180 / Math.PI)
        val currentLongitudeRadians = longitude / (180 / Math.PI)
        val newLatitudeRadians = pointToGoTo.latitude / (180 / Math.PI)
        val newLongitudeRadians = pointToGoTo.longitude / (180 / Math.PI)

        // Haversine formula
        val lat = newLatitudeRadians - currentLatitudeRadians
        val long = newLongitudeRadians - currentLongitudeRadians

        // Earth's Radius in Kilometers
        val radius = 6371

        val a = sin(lat / 2).pow(2) + cos(currentLatitudeRadians) * cos(newLatitudeRadians) * sin(long / 2).pow(2)
        val c = 2 * asin(sqrt(a))

        // Result in Kilometers
        val resultInKm = c * radius

        // Convert Result to the expected distance units
        val result = when (toDistanceUnits) {
            DistanceUnit.KILOMETERS -> resultInKm
            DistanceUnit.METERS -> resultInKm * 1000
            DistanceUnit.MILES -> resultInKm * 0.621371
            DistanceUnit.FEET -> resultInKm * 3280.84
        }

        // Return Result
        return Pair(result, toDistanceUnits)
    }
}