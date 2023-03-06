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

    public static void task1() {
        System.out.println("Задача 1.");
        int age = 18;
        if (age >= 19) {
            System.out.println("Если возраст человека равен " + age + " лет, он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " лет,он не достиг совершеннолетия, нужно немного подождать.");
        }
    }
    public static void task2() {
        System.out.println("Задача 2.");
        int temperature = 10;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов,нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов,можно идти без шапки.");
        }
    }
    public static void task3() {
        System.out.println("Задача 3.");
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придётся заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, можно ездить спокойно.");
        }
    }
    public static void task4() {
        System.out.println("Задача 4.");
        int age = 20;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно быть дома с мамой.");
        }
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в садик.");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        }
        if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        }
        if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5.");
        int age = 12;
        boolean withAdult = false;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        }
        if (age >=5 && age <14 && withAdult) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            if (age >=5 && age <14 && !withAdult) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе, нет сопровождающего взрослого.");
        }
        if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
    }
    }

    public static void task6() {
        System.out.println("Задача 6.");
    }

    public static void task7() {
        System.out.println("Задача 7.");
    }
}