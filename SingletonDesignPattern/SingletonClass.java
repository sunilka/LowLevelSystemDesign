package SingletonDesignPattern;

public class SingletonClass {
    private static SingletonClass singletonClassInstance;
    private SingletonClass(){}
    public static synchronized SingletonClass getInstance(){
        if(singletonClassInstance == null){
            singletonClassInstance = new SingletonClass();
        }
        return singletonClassInstance;
    }

    public void runner(){
        System.out.println("Dummy print statement");
    }
}

class Runner{
    public static void main(String args[]){
        SingletonClass.getInstance().runner();
    }
}
