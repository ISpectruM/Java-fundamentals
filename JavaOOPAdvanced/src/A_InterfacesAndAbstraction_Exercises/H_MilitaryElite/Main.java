package A_InterfacesAndAbstraction_Exercises.H_MilitaryElite;

import A_InterfacesAndAbstraction_Exercises.H_MilitaryElite.Interfaces.*;
import A_InterfacesAndAbstraction_Exercises.H_MilitaryElite.Soldiers.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<Integer,ISoldier> soldiers = new LinkedHashMap<>();

        String input;
        while (!"End".equals(input = reader.readLine())){
            String[] tokens = input.split("\\s+");
            String unit = tokens[0];
            int id = Integer.parseInt(tokens[1]);

            switch (unit){
                case "Private":
                    IPrivate soldier = new Private(id, tokens[2], tokens[3], Double.parseDouble(tokens[4]));
                    soldiers.putIfAbsent(id, soldier);
                    break;
                case "LeutenantGeneral":
                    ILeutenantGeneral leutenantGeneral = new LeutenantGeneral(id, tokens[2], tokens[3], Double.parseDouble(tokens[4]));
                    addPrivateSoldiers(soldiers, tokens, leutenantGeneral);
                    soldiers.putIfAbsent(id,leutenantGeneral);
                    break;
                case "Engineer":
                    IEngineer engineer = new Engineer(id,
                                tokens[2],
                                tokens[3],
                                Double.parseDouble(tokens[4]),
                                tokens[5]);
                    addRepairs(tokens, engineer);
                    if (engineer.getCorps() != null){
                        soldiers.putIfAbsent(id,engineer);
                    }
                    break;
                case "Commando":
                       ICommando commando = new Commando(id,
                                tokens[2],
                                tokens[3],
                                Double.parseDouble(tokens[4]),
                                tokens[5]);
                    if (commando.getCorps() != null){
                        addMissions(tokens, commando);
                        soldiers.putIfAbsent(id,commando);
                    }
                    break;
                case "Spy":
                    ISpy spy = new Spy(id, tokens[2], tokens[3], Integer.parseInt(tokens[4]));
                    soldiers.putIfAbsent(id,spy);
                    break;
            }
        }
        for (ISoldier soldier : soldiers.values()) {
            System.out.println(soldier.toString());
        }

    }

    private static void addMissions(String[] tokens, ICommando commando) {
        for (int i = 6; i < tokens.length-1; i+=2) {
            Mission mission = new Mission(tokens[i],tokens[i+1]);
            if (mission.getState() != null){
                commando.addMission(mission);
            }
        }
    }

    private static void addRepairs(String[] tokens, IEngineer engineer) {
        for (int i = 6; i < tokens.length-1; i+=2) {
                Repair repair = new Repair(tokens[i],Integer.parseInt(tokens[i+1]));
                engineer.addRepair(repair);
        }
    }

    private static void addPrivateSoldiers(LinkedHashMap<Integer, ISoldier> soldiers, String[] tokens, ILeutenantGeneral leutenantGeneral) {
        for (int i = 5; i < tokens.length; i++) {
            int id = Integer.parseInt(tokens[i]);
            if (soldiers.containsKey(id)){
                leutenantGeneral.addPrivate(soldiers.get(id));
            }
        }
    }
}
