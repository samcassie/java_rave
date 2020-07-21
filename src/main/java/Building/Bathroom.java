package Building;

public class Bathroom extends Room{

    private int toilets;

    public Bathroom(int capacity, int roomNumber, int toilets) {
        super(capacity, roomNumber);
        this.toilets = toilets;
    }

    public int getToilets() {
        return toilets;
    }
}
