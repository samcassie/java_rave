package People;

public abstract class People {

    private String name;
    private int age;
    private boolean atRave;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
        this.atRave = false;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isAtRave() {
        return atRave;
    }

    public void setAtRave(boolean atRave) {
        this.atRave = atRave;
    }
}
