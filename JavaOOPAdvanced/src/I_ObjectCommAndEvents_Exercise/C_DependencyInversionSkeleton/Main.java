package I_ObjectCommAndEvents_Exercise.C_DependencyInversionSkeleton;

import I_ObjectCommAndEvents_Exercise.C_DependencyInversionSkeleton.operations.AdditionStrategy;
import I_ObjectCommAndEvents_Exercise.C_DependencyInversionSkeleton.operations.DivideStrategy;
import I_ObjectCommAndEvents_Exercise.C_DependencyInversionSkeleton.operations.MultiplyStrategy;
import I_ObjectCommAndEvents_Exercise.C_DependencyInversionSkeleton.operations.SubtractionStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        PrimitiveCalculator calculator = new PrimitiveCalculator(new AdditionStrategy());
        calculator.addStrategy('-',new SubtractionStrategy());
        calculator.addStrategy('/', new DivideStrategy());
        calculator.addStrategy('*', new MultiplyStrategy());

        String input;
        while (!"End".equals(input = reader.readLine())){
            String[] tokens = input.split(" ");

            if (tokens[0].equals("mode")){
                calculator.changeStrategy(tokens[1].charAt(0));
            } else {
                System.out.println(calculator.performCalculation(
                        Integer.parseInt(tokens[0]),
                        Integer.parseInt(tokens[1])));
            }
        }
    }
}
