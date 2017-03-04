package C_Inheritance.C_Mankind;

public class Worker extends Human{
    private double weekSalary;
    private double workHours;

    public Worker(String firstName, String lastName,double weekSalary, double workHours) {
        super(firstName,lastName);
        this.setWeekSalary(weekSalary);
        this.setWorkHours(workHours);
    }

    public double getWeekSalary() {
        return this.weekSalary;
    }

    private void setWeekSalary(double weekSalary) {
        if (weekSalary <10){
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.weekSalary = weekSalary;
    }

    public double getWorkHours() {
        return this.workHours;
    }

    private void setWorkHours(double workHours) {
        if (workHours < 1 || workHours > 12){
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
        this.workHours = workHours;
    }

    private double moneyPerHour(){
        return this.getWeekSalary()/7/this.getWorkHours();
    }

    @Override
    protected void setLastName(String lastName){
        if (lastName == null || lastName.trim().length()<4){
            throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
        }
        super.setLastName(lastName);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("First Name: ").append(this.getFirstName())
                .append(System.lineSeparator())
                .append("Last Name: ").append(this.getLastName())
                .append(System.lineSeparator())
                .append("Week Salary: ").append(String.format("%.2f",this.getWeekSalary()))
                .append(System.lineSeparator())
                .append("Hours per day: ").append(String.format("%.2f",this.getWorkHours()))
                .append(System.lineSeparator())
                .append("Salary per hour: ").append(String.format("%.2f",this.moneyPerHour()))
                .append(System.lineSeparator());
        return sb.toString();
    }
}
