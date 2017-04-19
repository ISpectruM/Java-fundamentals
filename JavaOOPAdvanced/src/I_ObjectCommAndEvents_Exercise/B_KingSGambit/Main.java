package I_ObjectCommAndEvents_Exercise.B_KingSGambit;

import I_ObjectCommAndEvents_Exercise.B_KingSGambit.contracts.Attackable;
import I_ObjectCommAndEvents_Exercise.B_KingSGambit.contracts.Defender;
import I_ObjectCommAndEvents_Exercise.B_KingSGambit.models.Footman;
import I_ObjectCommAndEvents_Exercise.B_KingSGambit.models.King;
import I_ObjectCommAndEvents_Exercise.B_KingSGambit.models.RoyalGuard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String kingName = reader.readLine();
        Attackable king = new King(kingName);


        String[] royalGuards = reader.readLine().split(" ");
        for (String name : royalGuards) {
            Defender guard  =new RoyalGuard(name);
            king.register(guard);
        }

        String[] footMans = reader.readLine().split(" ");
        for (String name : footMans) {
            Defender guard = new Footman(name);
            king.register(guard);
        }

        String input;
        while (!"End".equals(input = reader.readLine())){
            String[] tokens = input.split(" ");
            switch (tokens[0]){
                case "Attack":
                    king.alarmForAttack();
                    break;
                case "Kill":
                        king.killGuard(tokens[1]);
                        break;
            }
        }
    }
}
