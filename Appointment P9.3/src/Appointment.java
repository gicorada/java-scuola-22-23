public class Appointment {
    private final String description;
    private final int day;
    private final int month;
    private final int year;

    public Appointment(String description, int day, int month, int year) {
        this.description = description;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean occursOn(int day, int month, int year) {
        return (this.day == day && this.month == month && this.year == year);
    }

    @Override
    public String toString() {
        return "Appuntamento " + this.getClass().getName() + " {" + description + " il " + day + "/" + month + "/" + year + '}';
    }
}