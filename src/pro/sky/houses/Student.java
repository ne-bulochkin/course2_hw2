package pro.sky.houses;


public class Student {
    private int power;
    private int distance;
    private String name;

    public Student(int power, int distance, String name) {
        this.power = power;
        this.distance = distance;
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public int getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }

    public void comparePower(Student student){
        if( student.getPower() == this.getPower()) System.out.println(this.getName() + " равен по силе магии с "+student.getName());
        else if( student.getPower() < this.getPower()) System.out.println(this.getName() + " сильнее по силе магии чем "+student.getName());
        else if( student.getPower() > this.getPower()) System.out.println(student.getName() + " сильнее по силе магии чем "+this.getName());

        if( student.getDistance() == this.getDistance()) System.out.println(this.getName() + " равен по расстоянию трансгрессии с "+student.getName());
        else if( student.getDistance() < this.getDistance()) System.out.println(this.getName() + " сильнее по расстоянию трансгрессии чем "+student.getName());
        else if( student.getDistance() > this.getDistance()) System.out.println(student.getName() + " сильнее по расстоянию трансгрессии чем "+this.getName());
    }

}
