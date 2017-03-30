package D_EnumsAndAnnotations_Lab.J_TrafficLights;

public class Light {
    private TrafficLights light;

    public Light(String light) {
        this.light = TrafficLights.valueOf(light);
    }

    public void changeLight(){
//        if (this.light.name().equals("YELLOW")){
//            this.light = TrafficLights.RED;
//        } else if(this.light.name().equals("RED")){
//            this.light = TrafficLights.GREEN;
//        }else {
//            this.light = TrafficLights.YELLOW;
//        }

        int currIndex = this.light.ordinal();
        TrafficLights[] lights = TrafficLights.values();
        this.light = lights[(currIndex+1) % 3];
    }

    @Override
    public String toString() {
        return this.light.name();
    }
}
