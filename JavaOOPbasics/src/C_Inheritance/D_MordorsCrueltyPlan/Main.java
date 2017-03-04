package C_Inheritance.D_MordorsCrueltyPlan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] foods = reader.readLine().toLowerCase().trim().split("\\s+");

        Wizard gandalf = new Wizard();
        for (String food : foods) {
            gandalf.eatFood(food);
        }

        System.out.println(gandalf.getHappinessPoints());
        System.out.println(gandalf.getMood());
    }
}
