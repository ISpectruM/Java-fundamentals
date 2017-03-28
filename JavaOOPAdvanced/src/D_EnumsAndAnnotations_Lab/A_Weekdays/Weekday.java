package D_EnumsAndAnnotations_Lab.A_Weekdays;

/**
 * Created by Iv on 28-Mar-17.
 */
public enum Weekday {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY, FRIDAY, SATURDAY,SUNDAY;

    @Override
    public String toString() {
        return super.name().replace(super.name().substring(1), super.name().substring(1).toLowerCase());
    }
}
