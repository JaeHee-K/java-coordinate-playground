package fuelling;

public class K5 extends Car{
    private static final double liter = 13;
    private double distance;
    private String name;

    public K5(double distance){
        this.name = "K5";
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
