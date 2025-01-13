package AbstractFactoryDesignPattern.AbstractFactory;

import AbstractFactoryDesignPattern.EdgedShapeFactory.EdgeShapeFactory;

public class AbstractFactory {
    public EdgeShapeFactory getObject(){
        return new EdgeShapeFactory();
    }
}
