package flightModel


enum class FlightState(private val displayName: String) {
    ACTIVE("Active"),
    ORBIT("Orbit"),
    READY_TO_LAUNCH("Ready to Launch"),
    INACTIVE("Inactive");

    override fun toString(): String {
        return  displayName
    }
}