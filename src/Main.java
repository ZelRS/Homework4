public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        byte age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия и нужно немного подождать.");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        byte temperature = 5;
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов(а). \nМожно идти без шапки.");
        }
         else if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов(а). \nНужно надеть шапку.");
        }
        else {
            System.out.println("Температура равна " + temperature + " граудусов(а). \nМожно идти, как в шапке, так и без нее.");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        short speed = 50;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, придется заплатить штраф.");
        }
        else {
            System.out.println("Если скорость " + speed + " км/ч, можно ездить спокойно.");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte age = 24;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        }
        else if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        }
        else if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        }
        else if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то он пока слишком мал, чтобы куда-то ходить.");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte age = 13;
        boolean withAdult = true;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        }
        else if (age >= 5 && age < 14 && withAdult) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        else if (age >= 5 && age < 14) {
            System.out.println("Без сопровождения взрослого кататься нельзя.");
        }
        else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        short numberOfPersons = 71;
        if (numberOfPersons < 60) {
            System.out.println("Вагоне есть сидячее место.");
        }
        else if (numberOfPersons >= 60 && numberOfPersons < 102) {
            System.out.println("В вагоне нет сидячих мест, но есть стоячие места.");
        }
        else {
            System.out.println("В вагоне нет мест.");
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one = 697;
        int two = 576;
        int three = 756;
        if (one > two && one > three) {
            System.out.println("Число " + one + " самое большое.");
        }
        else if (two > one && two > three) {
            System.out.println("Число " + two + " самое большое.");
        }
        else {
            System.out.println("Число " + three + " самое большое.");
        }
    }
}