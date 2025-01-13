package AbstractFactoryDesignPattern.EdgedShapeFactory;

public class EdgeShapeFactory {
    public EdgeShapeInterface getObject(String shape){
        if(shape == "Triangle"){
            return new Triangle();
        }
        else if(shape == "Rectangle"){
            return new Rectangle();
        }
        else{
            return null;
        }
    }
}
