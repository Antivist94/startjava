public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел.");
        int number = -10;
        int evenNumber = 0;
        int oddNumber = 0;
        do {
            if (number % 2 == 0) {
                evenNumber++;
            } else {
                oddNumber++;
            }
            number++;
        } while (number <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + evenNumber +", а нечетных = " + oddNumber);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания.");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int min = num1;
        if ((num2 < min) && (num2 < num3)) {
            min = num2;
        } else if ((num3 < min) && (num3 < num2)) {
            min = num3;
        }
        int max = num1;
        if ((num2 > max) && (num2 > num3)) {
            max = num2;
        } else if ((num3 > max) && (num3 > num2)) {
            max = num3;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + ", ");
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр.");
        int anyNum = 1234;
        int sumNum = 0;
        while (anyNum > 0) {
            int mod = anyNum % 10;
            anyNum = anyNum / 10;
            System.out.print(mod);
            sumNum += mod;
            }
        System.out.print ("\nСумма чисел: " + sumNum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк.");
        int intervalStart = 1;
        int intervalEnd = 24;
        for (int i = intervalStart; i < intervalEnd; i+=2) {
             System.out.printf ("%3d", i);
             if (i % 10 == 9) {
                System.out.println (); 
             }
             if (i + 5 > intervalEnd)
                System.out.printf ("%3d", 0);
             
        }



    }
}
