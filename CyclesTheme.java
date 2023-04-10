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
        anyNum = 3242592;
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
                 System.out.print('#');
                 charPrint++;
            }
        System.out.println();
        --width;
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
        int counNumbers = srcNum; 
        int firstHalf = 0;
        int secondHalf = 0;
        int counter = 0;
        while (counNumbers > 0) {
            counNumbers /= 10;
            ++counter;
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
