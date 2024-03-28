package behavioral_patterns.mediator;

public class CleaningService {

    private FrontDesk frontDesk = new FrontDesk();

    public void getTowers(Integer guestId, int numberOfTowers) {
        String roomNumber = this.frontDesk.getRoomNumbers(guestId);
        System.out.println("provide: " + numberOfTowers + " to " + roomNumber);
    }

}
