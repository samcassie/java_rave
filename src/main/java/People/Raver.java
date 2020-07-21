package People;

public class Raver extends People implements IGoHome, IArrive{

    public Raver(String name, int age) {
        super(name, age);
    }

    public void arriveAtRave() {
        this.setAtRave(true);
    }

    public void goHome(){
        this.setAtRave(false);
    }

    public String scream(){
        return "Wooo!";
    }
}
