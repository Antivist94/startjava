public class VariablesTheme {
    public static void main(String[] args) {

        System.out.println("1. Вывод значений переменных на консоль.");
                byte cores = 8;
                short ram = 8128;
                int hdd = 1024;
                long cost = 35000L;
                float cpu = 2.48F;
                double ratio = 0.25;
                char oSys = 'W';
                boolean cheapPirce = true;

                        System.out.println("Компьютер на базе ОС " + oSys + "indows.\n"
                                + "C мощным " + cores + "-ядерным процессором и тактовой частой " + cpu + " Ггц.\n"
                                + "В данной модели установлена оперативная память на " + ram + "мб и жёсткий диск на " + hdd + "гб.\n"
                                + "Стоимость аппарата составляет: " + cost + "р.\n");
                                        if (cheapPirce == true) {
                                            System.out.println("Также на данную модель действует скидка: " + ratio + " от стоимости!!!");
                                        };

        System.out.println("\n2. Расчет стоимости товара со скидкой.");
                int pen = 100;
                int book = 200;
                int fullPrice = pen + book;
                int ckudka = fullPrice - (int)(fullPrice * 0.89);
                int ckudkaPrice = fullPrice - ckudka;
                        System.out.println("Общая стоимость товаров без скидки составляет: " + fullPrice + " руб.\n"
                            + "Сумма скидки составляет: " + ckudka + " руб.\n"
                            + "Итоговая стоимость товаров со скидкой равна: " + ckudkaPrice  + " руб.");


        System.out.println("\n3. Вывод слова JAVA.");

                System.out.println("\n   J    a  v     v  a     " +
                                   "\n   J   a a  v   v  a a    " + 
                                   "\nJ  J  aaaaa  V V  aaaaa   " + 
                                   "\n JJ  a     a  V  a     a  ");


        System.out.println("\n4.Вывод min и max значений целых числовых типов.\n");
                byte bMax = 127;
                short sMax = 32767;
                int iMax = 2147483647;
                long longMax = 9_223_372_036_854_775_807l;
                        System.out.println(bMax + "\n" +  ++bMax + "\n" + --bMax + "\n");
                        System.out.println(sMax + "\n" +  ++sMax + "\n" + --sMax + "\n");
                        System.out.println(iMax + "\n" +  ++iMax + "\n" + --iMax + "\n");
                        System.out.println(longMax + "\n" +  ++longMax + "\n" + --longMax + "\n");

        System.out.println("\n5. Перестановка значений переменных.");
                int a = 2;
                int b = 5;
                int c = a; 
                    a = b;
                    b = c;

                    System.out.println("a = " + a + " и b = " + b + ", с помощью третьей переменной \"с\""  
                     + "\nпроизводим операции присваивания с = a, a = b и b = c,\nпосле чего переменная "
                     + "\"a\" становится равной " + a + " и переменная \"b\" становится равной " + b + "\n");
                        b = a + b;

                    System.out.println("Замена с помощью арифметических операций:\n" +
                        "переменной b присваиваем значение суммы a + b, и значение b становится " + b + "\n"); 
                        a = b - a;

                    System.out.println("После этого переменной а присваиваем значение" + 
                        " разности переменных b и а и значение а становится " + a + "\n"); 
                        b = b - a;

                    System.out.println("И затем из значению b присваиваем значение разности новых" + 
                        "переменных b и а и значение переменной b становится " + b + "\n"); 

                    System.out.println("Переменная a = " + a + " и переменная b = " + b + ".\n"
                        + "Для Перестановки значений для переменных с помощью побитовой операции ИЛИ нужно \n" 
                        + "Провести операцию a = a ^ b");
                        a = a ^ b;
                        System.out.println("И значение переменной a становится равным " + a + ".\nЗатем:");
                        b = b ^ a;
                        System.out.println(" провести операцию b = b ^ a и получить значение b = " + b + ".\nИ наконец:");
                        a = a ^ b;
                        System.out.println(" провести операцию a = a ^ b и получить значение a = " + a + ".");

        System.out.println("\n6. Вывод символов и их кодов.");
                char octo = (char)35;
                char amper = (char)38;
                char eta = (char)64;
                char up = (char)94;
                char dwn = (char)95;
                        System.out.println("В таблице ASCII код 35 соответствует символу " + octo);
                        System.out.println("В таблице ASCII код 38 соответствует символу " + amper);
                        System.out.println("В таблице ASCII код 64 соответствует символу " + eta);
                        System.out.println("В таблице ASCII код 94 соответствует символу " + up);
                        System.out.println("В таблице ASCII код 95 соответствует символу " + dwn);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка.");
                char fSlash = (char)47;
                char bSlash = (char)92;
                char upset = (char)40;
                char happy = (char)41;


                            System.out.println("\n    " + fSlash + bSlash + "    ");
                            System.out.println("   " + fSlash + "  " + bSlash + "   ");
                            System.out.println("  " + fSlash + dwn + upset + " " + happy + bSlash + " ");
                            System.out.println(" " + fSlash + "      " + bSlash + "   ");
                            System.out.println(fSlash + "" + dwn + dwn + dwn + dwn + fSlash + bSlash + dwn + dwn + bSlash);
                //Пришлось использовать две кавычки вот ↑тут↑ т.к. компилятор суммировал значения а не выводил слэш
        
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа.\n");
                int n = 123;
                int n100 = n / 100;
                int n10 = n / 10 % 10;
                int n1 = n % 10; 
                        System.out.println("Число " + n +" содержит:\n" +
                                            n100 + " сотен\n" +
                                            n10 + " десятков\n" +
                                            n1 + " единиц\n");
                        int sum3 = n1 + n10 + n100;
                        int multi3 = n1 * n10 * n100;
                                System.out.println("Сумма его цифр = " + sum3 + ". Произведение = " + multi3 + ".");


        System.out.println("\n9. Вывод времени.");
                int secondsInput = 86399;
                int hour = (secondsInput / 60) / 60;
                int minute = (secondsInput / 60) % 60;
                int seconds = secondsInput - ((minute * 60) + (hour * 3600));
                        System.out.println( hour + ":" + minute + ":" + seconds);


    }
}