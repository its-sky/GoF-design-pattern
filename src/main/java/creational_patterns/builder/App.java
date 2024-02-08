package creational_patterns.builder;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        TourDirector tourDirector = new TourDirector(new DefaultTourBuilder());
        TourPlan cancunTrip = tourDirector.cancunTrip();
        TourPlan longBeachTrip = tourDirector.longBeachTrip();
    }
}
