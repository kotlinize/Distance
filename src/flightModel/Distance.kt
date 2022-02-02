package flightModel

import DistanceUnit

/**
 * Distance class to hold value and Distance Unit.
 *
 * @property [value] sets the value of Distance
 * @property [distanceUnit] sets the Distance Unit of the value set
 */
data class Distance(
    val value: Double,
    val distanceUnit: DistanceUnit
)