package pro.sky.houses;

public class Gryffindor extends Student {
    private int nobility;
    private int honour;
    private int bravery;

    public Gryffindor(int power, int distance, String name, int nobility, int honour, int bravery) {
        super(power,distance,name);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonour() {
        return honour;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "\nGryffindor{" +
                "name=" + super.getName() +
                ", nobility=" + nobility +
                ", honour=" + honour +
                ", bravery=" + bravery +
                ", power="+ super.getPower() +
                ", distance="+ super.getDistance() +
                "}";
    }


    public void compare(Gryffindor another){
        int sumOfAnotherGriffindor = another.getBravery()+another.getHonour()+another.getNobility();
        int sumOfGriffindor = bravery + honour + nobility;
        if(sumOfGriffindor==sumOfAnotherGriffindor){
            System.out.println(another.getName()+" такой же как и "+super.getName());
        } else if(sumOfGriffindor<sumOfAnotherGriffindor){
            System.out.println(another.getName()+" лучший Гриффиндорец, чем "+super.getName());
        } else {
            System.out.println(super.getName()+" лучший Гриффиндорец, чем "+another.getName());
        }
    }



}
