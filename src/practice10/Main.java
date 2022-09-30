package practice10;

public class Main {
    public static void main(String[] args) {
        ConcreteFactory c = new ConcreteFactory();
        Complex ch1 = c.CreateComplex(10, 5);
        System.out.println(ch1);
        Complex ch2 = c.createComplex();
        System.out.println(ch2);
        ChairFactory cf = new ChairFactory();
        FunctionalChair fc = cf.createFunctionalChair();
        System.out.println(fc.sum(10, 2));
        MagicChair mc = cf.createMagicChair();
        mc.doMagic();
        VictorianChair vc = cf.createVictorianChair();
        System.out.println(vc.getAge());
    }
}
