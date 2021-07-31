package fuellingInterface;

public abstract class CarHub implements Car{
    @Override
    public double getChargeQuantity() {
        return getTripDistance()/getDistancePerLiter();
    }
}
