package aviationmanagement;

import java.util.Objects;

public class Aircraft {
    private String model;
    private String airline;
    private int seatingCapacity;
    private int range;

    public void setModel(String model) {
        if(model == null)
        {
            this.model = "";
        }
        else
        {
            this.model = model;
        }
    }

    public void setAirline(String airline) {
        if(airline == null)
        {
            this.airline = "";
        }
        else
        {
            this.airline = airline;
        }
    }

    public void setSeatingCapacity(int seatingCapacity) {
        if(seatingCapacity < 0)
        {
            this.seatingCapacity = 0;
        }
        else
        {
            this.seatingCapacity = seatingCapacity;
        }
    }

    public void setRange(int range) {
        if(range < 0)
        {
            this.range = 0;
        }
        else
        {
            this.range = range;
        }
    }

    public String getModel() {
        return model;
    }

    public String getAirline() {
        return airline;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public int getRange() {
        return range;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "model='" + model + '\'' +
                ", airline='" + airline + '\'' +
                ", seatingCapacity=" + seatingCapacity +
                ", range=" + range +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aircraft aircraft = (Aircraft) o;
        return seatingCapacity == aircraft.seatingCapacity && range == aircraft.range && Objects.equals(model, aircraft.model) && Objects.equals(airline, aircraft.airline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, airline, seatingCapacity, range);
    }

    public Aircraft(String model, String airline, int seatingCapacity, int range) {
        if(model == null)
        {
            this.model = "";
        }
        else
        {
            this.model = model;
        }
        if(airline == null)
        {
            this.airline = "";
        }
        else
        {
            this.airline = airline;
        }
        if(seatingCapacity < 0)
        {
            this.seatingCapacity = 0;
        }
        else
        {
            this.seatingCapacity = seatingCapacity;
        }
        if(range < 0)
        {
            this.range = 0;
        }
        else
        {
            this.range = range;
        }





    }
}
