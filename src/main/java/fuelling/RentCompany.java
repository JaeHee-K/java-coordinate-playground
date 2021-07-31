package fuelling;

public class RentCompany {
    private Car[] cars = new Car[10];
    private int carIndex = 0;

    public static RentCompany create(){
        return new RentCompany();
    }

    public void addCar(Car car){
        cars[carIndex] = car;
        carIndex += 1;
    }

    public String generateReport(){
        StringBuilder report = new StringBuilder();
        String dump;
        for(int i=0; i<carIndex; i++) {
            dump = cars[i].getName() + " : " + (int) cars[i].getChargeQuantity() + "리터\n";
            report.append(dump);
        }
        return report.toString();
    }
}
