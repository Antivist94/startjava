public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел.");
        int num = -10;
        int evenNum = 0;
        int oddNum = 0;
        do {
            if (num % 2 == 0) {
                evenNum += num;
            } else {
                oddNum += num;
            }
            num++;
        } while (num <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + evenNum 
                + ", а нечетных = " + oddNum);

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
        for (int i = max - 1; i > min; i--) {
            if (i != 0) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр.");
        int anyNum = 1234;
        int sumNum = 0;
        while (anyNum > 0) {
            int remainder = anyNum % 10;
            anyNum /= 10;
            System.out.println(remainder);
            sumNum += remainder;
        }
        System.out.println("Сумма чисел: " + sumNum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк.");
        int intervalStart = 1;
        int intervalEnd = 24;
        int rowLength = 5;
        for (int i = intervalStart; i < intervalEnd; i+=2) {
            System.out.printf ("%3d", i);
            rowLength--;
            if (rowLength == 0) {
                System.out.println();
                rowLength = 5;
            }
        } if ((rowLength > 0) && (rowLength < 5))
        for (int j = 0; j < rowLength; j++) {
            System.out.printf ("%3d", 0);
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность.");
        anyNum = 3242592;
        int srcNum = 0;
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
            int charPrint = 0;
            while (charPrint != width) {
                System.out.print('#');
                charPrint++;
            }
        System.out.println();
        width--;
        }
        System.out.println();
        width = 0;
        boolean increasing = true;
        do {
           for (int j = 0; j < width; j++) {
              System.out.print('$');
           }
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
        for (int i = 1; i < 47; i+=2)  {
           System.out.printf("\n%3d%6c",i ,(char) i);
        }
        for (int j = 98; j < 122; j+=2) {
        System.out.printf("\n%3d%6c",j ,(char) j);
        }

        System.out.println("\n\n8. Проверка, является ли число палиндромом.");
        srcNum = 1234321;
        int polyNum = srcNum;
        int backwardNum = 0;
        while (srcNum > 0) {
            anyNum = srcNum % 10;
            srcNum /= 10;
            backwardNum = backwardNum * 10 + anyNum;
        } if (polyNum == backwardNum) {
            System.out.println("Число " + polyNum + " - палиндром.");
        } else {
            System.out.println("Число " + polyNum + " не является палиндромом.");
        }

        System.out.println("\n9. Определение, является ли число счастливым.");
        srcNum = 321123;
        int countNums = srcNum; 
        int firstHalf = 0;
        int secondHalf = 0;
        int counter = 0;
        while (countNums > 0) {
            countNums /= 10;
            counter++;
        }
        counter /= 2;
        System.out.print("Число " + srcNum);
        for (int i = 0; i < counter; i++) {
            anyNum = srcNum % 10;
            srcNum /= 10;
            firstHalf += anyNum;
        }
        for (int i = 0; i < counter; i++) {
            anyNum = srcNum % 10;
            srcNum /= 10;
            secondHalf += anyNum;
        }
        if (firstHalf == secondHalf) {
            System.out.print(" является счастливым.\n");
        } else {
            System.out.print(" не является счастливым.\n");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора.");
        int j = 0;
        System.out.printf("%3c", '|');
        for ( int i = 2; i < 10; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println("\n---------------------------");
        for (j = 2; j < 10; j++) {
            if (j >= 3) {
                System.out.println();
            }
            System.out.print(" " + j + "|");
            for (int x = 2; x < 10; x++) {
                int multiNum = x * j;
                System.out.printf("%3d", multiNum);
            }
        } 
    }
}
