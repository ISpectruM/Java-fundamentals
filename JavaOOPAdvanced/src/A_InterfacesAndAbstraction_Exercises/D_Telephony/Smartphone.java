package A_InterfacesAndAbstraction_Exercises.D_Telephony;

public class Smartphone implements Callable, Webable{

    public Smartphone() {
    }

    @Override
    public String browseWeb(String address) {
        if (!address.matches(".*\\d+.*")){
            return String.format("Browsing: %s!", address);
        }else {
            return "Invalid URL!";
        }
    }

    @Override
    public String makeCall(String phone) {
        try{
            for (Object digit : phone.toCharArray()) {
                int num = Integer.parseInt(digit.toString());
            }
            return String.format("Calling... %s", phone);

        }catch (IllegalArgumentException e){
            return "Invalid number!";
        }
    }
}
