public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел.");
        int counter = -10;
        int sumOfEvenNum = 0;
        int sumOfOddNum = 0;
        do {
            if (counter % 2 == 0) {
                sumOfEvenNum += counter;
            } else {
                sumOfOddNum += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumOfEvenNum 
                + ", а нечетных = " + sumOfOddNum);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания.");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num3;
        if (min > num1) {
            min = num1;
        }
        if (min > num2) {
            min = num2;
        }
        if (max < num2) {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }
        System.out.print(--max);
        for (int i = --max; i > min; i--) {
            System.out.print(", " + i);
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр.");
        int anyNum = 1234;
        int sumRemainders = 0;
        while (anyNum > 0) {
            int remainder = anyNum % 10;
            anyNum /= 10;
            System.out.print(remainder);
            sumRemainders += remainder;
        }
        System.out.println("\nСумма чисел: " + sumRemainders);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк.");
        int intervalStart = 1;
        int intervalEnd = 24;
        int rowLength = 5;
        for (int i = intervalStart; i < intervalEnd; i += 2) {
            System.out.printf ("%3d", i);
            rowLength--;
            if (rowLength == 0) {
                System.out.println();
                rowLength = 5;
            }
        }
        if ((rowLength > 0) && (rowLength < 5))
            for (int i = 0; i < rowLength; i++) {
                System.out.printf ("%3d", 0);
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность.");
        anyNum = 3242592;
        int countTwos = 0;
        int copyAnyNum = anyNum;
        while (anyNum > 0) {
            if (anyNum % 10 == 2) {
                countTwos++;
            }
            anyNum /= 10;
        }
        if (countTwos % 2 == 0) {
            System.out.println("Число " + copyAnyNum + " содержит чётное количество двоек.");
        } else {
            System.out.println("Число " + copyAnyNum + " содержит нечётное количество двоек.");
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
            int countCharsInLine = 0;
            while (countCharsInLine != width) {
                System.out.print('#');
                countCharsInLine++;
            }
            System.out.println();
            width--;
        }
        System.out.println();

        width = 1;
        boolean increasing = true;
        do {
            int j = 0;
            do {
                j++;
                System.out.print('$');
            } while (j < width);
            System.out.println();
            if (width == 3) {
                increasing = false;
            }
            if (increasing) {
                width++;
            } else {
                width--;
            }
        } while (width > 0);

        System.out.println("\n7. Отображение ASCII-символов.");
        System.out.print("Dec\t" + "Char");
        for (int i = 1; i < 47; i += 2) {
            System.out.printf("\n%3d%6c",i ,i);
        }
        for (int i = 98; i < 122; i += 2) {
            System.out.printf("\n%3d%6c",i ,i);
        }

        System.out.println("\n\n8. Проверка, является ли число палиндромом.");
        anyNum = 1234321;
        copyAnyNum = anyNum;
        int reverseNum = 0;
        System.out.print("Число " + anyNum);
        while (anyNum > 0) {
            int remainder = anyNum % 10;
            anyNum /= 10;
            reverseNum = reverseNum * 10 + remainder;
            }
        if (copyAnyNum == reverseNum) {
            System.out.println(" - палиндром.");
        } else {
            System.out.println(" не является палиндромом.");
        }

        System.out.println("\n9. Определение, является ли число счастливым.");
        anyNum = 321123;
        int firstHalf = 0;
        int secondHalf = 0;
        System.out.print("Число " + anyNum);
        for (int i = 6; i > 0; i--) {
            int remainder = anyNum % 10;
            anyNum /= 10;
            if (i <= 3) {
                firstHalf += remainder;
            } else {
                secondHalf += remainder;
            }
        }
        if (firstHalf == secondHalf) {
            System.out.println(" является счастливым.");
        } else {
            System.out.println(" не является счастливым.");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора.");
        System.out.printf("%3c", '|');
        for (int i = 2; i < 10; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println("\n---------------------------");
        for (int i = 2; i < 10; i++) {
            if (i >= 3) {
                System.out.println();
            }
            System.out.print(" " + i + "|");
            for (int j = 2; j < 10; j++) {
                System.out.printf("%3d", (j * i));
            }
        }
    }
}
