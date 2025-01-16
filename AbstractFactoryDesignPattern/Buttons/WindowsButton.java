package AbstractFactoryDesignPattern.Buttons;

public class WindowsButton implements ButtonInterface{
    public void paint(){
        System.out.print("You are inside the Windows Button class");
    }
}
