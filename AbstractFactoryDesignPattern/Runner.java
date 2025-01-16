package AbstractFactoryDesignPattern;

import AbstractFactoryDesignPattern.Buttons.ButtonInterface;
import AbstractFactoryDesignPattern.Factory.MACOSFactory;
import AbstractFactoryDesignPattern.Factory.WindowsFactory;

public class Runner {
    public static void main(String args[]){
        String OS = "mac";
        if(OS == "mac"){
            MACOSFactory factory = new MACOSFactory();
            ButtonInterface button = factory.createButton(); 
            button.paint();
        }
        else{
            WindowsFactory factory = new WindowsFactory();
            ButtonInterface button = factory.createButton();
            button.paint();
        }
    }
}
