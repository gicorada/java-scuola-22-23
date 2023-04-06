public class Daily extends Appointment {

    public Daily(String description, int day, int month, int year) {
        super(description, day, month, year);
    }

    @Override
    public boolean occursOn(int day, int month, int year) {
        return super.occursOn(day + 1, month, year);
    }
}