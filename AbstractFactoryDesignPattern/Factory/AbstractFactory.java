package AbstractFactoryDesignPattern.Factory;

import AbstractFactoryDesignPattern.Buttons.ButtonInterface;
import AbstractFactoryDesignPattern.CheckBoxes.CheckBoxesInterface;

public interface AbstractFactory {
    public ButtonInterface createButton();
    public CheckBoxesInterface createCheckBoxes();
}
