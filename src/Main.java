import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();



    }

    private static void task1() {
        System.out.println("задача 1");
         int age = 18;
         if (age >= 18) {
             System.out.println(" Если возраст человека равен " + age + " он совершенолетний");
         } else {
             System.out.println(" Если возраст человека меньше " + age +"  он не достиг совершеннолетия, нужно немного подождать");
         }
    }

    private static void task2() {
        System.out.println(" Задача 2");
        int degree = 10;
        if (degree <= 5) {
            System.out.println("На улице " + degree + " нужно надеть шабку");
        } else {
            System.out.println(" на улице "+ degree + " можно идти без шабки");


        }

    }

    private static void task3() {
        System.out.println(" Задача 3");
        int speed = 50;
        if ( speed <= 60) {
            System.out.println("Если скорость " + speed + " можно ездить спокойной ");
        } else {
            System.out.println(" Если скорость" + speed + " придеться заплатить штраф");

            }

        }



    private static void task4() {
        System.out.println(" Задача 4");
        int age = 19;
        boolean Kindergarten =  age > 2 && age < 6 ;
        if (Kindergarten) {
            System.out.println(" Если возраст человека равен" + age + "то ему нужно ходить в детский сад");
        } else {
            boolean school = age >= 7 && age <= 18;
            if (school) {
                System.out.println("Усли возраст человека равен " + age + " то ему нужно ходить в школу");
            } else {
                boolean university = age > 18 && age <= 24 ;
                if ( university) {
                    System.out.println(" Если возраст человека равен "+ age + " то ему нужно ходит в университет");
                } else {
                    boolean work = age > 24;
                    if (work) {
                        System.out.println(" Если возраст человека равен  "+ age + " то ему нужно ходить на работу");
                    }
                }
            }

        }


    }

    private static void task5() {
        System.out.println(" Задача 5 ");
        int age = 20;
        boolean forbidden = age <= 5;
        if (age > 5 && age <= 14) {
            System.out.println(" Если возраст ребенка равен " + age + " можно кататься на аттракционе в сопровождении");
        }
        if (forbidden) {
            System.out.println(" Если возраст ребенка равен " + age + " то ему нельзя кататься на аттракционе");
        }
        boolean can = age > 14;
        if (can) {
            System.out.println(" Если возраст ребенка равен " + age + " то ему можно кататься без сопровождения");
        }
    }












    private static void task6() {
        System.out.println(" Задача 6 ");
        int purchasedTickets = 12 ;
        boolean thereAreplaces = 1 <= purchasedTickets && purchasedTickets < 120;
        if (thereAreplaces){
            System.out.println(" В вагоне есть места ");
        }
        boolean sedentary = purchasedTickets < 60 && 1 <= purchasedTickets ;
        if (sedentary) {
            System.out.println(" В вагоне есть сидячие места");
        } else {
            boolean standing = purchasedTickets >= 60 && purchasedTickets < 120;
            if (standing) {
                System.out.println(" В вагоне есть стоячие места");
            } else {
                boolean clogged = purchasedTickets >= 120 ;
                if (clogged) {
                    System.out.println( " В вагонет нет мест");
                }
            }
        }

    }

    private static void task7() {
        System.out.println(" Задача 7 ");
        int one = 1;
        int two = 2;
        int free = 3 ;
        if ( one > two && one > free) {
            System.out.println( " первое число больше ");
        } else {
            if (two > one && two > free ) {
                System.out.println( " второе число больше");
            } else {
                if ( free > one && free > two ) {
                    System.out.println( "третье число больше");
                }
            }
        }

    }
}