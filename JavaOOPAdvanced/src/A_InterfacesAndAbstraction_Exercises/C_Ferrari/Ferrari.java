package A_InterfacesAndAbstraction_Exercises.C_Ferrari;

public class Ferrari implements Car{
    private String driverName;

    public Ferrari(String driverName) {
        this.setDriverName(driverName);
    }


    public String getDriverName() {
        return this.driverName;
    }

    private void setDriverName(String driverName) {
        this.driverName = driverName;
    }


    @Override
    public String useBrakes() {
        return "Brakes!";
    }

    @Override
    public String accelerate() {
        return "Zadu6avam sA!";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s",
                Car.CAR_NAME,
                this.useBrakes(),
                this.accelerate(),
                this.getDriverName());
    }
}
