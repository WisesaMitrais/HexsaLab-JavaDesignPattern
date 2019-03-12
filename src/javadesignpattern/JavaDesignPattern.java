package javadesignpattern;

import javadesignpattern.creational.CreationalDesignPattern;

public class JavaDesignPattern {

    public static void main(String[] args) {
        System.out.println("Java Design Pattern | @HexsaLab 2019.\n");
        
        CreationalDesignPattern cdp = new CreationalDesignPattern();
        System.out.println("Creational Design Pattern.");
        System.out.println("Singleton Experiment Result: " + cdp.getNumberFromSingletonClass());
    }    
}
