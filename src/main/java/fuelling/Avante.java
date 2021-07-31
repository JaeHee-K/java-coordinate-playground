package fuelling;

public class Avante extends Car{
    private static final double liter = 15;
    private double distance;
    private String name;

    public Avante(double distance){
        this.name = "Avante";
        this.distance = distance;
    }

    @Override
    double getDistancePerLiter() {
        return liter;
    }

    @Override
    double getTripDistance() {
        return distance;
    }

    @Override
    String getName() {
        return name;
    }
}
