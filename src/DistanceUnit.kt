/**
 * Enumeration of Types of Distance Units
 *
 * @property [displayName] is a string value of a given type
 */
enum class DistanceUnit(private val displayName: String) {
    FEET("Feet"),
    MILES("Miles"),
    METERS("Meters"),
    KILOMETERS("Kilometers");

    /**
     * Overrides toString method to return the [displayName].
     */
    override fun toString(): String {
        return displayName
    }
}