package StrategyDesignPattern;

public class Subtract implements Strategy{
    public int calculate(int no1, int no2){
        return (no1-no2);
    }
}