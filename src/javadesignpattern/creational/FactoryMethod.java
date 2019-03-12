package javadesignpattern.creational;

// Interface product.
interface Shape{
    double area();
    double perimeter();
}

// Set first product that implement interface.
class Circle implements Shape{

    // Set private variables.
    private final double r;
    
    public Circle(double r){
        this.r = r;
    }
    
    // Method from interface.
    @Override
    public double area() {
        return Math.PI * (this.r * this.r);
    }

    // Method from interface.
    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }
}

// Set second product that implement interface.
class Triangle implements Shape{
    
    // Set private variables.
    private final double h, a, b, c;

    public Triangle(double h, double a, double b, double c) {
        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Method from interface.
    @Override
    public double area() {
        return 0.5 * h * b;
    }

    // Method from interface.
    @Override
    public double perimeter() {
        return a + b + c;
    }
}

/*
Factory Method is neccesary when we want to create objects as a template or
and technically an interface and other subclasses will implemented.
    
Implementation Level: Easy.
*/
public class FactoryMethod {
    
    // Experiment data.
    private final Circle circle;
    private final Triangle triangle;
    
    // Experiment method.
    public FactoryMethod(double r, double h, double a, double b, double c){
        this.circle = new Circle(r);
        this.triangle = new Triangle(h, a, b, c);
    }
    
    // Experiment method to get all shape areas.
    public double[] getShapeArea(){
        double[] areas = new double[2];
        areas[0] = circle.area();
        areas[1] = triangle.area();
        return areas;
    }
    
    // Experiment method to get all shape perimeters.
    public double[] getShapePerimeter(){
        double[] perimeters = new double[2];
        perimeters[0] = circle.perimeter();
        perimeters[1] = triangle.perimeter();
        return perimeters;
    }
}
