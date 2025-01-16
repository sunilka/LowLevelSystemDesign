package AbstractFactoryDesignPattern.Factory;

import AbstractFactoryDesignPattern.Buttons.ButtonInterface;
import AbstractFactoryDesignPattern.Buttons.WindowsButton;
import AbstractFactoryDesignPattern.CheckBoxes.CheckBoxesInterface;
import AbstractFactoryDesignPattern.CheckBoxes.WindowsCheckBoxes;

public class WindowsFactory implements AbstractFactory{
    public ButtonInterface createButton(){
        return new WindowsButton();
    }
    public CheckBoxesInterface createCheckBoxes(){
        return new WindowsCheckBoxes();
    }

}
