package fuelling;

public class Sonata extends Car{
    private static final double liter = 10;
    private double distance;
    private String name;

    public Sonata(double distance){
        this.name = "Sonata";
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
