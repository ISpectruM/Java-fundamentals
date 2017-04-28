package A_JavaSyntax;

import java.text.MessageFormat;
import java.util.*;

public class L_VehiclePark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> availableVehicles = new ArrayList<String>(Arrays.asList(input.split(" ")));
        int counter = 0;

        while (true){
            input =scanner.nextLine();

            if (input.equals("End of customers!")){
                break;
            }

            String[] orderList = input.split(" ").clone();
            String order = getClientOrder(orderList);

            if(!availableVehicles.contains(order)){
                System.out.println("No");
            }
            else {
                for (int i = 0; i <availableVehicles.size() ; i++) {
                    String currentVeh = availableVehicles.get(i);

                    if (order.equals(currentVeh)){
                        long price = getVehiclePrise(currentVeh);
                        System.out.println(MessageFormat.format("Yes, sold for {0}$",price));
                        counter++;
                        availableVehicles.remove(i);

                        break;
                    }
                }
            }
        }

        System.out.println(MessageFormat.format("Vehicles left: {0}", String.join(", ",availableVehicles)));
        System.out.println(MessageFormat.format("Vehicles sold: {0}", counter));
    }

    private static long getVehiclePrise(String currentVeh) {
        int vehType = currentVeh.charAt(0);
        int seats = Integer.parseInt(currentVeh.substring(1));
        return vehType*seats;
    }

    private static String getClientOrder(String[] orderList) {
        String order="";
        if (orderList[0].equals("Car")){
            order = "c"+orderList[2];
        }
        else if (orderList[0].equals("Bus")){
            order = "b"+orderList[2];
        }
        else if (orderList[0].equals("Van"))
            order = "v"+orderList[2];
        return order;
    }
}
