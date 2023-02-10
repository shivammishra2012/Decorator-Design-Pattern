package car;

public class Tester {

    public static void main(String [] args)
    {
        Car sportscar=new SportsCar(new BasicsCar());
        sportscar.assemble();


        Car luxurycar=new LuxuryCar(new BasicsCar());
        luxurycar.assemble();
    }
}
