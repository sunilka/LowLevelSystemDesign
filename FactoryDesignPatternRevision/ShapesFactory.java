package FactoryDesignPatternRevision;

public class ShapesFactory {
    public ShapesInterface getShapesInstance(String input){
        if(input == "Triangle"){
            return new Triangle();
        }
        else if(input == "Circle"){
            return new Circle();
        }
        else if(input == "Rectangle"){
            return new Rectangle();
        }
        else{
            return null;
        }
    }
}
