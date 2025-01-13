package AbstractFactoryDesignPattern.EdgedShapeFactory;

public class Rectangle implements EdgeShapeInterface{
    public void draw(){
        System.out.println("Inside the edge shaped : Rectangle");
    }
}
