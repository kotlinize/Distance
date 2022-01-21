fun main() {
    val currentPoint = Point(
        latitude = 34.719991,
        longitude = -86.602884
    )

    val newPoint = Point(
        latitude = 34.719977,
        longitude = -86.601097
    )

    val distance = currentPoint.getDistanceToPoint(toDistanceUnits = DistanceUnit.FEET, pointToGoTo = newPoint)

    println(distance.first)
}