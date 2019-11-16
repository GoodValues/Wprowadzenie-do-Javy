package holidays;

public class HolidaysMain {
    public static void main(String[] args) {
        HolidaysPlanner planner = new HolidaysPlanner();
        planner.readDestinations();
        planner.display();
    }
}
