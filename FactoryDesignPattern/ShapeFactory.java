package FactoryDesignPattern;

public class ShapeFactory {
    public ShapeInterface getShapeObject(String input){
        if(input == "Circle"){
            return new Circle();
        }
        else if(input == "Triangle"){
            return new Triangle();
        }
        else if(input == "Rectangle"){
            return new Rectangle();
        }
        else{
            return null;
        }
    }
}
