package pro.sky.houses;

public class Ravenclaw extends Student {
    private int smart;
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(int power, int distance, String name, int smart, int wise, int witty, int creative) {
        super(power, distance, name);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    @Override
    public String toString() {
        return "\nRavenclaw{" +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creative=" + creative +
                ", power="+ super.getPower() +
                ", distance="+ super.getDistance() +
                "}";
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreative() {
        return creative;
    }

    public void compare(Ravenclaw another){
        int sumOfAnother = another.getCreative()+another.getSmart()+another.getWise()+another.getWitty();
        int sumOfCurrent = creative + smart + wise + witty;
        if(sumOfCurrent==sumOfAnother){
            System.out.println(another.getName()+" такой же как и "+super.getName());
        } else if(sumOfCurrent<sumOfAnother){
            System.out.println(another.getName()+" лучший Когтевранец, чем "+super.getName());
        } else {
            System.out.println(super.getName()+" лучший Когтевранец, чем "+another.getName());
        }
    }
}
