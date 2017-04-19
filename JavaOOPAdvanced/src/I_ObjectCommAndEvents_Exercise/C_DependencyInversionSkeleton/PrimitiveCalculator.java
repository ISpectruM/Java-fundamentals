package I_ObjectCommAndEvents_Exercise.C_DependencyInversionSkeleton;


import I_ObjectCommAndEvents_Exercise.C_DependencyInversionSkeleton.operations.AdditionStrategy;
import I_ObjectCommAndEvents_Exercise.C_DependencyInversionSkeleton.operations.Strategy;

import java.util.HashMap;
import java.util.Map;

public class PrimitiveCalculator {

    private Strategy currentStrategy;
    private Map<Character, Strategy> strategies;

    public PrimitiveCalculator(AdditionStrategy addition){
        this.strategies = new HashMap<>();
        this.setInitialStrategy(addition);
    }

    public void setInitialStrategy(Strategy currentStrategy) {
        this.currentStrategy = currentStrategy;
        this.strategies.put('+',currentStrategy);
    }

    public void addStrategy(Character sign, Strategy strategy){
        this.strategies.put(sign,strategy);
    }

    public void changeStrategy(char operator){
        this.currentStrategy = this.strategies.get(operator);
    }

    public int performCalculation(int firstOperand,int secondOperand){
        return this.currentStrategy.Calculate(firstOperand,secondOperand);
    }
}
