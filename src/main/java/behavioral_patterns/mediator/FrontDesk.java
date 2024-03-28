package behavioral_patterns.mediator;

import java.time.LocalDateTime;

public class FrontDesk {

    private CleaningService cleaningService = new CleaningService();
    private Restaurant restaurant = new Restaurant();

    public void getTowers(Guest guest, int numberOfTowers) {
        cleaningService.getTowers(guest.getId(), numberOfTowers);
    }

    public String getRoomNumbers(Integer guestId) {
        return "1234";
    }

    public void dinner(Guest guest, LocalDateTime dateTime) {
        this.restaurant.serveDinner(guest.getId(), dateTime);
    }
}
