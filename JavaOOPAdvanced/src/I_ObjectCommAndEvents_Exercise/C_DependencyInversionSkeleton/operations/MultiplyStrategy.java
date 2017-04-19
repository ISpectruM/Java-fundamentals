package I_ObjectCommAndEvents_Exercise.C_DependencyInversionSkeleton.operations;

public class MultiplyStrategy implements Strategy {

    @Override
    public int Calculate(int firstOperand, int secondOperand) {
        return firstOperand * secondOperand;
    }
}
