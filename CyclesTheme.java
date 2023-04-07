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
        int lengthOfRow = 5;
        int iterationSteps = 2;
        for (int i = intervalStart; i < intervalEnd; i+=iterationSteps) {
             System.out.printf ("%3d", i);
             lengthOfRow--;
             if (lengthOfRow == 0) {
                System.out.println ();
                lengthOfRow = 5;
             } 
        } if ((lengthOfRow > 0) && (lengthOfRow < 5))
        for (int z = 0; z < lengthOfRow; z++) {
            System.out.printf ("%3d", 0);
        }

        System.out.println("\n5. Проверка количества двоек на четность/нечетность.");
        int anyNum = 3242592;
        int srcNum = 0;
        int countNumberTwo = 0;
        int showNum = anyNum;
        while (anyNum > 0) {
            srcNum = anyNum % 10;
            anyNum /= 10;
            if (srcNum == 2) {
                ++countNumberTwo;
            }
        }
        if ((countNumberTwo % 2) == 0) {
        System.out.println("Число " + showNum + " содержит чётное количество двоек.");
        } else {
            System.out.println("Число " + showNum + " содержит нечётное количество двоек.");
        }

        System.out.println("\n6. Отображение фигур в консоли.");
        int hight = 5;
        int width = 10;
        for (int i = 0; i < hight; i++) {
             System.out.println("**********");
        }
        System.out.println();
        width = 5;
        while (width != 0) {
            int charPrint = 0;
            while (charPrint != width) {
                 System.out.print("#");
                 charPrint++;
            }
        System.out.println();
        --width;
        }



    }
}
