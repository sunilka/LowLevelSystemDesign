package AbstractFactoryDesignPattern.EdgedShapeFactory;

public class Triangle implements EdgeShapeInterface{
    public void draw(){
        System.out.println("Inside the edge shape : Triangle");
    }
}
