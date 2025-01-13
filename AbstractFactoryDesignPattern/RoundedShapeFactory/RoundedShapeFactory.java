package AbstractFactoryDesignPattern.RoundedShapeFactory;

public class RoundedShapeFactory {
    public RoundedShapeInterface getObject(String shape){
        if(shape == "Circle"){
            return new Circle();
        }
        else if(shape == "Oval"){
            return new Oval();
        }
        else{
            return null;
        }
    }
}
