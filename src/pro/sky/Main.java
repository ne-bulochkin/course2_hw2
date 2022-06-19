package pro.sky;

import pro.sky.houses.*;

public class Main {

    public static void main(String[] args) {
        Hogwarts hogwarts = new Hogwarts();

        Gryffindor potter = new Gryffindor(33,11,"Гарри Поттер",35,99,88);
        Gryffindor germiona = new Gryffindor(3,444,"Гермиона Грейнджер",65,74,77);
        Gryffindor ron = new Gryffindor(54,123,"Рон Уизли ",16,15,64);

        Slytherin malfoy = new Slytherin(61,123,"Драко Малфой",23,30,30,22,26);
        Slytherin grehem = new Slytherin(15,3,"Грэхэм Монтегю",30,21,61,30,36);
        Slytherin goil = new Slytherin(24,34,"Грегори Гойл",65,30,12,75,46);

        Hufflepuff smit = new Hufflepuff(10,14,"Захария Смит",26,33,75);
        Hufflepuff sedrik = new Hufflepuff(9,1,"Седрик Диггори",16,63,26);
        Hufflepuff jastin = new Hufflepuff(8,53,"Джастин Финч-Флетчли",3,42,56);

        Ravenclaw chang = new Ravenclaw(44,20,"Чжоу Чанг",1,99,23,1);
        Ravenclaw padma = new Ravenclaw(21,20,"Падма Патил",23,15,64,42);
        Ravenclaw marcus = new Ravenclaw(11,20,"Маркус Белби",1,1,2,5);

        hogwarts.add(potter);
        hogwarts.add(germiona);
        hogwarts.add(ron);
        hogwarts.add(malfoy);
        hogwarts.add(grehem);
        hogwarts.add(goil);
        hogwarts.add(smit);
        hogwarts.add(sedrik);
        hogwarts.add(jastin);
        hogwarts.add(chang);
        hogwarts.add(padma);
        hogwarts.add(marcus);

        //вывод одного студента с их характеристиками
        System.out.println(potter);

        //вывод всех студентов с их характеристиками
        System.out.println(hogwarts);

        // сравнение 2х персонажей с 1 факультета
        potter.compare(germiona);

        // сравнение 2х персонажей с разных факультетов
        potter.comparePower(malfoy);
    }
}
