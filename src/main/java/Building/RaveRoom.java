package Building;

public class RaveRoom extends Room{

    private boolean discoBall;

    public RaveRoom(int capacity, int roomNumber) {
        super(capacity, roomNumber);
        this.discoBall = false;
    }

    public boolean isDiscoBall() {
        return discoBall;
    }

    public void turnOnDiscoBall(){
        this.discoBall = true;
    }

    public void turnOffDiscoBall(){
        this.discoBall = false;
    }

}
