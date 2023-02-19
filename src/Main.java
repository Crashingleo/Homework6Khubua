import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1()
    {
        System.out.println("task 1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }
    }

    public static void task2()
    {
        System.out.println("task2");
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println(i);
        }
    }

    public static void task3()
    {
        System.out.println("task3");
        for (int i = 0; i < 18; i = i + 2) {
            System.out.println(i);
        }
    }
    public static void task4()
    {
        System.out.println("task4");
        for (int i = 10; i > -11; i = i - 1)
        {
            System.out.println(i);
        }
    }
    public static void task5()
    {
        System.out.println("task5");
        for(int i = 1904; i < 2097; i = i +4)
        {
            System.out.println(i + " Год является вискокосным");
        }

    }
    public static void task6()
    {
        System.out.println("task6");
        for (int i = 0; i < 99; i = i + 7)
        {
            System.out.println(i);
        }
    }
    public static void task7()
    {
        System.out.println("task7");
        for (int i = 1; i < 513; i = i * 2)
        {
            System.out.println(i);
        }
    }
    public static void task8()
    {
        System.out.println("task8");
        int Sum = 29000;
        for (int i = 1; i < 10; i += 1) {
            System.out.println("Месяц наколения - " + i + ". Сумма накопления - " + (Sum * i));
        }
    }
    public static void task9()
    {
        System.out.println("task9");
        float Sum = 29000f;
        float Percent = 0.12f;
        for (int i = 1; i < 10; i += 1) {
            Sum =  Sum+(Sum*Percent);
            System.out.println("Месяц наколения - " + i + ". Сумма накопления - " + Sum);
            Sum += 29000;
        }
    }
    public static void task10() {
        System.out.println("task10");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println("2 * " + i + " = " + i * 2);
        }


    }
}