package pro.sky.houses;

public class Slytherin extends Student {
    private int cunning;
    private int decisive;
    private int ambitious;
    private int resourceful;
    private int overbearing;

    public Slytherin(int power, int distance, String name, int cunning, int decisive, int ambitious, int resourceful, int overbearing) {
        super(power, distance, name);
        this.cunning = cunning;
        this.decisive = decisive;
        this.ambitious = ambitious;
        this.resourceful = resourceful;
        this.overbearing = overbearing;
    }

    @Override
    public String toString() {
        return "\nSlytherin{" +
                "cunning=" + cunning +
                ", decisive=" + decisive +
                ", ambitious=" + ambitious +
                ", resourceful=" + resourceful +
                ", overbearing=" + overbearing +
                ", power="+ super.getPower() +
                ", distance="+ super.getDistance() +
                "}";
    }

    public int getCunning() {
        return cunning;
    }

    public int getDecisive() {
        return decisive;
    }

    public int getAmbitious() {
        return ambitious;
    }

    public int getResourceful() {
        return resourceful;
    }

    public int getOverbearing() {
        return overbearing;
    }

    public void compare(Slytherin another){
        int sumOfAnother = another.getAmbitious()+another.getCunning()+another.getOverbearing()+another.getResourceful();
        int sumOfCurrent = ambitious + cunning + overbearing + resourceful;
        if(sumOfCurrent==sumOfAnother){
            System.out.println(another.getName()+" такой же как и "+super.getName());
        } else if(sumOfCurrent<sumOfAnother){
            System.out.println(another.getName()+" лучший Слизеренец, чем "+super.getName());
        } else {
            System.out.println(super.getName()+" лучший Слизеренец, чем "+another.getName());
        }
    }
}
