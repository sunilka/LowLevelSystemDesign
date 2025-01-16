package AbstractFactoryDesignPattern.Factory;

import AbstractFactoryDesignPattern.Buttons.ButtonInterface;
import AbstractFactoryDesignPattern.Buttons.MACOSButton;
import AbstractFactoryDesignPattern.CheckBoxes.CheckBoxesInterface;
import AbstractFactoryDesignPattern.CheckBoxes.MACOSCheckBoxes;

public class MACOSFactory implements AbstractFactory{
    public ButtonInterface createButton(){
        return new MACOSButton();
    }
    public CheckBoxesInterface createCheckBoxes(){
        return new MACOSCheckBoxes();
    }
}
