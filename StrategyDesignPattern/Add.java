package StrategyDesignPattern;

public class Add implements Strategy{
    public int calculate(int no1, int no2){
        return (no1+no2);
    }
}
