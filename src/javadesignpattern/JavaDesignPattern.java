package javadesignpattern;

public class JavaDesignPattern {

    public static void main(String[] args) {
        System.out.println("Java Design Pattern | @HexsaLab 2019.\n");
        
        CreationalDesignPattern cdp = new CreationalDesignPattern();
        System.out.println("Creational Design Pattern.");
        System.out.println("Singleton Experiment Result: " 
                + cdp.getRandomNumber());
        System.out.println("Factory Method Experiment Result: " 
                + cdp.getShapeGeometry());
    }    
}
