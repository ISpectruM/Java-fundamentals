package I_ObjectCommAndEvents_Exercise.B_KingSGambit.models;

import I_ObjectCommAndEvents_Exercise.B_KingSGambit.contracts.Defender;

public class Footman extends Unit implements Defender {

    public Footman(String name) {
        super(name);
    }

    @Override
    public void update() {
        System.out.printf("Footman %s is panicking!%n", super.getName());
    }
}
