public class Monthly extends Appointment {

    public Monthly(String description, int day, int month, int year) {
        super(description, day, month, year);
    }

    @Override
    public boolean occursOn(int day, int month, int year) {
        return super.occursOn(day, month + 1, year);
    }
}