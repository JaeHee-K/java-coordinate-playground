package fuellingInterface;

public class K5 extends CarHub{
    private static final double liter = 13;
    private double distance;
    private String name;

    public K5(double distance){
        this.name = "K5";
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
