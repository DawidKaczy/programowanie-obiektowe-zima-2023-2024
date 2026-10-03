package transport;

public record BusRoute(String routeNumber, String startLocation, String endLocation) {
    public BusRoute {
        if(routeNumber.isEmpty() || routeNumber == null)
        {
            throw new IllegalArgumentException("Nie może byc pusty");
        }
    }

    public boolean isLongRoute(){
        return routeNumber.length() > 4;
    }
    public void printDetails() {
        System.out.println(                "routeNumber='" + routeNumber + '\'' +
                ", startLocation='" + startLocation + '\'' +
                ", endLocation='" + endLocation + '\'' +
                '}');

    }
}
