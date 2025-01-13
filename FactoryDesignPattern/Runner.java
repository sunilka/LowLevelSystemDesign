package FactoryDesignPattern;

public class Runner {
    public static void main(String args[]){
        ShapeFactory shapeFactory = new ShapeFactory();
        ShapeInterface shapeObj = shapeFactory.getShapeObject("Circle");
        shapeObj.draw();

        shapeObj = shapeFactory.getShapeObject("Triangle");
        shapeObj.draw();
    }
}
