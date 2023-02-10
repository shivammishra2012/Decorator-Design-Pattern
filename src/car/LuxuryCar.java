package car;

public class LuxuryCar extends CarDecorator{
    public LuxuryCar(Car car) {
        super(car);
    }
    @Override
    public void assemble()
    {
        super.assemble();
        System.out.println("adding features of Luxury car");
    }
}
