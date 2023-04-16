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
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 4;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int preschooler = 2;
        if (preschooler >= 2 && preschooler <= 6) {
            System.out.println("Если возраст человека равен " + preschooler + ", то ему нужно ходить в детский сад");
        }
        int schoolboy = 7;
        if (schoolboy >= 7 && schoolboy <= 18) {
            System.out.println("Если возраст человека равен " + schoolboy + ", то ему нужно ходить в школу");
        }
        int student = 19;
        if (student > 18 && student < 24) {
            System.out.println("Если возраст человека равен " + student + ", то ему нужно ходить в университет");
        }
        int employee = 25;
        if (employee > 24) {
            System.out.println("Если возраст человека равен " + employee + ", то ему нужно ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 11;
        if (age <= 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else {
            if (age <= 14) {
                System.out.println("Если возраст ребенка равен " + age + ", то он может кататься на аттракционе в сопровождении взрослых");
            } else {
                System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int wantToStand = 10;
        int wantToSit = 10;
        int passengers = wantToStand + wantToSit;
        int trainCar = 102;

        int sit = 60;
        int toStand = 42;
        int seating = sit - wantToSit;
        int handrails = toStand - wantToStand;
        if (passengers >= trainCar) {
            System.out.println("Вагон уже полностью забит");
        } else {
            if (seating == 0) {
                System.out.println("В вагоне сидячих мест нет , но есть " + handrails + " стоячих");
            } else {
                if (handrails == 0) {
                    System.out.println("В вагоне стоячих мест нет , но есть " + seating + " сидячих");
                } else {
                    if (wantToSit > sit) {
                        System.out.println("В вагоне " + seating + " пассажиров не нашли сидячих мест, но есть " + handrails + " стоячих");
                    } else {
                        if (wantToStand > toStand) {
                            System.out.println("В вагоне " + seating + " пассажиров не нашли стоячих мест, но есть " + handrails + " сидячих");
                        } else {
                            System.out.println("В вагоне есть " + seating + " сидячих и " + handrails + " стоячих мест");
                        }
                    }
                }
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int a = 200;
        int b = 102;
        int c = 300;
        if (a > b && a > c) {
            System.out.println("Значение " + a + " больше значений " + b + " и " + c);
        } else {
            if (b > a && b > c) {
                System.out.println("Значение " + b + " больше значений " + a + " и " + c);
            } else {
                if (c > a && c > b) {
                    System.out.println("Значение " + c + " больше значений " + a + " и " + b);
                }
            }
        }
    }
}