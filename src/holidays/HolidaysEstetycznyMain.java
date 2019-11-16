package holidays;

public class HolidaysEstetycznyMain {
    public static void main(String[] args) {
        HolidaysPlannerEstetyczny planner = new HolidaysPlannerEstetyczny();
        planner.readDestinations();
        planner.display();
    }
}
