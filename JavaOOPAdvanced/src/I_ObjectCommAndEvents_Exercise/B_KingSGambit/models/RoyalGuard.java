package I_ObjectCommAndEvents_Exercise.B_KingSGambit.models;

import I_ObjectCommAndEvents_Exercise.B_KingSGambit.contracts.Defender;

public class RoyalGuard extends Unit implements Defender {


    public RoyalGuard(String name) {
        super(name);
    }


    @Override
    public void update() {
        System.out.printf("Royal Guard %s is defending!%n", super.getName());
    }
}
