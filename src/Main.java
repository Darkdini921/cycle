public class Main {
    public static void main(String[] args) {

        // Задача 1

        System.out.println("Задача 1");
        for (int a = 1; a < 11; a++) {
            System.out.println(a);
        }

        // Задача 2

        System.out.println("");   // Добавил эту строку что бы в консоли задачи не сливались
        System.out.println("Задача 2");
        for (int a = 10; a > 0; a--){
            System.out.println(a);
        }

        // Задача 3

        System.out.println("");
        System.out.println("Задача 3");
        for (int a = 0; a < 17; a = a + 2){
            System.out.println(a);
        }

        // Задача 4

        System.out.println("");
        System.out.println("Задача 4");
        for (int a = 10; a > - 11; a--){
            System.out.println(a);
        }

        // Задача 5

        System.out.println("");
        System.out.println("Задача 5");
        for (int year = 1904; year < 2097; year = year + 4){
            System.out.println(year);
        }

        // Задача 6

        System.out.println("");
        System.out.println("Задача 6");
        for (int a = 7; a < 99; a = a + 7){
            System.out.println(a);
        }

        // Задача 7

        System.out.println("");
        System.out.println("Задача 7");
        for (int a = 1; a <= 512; a = a * 2){
            System.out.println(a);
        }

        //Задача 8

        System.out.println("");
        System.out.println("Задача 8");

        int income = 29000;
        int total = 0;
        for (int a = 1; a < 13; a++){
            total = total + income;
            System.out.println("Месяц - " + a + ", сумма накоплений равна " + total + " рублей.");
        }

        // Задача 9
        System.out.println("");
        System.out.println("Задача 9");

        int income2 = 29000;
        int total2 = 0;
        for (int a = 1; a < 13; a++) {
            total2 = (int) (total2 + (total2 * 0.12));
            total2 = total2 + income2;
            System.out.println("Месяц - " + a + ", сумма накоплений равна " + total2 + " рублей.");
        }

        // Задача 10
        System.out.println("");
        System.out.println("Задача 10");


        for (int i = 1; i < 11; i++){
            int x = 2;
            int q = i * x;
            System.out.println(q);
        }
    }
}