package StrategyDesignPattern;

public class Context {
    Strategy strategy;

    void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    int run(int no1, int no2){
        return this.strategy.calculate(no1, no2);
    }
}
