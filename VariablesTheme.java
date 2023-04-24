public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль.");
        byte numberCores = 8;
        short ram = 8128;
        int hdd = 1024;
        long price = 35000L;
        float frequency = 2.48F;
        double ratio = 0.25;
        char cpu = 'i';
        boolean cheapPirce = true;
        System.out.println("Компьютер на операционной системе Windows.\n"
                + "C мощным " + numberCores + "-ядерным процессором " + cpu + "5 и тактовой частой " + frequency + " Ггц.\n"
                + "В данной модели установлена оперативная память на " + ram + "мб и жёсткий диск на " + hdd + "гб.\n"
                + "Стоимость аппарата составляет: " + price + "р.");
        if (cheapPirce ) {
            System.out.println("На данную модель действует скидка: " + ratio + " от стоимости!");
        }

        System.out.println("\n2. Расчет стоимости товара со скидкой.");
        int penPrice = 100;
        int bookPrice = 200;
        int fullPrice = penPrice + bookPrice;
        double discount = (double) fullPrice - (fullPrice * 0.89);
        int discountPrice = fullPrice - (int) discount;
        System.out.println("Общая стоимость товаров без скидки составляет: " + fullPrice + " руб.\n"
                + "Сумма скидки составляет: " + discount + " руб.\n"
                + "Итоговая стоимость товаров со скидкой равна: " + discountPrice  + " руб.");

        System.out.println("\n3. Вывод слова JAVA.");
        System.out.println("\n   J    a  v     v  a     " +
                "\n   J   a a  v   v  a a    " + 
                "\nJ  J  aaaaa  V V  aaaaa   " + 
                "\n JJ  a     a  V  a     a  ");

        System.out.println("\n4.Вывод min и max значений целых числовых типов.\n");
        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9_223_372_036_854_775_807l;
        System.out.println(byteMax + "\n" +  ++byteMax + "\n" + --byteMax + "\n");
        System.out.println(shortMax + "\n" +  ++shortMax + "\n" + --shortMax + "\n");
        System.out.println(intMax + "\n" +  ++intMax + "\n" + --intMax + "\n");
        System.out.println(longMax + "\n" +  ++longMax + "\n" + --longMax + "\n");

        System.out.println("\n5. Перестановка значений переменных.");
        int number1 = 2;
        int number2 = 5;
        System.out.println("C помощью третьей переменной:\n" + 
                "Исходные значение до перестановки: переменная №1 = " + number1 + " и переменная №2 = " + number2);
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("Новые значения:  переменная №1 = " + number1 + " и переменная №2 = " + number2 + ".\n");
        System.out.println("C помощью арифметических операций:\n" + 
                "Исходные значение до перестановки: переменная №1" + number1 + " и переменная №2 " + number2);
        number2 += number1;
        number1 = number2 - number1;
        number2 -= number1;
        System.out.println("Новые значения:  переменная №1 = " + number1 + " и переменная №2 = " + number2 + ".\n");
        System.out.println("C помощью побитовых операций:\n" + 
                "Исходные значение до перестановки: переменная №1" + number1 + " и переменная №2 " + number2);
        number1 ^= number2;
        number2 ^= number1;
        number1 ^= number2;
        System.out.println("Новые значения:  переменная №1 = " + number1 + " и переменная №2 = " + number2 + ".\n");

        System.out.println("\n6. Вывод символов и их кодов\n");
        char sharp = '#';
        char ampersand = '&';
        char at = '@';
        char caret = '^';
        char underscore = '_';
        System.out.println((int) sharp + " - " +  sharp + "\n"+
                (int) ampersand + " - " +  ampersand + "\n" + 
                (int) at + " - " +  at + "\n" + 
                (int) caret + " - " +  caret + "\n" +
                (int) underscore + " - " +  underscore);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка.");
        char slash = '/';
        char backSlash = '\\';
        char operParenthesis = '(';
        char closeParenthesis =')';
        char underline = '_';
        System.out.println("\n    " + slash + backSlash);
        System.out.println("   " + slash + "  " + backSlash);
        System.out.println("  " + slash + underline + operParenthesis + " " + closeParenthesis + backSlash);
        System.out.println(" " + slash + "      " + backSlash);
        System.out.println("" + slash + underline + underline + underline + underline
                + slash + backSlash + underline + underline + backSlash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа.\n");
        int srcNumber = 123;
        int hundreds = srcNumber / 100;
        int tens = srcNumber / 10 % 10;
        int ones = srcNumber % 10;
        int sum = ones + tens + hundreds;
        int multiplication = ones * tens * hundreds;
        System.out.println("Число " + srcNumber +" содержит:\n" +
                hundreds + " сотню\n" +
                tens + " десятка\n" +
                ones + " единицы\n" +
                "Сумма всех цифр равна " + sum + ". Произведение равно " + multiplication + ".");

        System.out.println("\n9. Вывод времени.");
        int secondsInput = 86399;
        int hour = (secondsInput / 60) / 60;
        int minute = (secondsInput / 60) % 60;
        int seconds = secondsInput % 60;
        System.out.println( hour + ":" + minute + ":" + seconds);
    }
}
