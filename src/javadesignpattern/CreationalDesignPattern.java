package javadesignpattern;

import javadesignpattern.creational.FactoryMethod;
import javadesignpattern.creational.Singleton;

public class CreationalDesignPattern {
    
    // Singleton Design Pattern.
    public String getRandomNumber(){
        Singleton singleton = Singleton.getInstance();
        return String.valueOf(singleton.getRandomNumber());
    }
    
    // Factory Method Design Pattern.
    public String getShapeGeometry(){
        FactoryMethod factoryMethod = new FactoryMethod(2, 2, 2, 2, 2);
        double[] shapeArea = factoryMethod.getShapeArea();
        double[] shapePerimeter = factoryMethod.getShapePerimeter();
        return "Area (C: " + shapeArea[0] + " and T: " 
                + shapeArea[1] + "). Perimeter (C: " + shapePerimeter[0] 
                + " and T: " + shapePerimeter[1] + ").";
    } 
}
