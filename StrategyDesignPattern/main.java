package StrategyDesignPattern;

public class main {
    public static void main(String args[]){
        System.out.println("Executing the code");
        Context context = new Context();
        int a = 10;
        int b = 20;
        String action = "Addition";
        if(action == "Addition"){
            context.setStrategy(new Add());
            System.out.println(context.run(a, b));
        }
    }
}
