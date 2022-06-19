package pro.sky.houses;

public class Hufflepuff  extends Student {
    private int industrious;
    private int loyal;
    private int honest;

    public Hufflepuff(int power, int distance, String name, int industrious, int loyal, int honest) {
        super(power, distance, name);
        this.industrious = industrious;
        this.loyal = loyal;
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "\nHufflepuff{" +
                "industrious=" + industrious +
                ", loyal=" + loyal +
                ", honest=" + honest +
                ", power="+ super.getPower() +
                ", distance="+ super.getDistance() +
                "}";
    }

    public int getIndustrious() {
        return industrious;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }


    public void compare(Hufflepuff another){
        int sumOfAnother = another.getHonest()+another.getIndustrious()+another.getLoyal();
        int sumOfCurrent = honest + industrious + loyal;
        if(sumOfCurrent==sumOfAnother){
            System.out.println(another.getName()+" такой же как и "+super.getName());
        } else if(sumOfCurrent<sumOfAnother){
            System.out.println(another.getName()+" лучший Пуффендуец, чем "+super.getName());
        } else {
            System.out.println(super.getName()+" лучший Пуффендуец, чем "+another.getName());
        }
    }
}
