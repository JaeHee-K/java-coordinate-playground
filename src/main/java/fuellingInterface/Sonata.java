package fuellingInterface;

public class Sonata extends CarHub{
    private static final double liter = 10;
    private double distance;
    private String name;

    public Sonata(double distance){
        this.name = "Sonata";
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
