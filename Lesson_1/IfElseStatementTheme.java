import java.nio.charset.Charset;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java.");
        int age = 28;
        boolean isFemale = false;
        String name = "Michael";
        double height = 1.90;
        if (age > 20) {
            System.out.println("Ваш возраст " + age + " лет. Вы старше 20 лет.");
        } else {
            System.out.println("Вам меньше 20 лет.");
        }
        if (!isFemale) {
            System.out.println("Пол: мужской.");
        } else {
            System.out.println("Пол: женский.");
        }
        if (height < 1.80) {
            System.out.println("Рекомендуемые занятия: баскетбол, плаванье, волейбол.");
        } else {
            System.out.println("Рекомендуемые занятия: плаванье, скалодром, футбол.");
        }
        char firstCharName = name.charAt(0);
        if (firstCharName == 'M') {
            System.out.println("У нас есть готовые футболки с большой буквой М спине.");
        } else if (firstCharName == 'I') {
            System.out.println("У нас есть готовые кепки с  буквой I.");
        } else {
            System.out.println("Также вы можете заказать у нас футболки, кепки и носки с указанием первой буквы вашего имени!");
        }

        System.out.println("\n2. Поиск max и min числа.");
        int number1 = 46;
        int number2 = 73;
        if (number1 > number2) {
            System.out.println("Мax: " + number1 + "\nMin: " + number2);
        } else if (number1 < number2) {
            System.out.println("Мax: " + number2 + "\nMin: " + number1);
        } else {
            System.out.println("Числа: " + number1 + " и " + number2 + " равны.");
        }

        System.out.println("\n3. Проверка числа.");
        int anyNumber = -35;
        if (anyNumber == 0) {
            System.out.println("Исходное число: " + anyNumber);
        } else {
            if (anyNumber > 0) {
                System.out.print("Число " + anyNumber + " положительное ");
            } else {
                System.out.print("Число " + anyNumber + " отрицательное ");
            }
            if ((anyNumber % 2) == 0) {
                System.out.print("и чётное.\n");
            } else {
                System.out.print("и нечётное.\n");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах.");
        number1 = 123;
        number2 = 223;
        int number1Hundreds = number1 / 100;
        int number1Tens = number1 /10 % 10;
        int number1Ones = number1 % 10;
        int number2Hundreds = number2 / 100;
        int number2Tens = number2 /10 % 10;
        int number2Ones = number2 % 10;
        System.out.println("Есть два числа: " + number1 + " и " + number2 + ".");
        if (number1Hundreds == number2Hundreds || number1Tens == number2Tens || number1Ones == number2Ones) {
            if (number1Hundreds == number2Hundreds) {
                System.out.println("В первом разряде числа " + number1Hundreds + " у обоих чисел одинаковые.");
            }
            if (number1Tens == number2Tens) {
                System.out.println("Во втором разряде числа " + number1Tens + " у обоих чисел одинаковые.");
            }
            if (number1Ones == number2Ones) {
                System.out.println("В первом разряде числа " + number1Ones + " у обоих чисел одинаковые.");
            } else {
            System.out.println("У данных чисел одинаковых цифр в одном и том же разряде нет."); 
            }
        }

        System.out.println("\n5. Определение символа по его коду.");
        char someCode = '\u0057';
        if (someCode >= 'a' && someCode <= 'z') {
           System.out.println( someCode + " - это маленькая латинская буква.");
        } else if (someCode >= 'A' && someCode <= 'Z') {
           System.out.println( someCode + " - это большая латинская буква.");
        } else if (someCode >= '0' && someCode <= '9') {
           System.out.println( someCode + " - это число.");
        } else {
           System.out.println( someCode + " - это не буква и не число.");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %.");
        int deposit = 300000;
        int rate = 5;
        if (deposit >= 100000 && deposit <= 300000) {
            rate = 7;
        } else if (deposit > 300000) {
            rate = 10;
        }
        int profitByRate = rate * deposit / 100;
        int profitByDeposit = profitByRate + deposit;
        System.out.println("Сумма вклада равна " + deposit + ". Процент по вкладу составляет " + rate + "%\n"
                + " годовых, начисленный процент составит " + profitByRate + " рублей. Итоговая сумма: " + profitByDeposit);

        System.out.println("\n7. Определение оценки по предметам.");
        int historyMark = 2;
        int programmingMark = 2;
        int historyPercent = 59;
        int programmingPercent = 91;
        if (historyPercent > 60) {
             historyMark = 3;
        }
        if (historyPercent > 73) {
             historyMark = 4;
        }
        if (historyPercent > 91) {
             historyMark = 5;
        }
        System.out.println("История: " + historyMark);
        if (programmingPercent > 60) {
            programmingMark = 3;
        }
        if (programmingPercent > 73) {
            programmingMark = 4;
        }
        if (programmingPercent > 91) {
            programmingMark = 5;
        }
        System.out.println("Программирование: " + programmingMark);
        System.out.println("Средний балл по предметам составляет: " + ((programmingMark + historyMark) / 2) + "\n"
                + "Средний % по предметам составляет: " + ((historyPercent + programmingPercent)/ 2));

        System.out.println("\n8. Расчет прибыли за год.");
        int monthlyRent = 5000;
        int monthlyProfit = 13000;
        int monthlySelfPrice = 9000;
        int clearProfit = monthlyProfit - (monthlyRent + monthlySelfPrice);
        if (clearProfit <= 0) {
            System.out.println(clearProfit + " руб.");
        } else {
            System.out.println(" + " + clearProfit + " руб.");
        }

        System.out.println("\n9. Подсчет количества банкнот.");
        int outCash = 567; // сумма, которую надо выдать
        int have1nominal = 50; // сколько у нас есть однодолларовых купюр
        int have10nominal = 5; // сколько у нас есть десятидолларовых купюр
        int have100nominal = 10; // сколько у нас есть стодолларовых купюр
        int ammountCash = ((have1nominal * 1) + (have10nominal * 10) + (have100nominal * 100));// считаю всю сумму денег, что есть в банкомате
        int needAtm100 = outCash / 100; // считаю, сколько нужно выдать сотками
        int needAtm10 = outCash / 10 % 10; // считаю, сколько нужно выдать десятками
        int needAtm1 = outCash % 10; // считаю, сколько нужно выдать однушками
        int goToAtm = 0;
        if (outCash <= ammountCash && needAtm1 <= have1nominal) { // узнаю, сможет ли банкомат выдать сумму денег + узнаю, достаточно ли однодолларовых купюр и если да, то поехали:
            if (needAtm100 <= have100nominal) {
                goToAtm +=  needAtm100 * 100;
                } else {
                goToAtm += have100nominal * 100;
                int need10 = (outCash - goToAtm) / 10;
                goToAtm += (have10nominal * 10);
                int need1 = (outCash - goToAtm);
                goToAtm += need1;
                System.out.print("Сумма " + outCash + "$ для снятия  доступна. Купюр в сто долларов к выдаче: " + have100nominal + ".\n"
                + "Купюр в десять долларов к выдаче: " + need10 + ".\n" + "Купюр в один доллар к выдаче: " + need1 + ".\n" );
                return;
            }
            if (needAtm10 <= have10nominal) {
                goToAtm += needAtm10 * 10;
                } else {
                goToAtm += have10nominal * 10;
                int need1 = (outCash - goToAtm);
                goToAtm += need1;
                System.out.print("Сумма " + outCash + "$ для снятия доступна. Купюр в сто долларов к выдаче: " + needAtm100 + ".\n"
                + "Купюр в десять долларов к выдаче: " + have10nominal + ".\n" + "Купюр в один доллар к выдаче: " + need1 + ".\n" );
                return;
            }
            if (needAtm1 <= have1nominal) {
                goToAtm += needAtm1;
                }
                System.out.println("Сумма " + outCash + "$ для снятия  доступна. Купюр в сто долларов к выдаче: " + needAtm100 + ".\n"
                        + "Купюр в десять долларов к выдаче: " + needAtm10 + ".\n"
                        + "Купюр в один доллар к выдаче: " + needAtm1 + ".\n" );
        } else {
        System.out.println("Для выдачи " + outCash + "$ купюр в банкомате не хватает.");// если купюр недостаточно, то сообщаем об этом
        }
    }
}
