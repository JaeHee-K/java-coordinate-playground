package fuellingInterface;

public class Avante extends CarHub{
    private static final double liter = 15;
    private double distance;
    private String name;

    public Avante(double distance){
        this.name = "Avante";
        this.distance = distance;
    }

    @Override
    public double getDistancePerLiter() {
        return liter;
    }

    @Override
    public double getTripDistance() {
        return distance;
    }

    @Override
    public String getName() {
        return name;
    }
}
