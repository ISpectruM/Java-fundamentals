package I_ObjectCommAndEvents_Exercise.C_DependencyInversionSkeleton.operations;

public class SubtractionStrategy implements Strategy {
    public int Calculate(int firstOperand, int secondOperand){
        return firstOperand - secondOperand;
    }
}
