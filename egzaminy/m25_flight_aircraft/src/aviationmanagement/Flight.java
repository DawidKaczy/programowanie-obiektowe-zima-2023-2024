package aviationmanagement;

import java.util.Objects;

public class Flight {
    private String flightNumber;
    private String departureDate;
    private Aircraft aircraft;
    private int passengerCount;

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setFlightNumber(String flightNumber) {
        if(flightNumber == null)
        {
            this.flightNumber = "";
        }
        else
        {
            this.flightNumber = flightNumber;
        }
    }

    public void setDepartureDate(String departureDate) {
        if(departureDate == null)
        {
            this.departureDate = "";
        }
        else
        {
            this.departureDate = departureDate;
        }
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public void setPassengerCount(int passengerCount) {
        if(passengerCount < 0)
        {
            this.passengerCount = 0;
        }
        else
        {
            this.passengerCount = passengerCount;
        }
    }

    public Flight(String flightNumber, String departureDate, Aircraft aircraft, int passengerCount) {
        if(flightNumber == null)
        {
            this.flightNumber = "";
        }
        else
        {
            this.flightNumber = flightNumber;
        }
        if(departureDate == null)
        {
            this.departureDate = "";
        }
        else
        {
            this.departureDate = departureDate;
        }
        this.aircraft = aircraft;
        if(passengerCount < 0)
        {
            this.passengerCount = 0;
        }
        else
        {
            this.passengerCount = passengerCount;
        }
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", departureDate='" + departureDate + '\'' +
                ", aircraft=" + aircraft +
                ", passengerCount=" + passengerCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return passengerCount == flight.passengerCount && Objects.equals(flightNumber, flight.flightNumber) && Objects.equals(departureDate, flight.departureDate) && Objects.equals(aircraft, flight.aircraft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber, departureDate, aircraft, passengerCount);
    }
}
