package People;

public class Staff extends People implements IArrive, IGoHome{

    public Staff(String name, int age) {
        super(name, age);
    }

    public void arriveAtRave() {
        this.setAtRave(true);
    }

    public void goHome(){
        this.setAtRave(false);
    }

}
