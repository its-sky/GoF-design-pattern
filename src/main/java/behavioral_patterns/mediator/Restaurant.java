package behavioral_patterns.mediator;

import java.time.LocalDateTime;

public class Restaurant {

    private FrontDesk frontDesk = new FrontDesk();


    public void serveDinner(Integer guestId, LocalDateTime dateTime) {
        String roomNumber = this.frontDesk.getRoomNumbers(guestId);
        System.out.println("charge to " + roomNumber);
    }

}
