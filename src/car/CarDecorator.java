package car;

public class CarDecorator implements Car{

    public CarDecorator(Car car) {
        this.car = car;
    }

    protected Car car;

    @Override
    public void assemble() {
        this.car.assemble();

    }
}
