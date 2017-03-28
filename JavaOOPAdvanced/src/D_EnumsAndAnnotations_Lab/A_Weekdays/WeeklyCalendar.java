package D_EnumsAndAnnotations_Lab.A_Weekdays;

import java.util.TreeSet;

public class WeeklyCalendar {
    private TreeSet<WeeklyEntry> entries;

    public WeeklyCalendar() {
        this.entries = new TreeSet<>();
    }

    public void addEntry(String weekday, String notes){
        WeeklyEntry weeklyEntry = new WeeklyEntry(weekday, notes);
        this.entries.add(weeklyEntry);
    }

    public Iterable<WeeklyEntry> getWeeklySchedule(){
        return entries;
    }
}
