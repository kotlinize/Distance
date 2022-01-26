package flightModel

import Point
import Speed

data class FlightStatus(
    val flightState: FlightState,
    val location: Point,
    val destination: Point,
    val speed: Speed = Speed(value = 0.0)
)
