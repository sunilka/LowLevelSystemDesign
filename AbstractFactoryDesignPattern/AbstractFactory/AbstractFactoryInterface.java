package AbstractFactoryDesignPattern.AbstractFactory;

import AbstractFactoryDesignPattern.EdgedShapeFactory.EdgeShapeFactory;
import AbstractFactoryDesignPattern.RoundedShapeFactory.RoundedShapeFactory;

public interface AbstractFactoryInterface {
    public EdgeShapeFactory edgeShape();
    public RoundedShapeFactory roundedShape();
}
