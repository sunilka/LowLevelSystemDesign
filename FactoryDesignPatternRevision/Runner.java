package FactoryDesignPatternRevision;

public class Runner {
    public static void main(String args[]){
        ShapesFactory shapesFactory = new ShapesFactory();
        ShapesInterface shapeObj = shapesFactory.getShapesInstance("Circle");
        if(shapeObj!=null){
            shapeObj.draw();
        }
        shapeObj = shapesFactory.getShapesInstance("Triangle");
        if(shapeObj!=null){
            shapeObj.draw();
        }
        shapeObj = shapesFactory.getShapesInstance("Rectangle");
        if(shapeObj!=null){
            shapeObj.draw();
        }
        shapeObj = shapesFactory.getShapesInstance("Oval");
        if(shapeObj!=null){
            shapeObj.draw();
        }
    }
}
