package flightModel

import Point
import Speed

/**
 * Interface for the Flight Models, modularized for implementations for updated or precise Flight Modeling.
 */
interface IFlightModel {

    /**
     * Function to Initialize the Flight Start Sequence.
     *
     * @param [startLocation] takes the starting point of the Aircraft
     * @param [destinationLocation] takes the destination point of where to fly to
     */
    fun initializeFlightStartSequence(startLocation: Point, destinationLocation: Point)

    /**
     * Function to update the destination with an updated point.
     *
     * @param [destinationLocation] takes the new destination point of where to fly to
     */
    fun updateDestination(destinationLocation: Point)

    /**
     * Function to return the current Flight Status of the Aircraft.
     *
     * @return the current FlightStatus
     */
    fun getFlightStatus(): FlightStatus

    /**
     * Function to change the throttle of the Aircraft.
     *
     * @param [speed] takes the updated speed
     */
    fun changeThrottle(speed: Speed)

    /**
     * Function to get the distance from the current location to the destination.
     *
     * @return the Distance from the destination
     */
    fun getDistanceToLocation(): Distance
}