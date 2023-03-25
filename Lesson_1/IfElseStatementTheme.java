import java.nio.charset.Charset;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java.\n");
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

        System.out.println("\n2. Поиск max и min числа.\n");
        int number1 = 46;
        int number2 = 73;
        if (number1 > number2) {
            System.out.println("Мax: " + number1 + "\nMin: " + number2);
        } else if (number1 < number2) {
            System.out.println("Мax: " + number2 + "\nMin: " + number1);
        } else {
            System.out.println("Числа: " + number1 + " и " + number2 + " равны.");
        }
//
        System.out.println("\n3. Проверка числа.\n");
        int anyNumber = -35;
        if (anyNumber == 0) {
            System.out.println("Исходное число: " + anyNumber);
        } else if (anyNumber != 0) {
            if (anyNumber > 0) {
                System.out.print("Число " + anyNumber + " положительное ");
            } else {
                System.out.print("Число " + anyNumber + " отрицательное ");
            }
             if ((anyNumber % 2) == 0) {
                System.out.print("и чётное.");
            } else {
                System.out.print("и нечётное.");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах.\n");
        int numberOne = 123; //компилятор ругался на то, что уже есть number1
        int numberTwo = 223; //компилятор ругался на то, что уже есть number2
        int numberOneHundreds = numberOne / 100;
        int numberOneTens = numberOne /10 % 10;
        int numberOneOnes = numberOne % 10;
        int numberTwoHundreds = numberTwo / 100;
        int numberTwoTens = numberTwo /10 % 10;
        int numberTwoOnes = numberTwo % 10;
        System.out.println("Есть два числа: " + numberOne + " и " + numberTwo + ".\n");
        if (numberOneHundreds == numberTwoHundreds || numberOneTens == numberTwoTens || numberOneOnes == numberTwoOnes) {
                if (numberOneHundreds == numberTwoHundreds) {
                    System.out.println("\nВ первом разряде числа " + numberOneHundreds + " у обоих чисел одинаковые.");
                } if (numberOneTens == numberTwoTens) {
                    System.out.println("\nВо втором разряде числа " + numberOneTens + " у обоих чисел одинаковые.");
                } if (numberOneOnes == numberTwoOnes) {
                    System.out.println("\nВ первом разряде числа " + numberOneOnes + " у обоих чисел одинаковые.");
                } else {
                System.out.println("У данных чисел одинаковых цифр в одном и том же разряде нет.\n"); 
                }
        }

        System.out.println("\n5. Определение символа по его коду.\n");
        char someCode = '\u0057';
        if (someCode >= 'a' && someCode <= 'z') {
           System.out.println( someCode + " - это маленькая латинская буква.\n");
        } else if (someCode >= 'A' && someCode <= 'Z') {
           System.out.println( someCode + " - это большая латинская буква.\n");
        } else if (someCode >= '0' && someCode <= '9') {
           System.out.println( someCode + " - это число.");
        } else {
           System.out.println( someCode + " - это не буква и не число.\n");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %.\n");
        int deposit = 300000;
        if (deposit < 100000) {
            int depostForFivePercent = 5 * deposit / 100;
            System.out.println("Сумма вклада равна " + deposit + ". Процент по вкладу составляет 5% годовых, начисленный процент \n"
                   + " составит " + depostForFivePercent + " рублей. Итоговая сумма будет равна " + (deposit + depostForFivePercent));
        } else if (deposit >= 100000 && deposit <= 300000) {
            int depostForSevenPercent = 7 * deposit / 100;
            System.out.println("Сумма вклада равна " + deposit + " процент по вкладу составляет 7% годовых, начисленный процент \n"
                   + " составит " + depostForSevenPercent + " рублей. Итоговая сумма будет равна " + (deposit + depostForSevenPercent));
        } else if (deposit > 300000) {
            int depostForTenPercent = 10 * deposit / 100;
            System.out.println("Сумма вклада равна " + deposit + " процент по вкладу составляет 10% годовых, начисленный процент \n"
                   + " составит " + depostForTenPercent + " рублей. Итоговая сумма вклада будет равна " + (deposit + depostForTenPercent));
        }

        System.out.println("\n7. Определение оценки по предметам.\n");
        int historyMark = 0;
        int programmingMark = 0;
        int historyPercent = 59;
        int programmingPercent = 91;
        if ( historyPercent <= 60) {
             historyMark = 2;
        } if ( historyPercent > 60) {
             historyMark = 3;
        } if ( historyPercent > 73) {
             historyMark = 4;
        } if ( historyPercent > 91) {
             historyMark = 5;
        }
        System.out.println("История: " + historyMark);
        if ( programmingPercent <= 60) {
            programmingMark = 2;
        } if ( programmingPercent > 60) {
            programmingMark = 3;
        } if ( programmingPercent > 73) {
            programmingMark = 4;
        } if ( programmingPercent > 91) {
            programmingMark = 5;
        }
        System.out.println("Программирование: " + programmingMark);
        System.out.println("Средний балл по предметам составляет: " + ((programmingMark + historyMark) / 2) + "\n"
                + "Средний % по предметам составляет: " + ((historyPercent + programmingPercent)/ 2));

        System.out.println("\n8. Расчет прибыли за год.\n");
        int monthlyRent = 5000;
        int monthlyProfit = 13000;
        int monthlySelfPrice = 9000;
        int clearProfit = monthlyProfit - (monthlyRent + monthlySelfPrice);
        if (clearProfit <= 0) {
            System.out.println(clearProfit + " руб.");
        } else {
            System.out.println(" + " + clearProfit + " руб.");
        }

        System.out.println("\n9. Подсчет количества банкнот.\n");
        int outCash = 567; // сумма, которую надо выдать
        int howMuchOneDol = 50; // сколько у нас есть однодолларовых купюр
        int howMuchTenDol = 5; // сколько у нас есть десятидолларовых купюр
        int howMuchHundredDol = 10; // сколько у нас есть стодолларовых купюр
        int ammountCash = ((howMuchOneDol * 1) + (howMuchTenDol * 10) + (howMuchHundredDol * 100));// считаю всю сумму денег, что есть в банкомате
        int needATM100 = outCash / 100; // считаю, сколько нужно выдать сотками
        int needATM10 = outCash / 10 % 10; // считаю, сколько нужно выдать десятками
        int needATM1 = outCash % 10; // считаю, сколько нужно выдать однушками
        int goToATM = 0;
        if (outCash <= ammountCash && needATM1 <= howMuchOneDol) { // узнаю, сможет ли банкомат выдать сумму денег + узнаю, достаточно ли однодолларовых купюр и если да, то поехали:
        if (needATM100 <= howMuchHundredDol) {
            goToATM +=  needATM100 * 100;
            } else {
            goToATM += howMuchHundredDol * 100;
            int need10 = (outCash - goToATM) / 10;
            goToATM += (howMuchTenDol * 10);
            int need1 = (outCash - goToATM);
            goToATM += need1;
            System.out.print("Сумма " + outCash +  "$ для снятия  доступна. Купюр в сто долларов будет выдано: " + howMuchHundredDol + ".\n"
            + "Купюр в десять долларов будет выдано: " + need10 + ".\n" + "Купюр в один доллар будет выдано: " + need1 + ".\n" );
            return;
        }
        if (needATM10 <= howMuchTenDol) {
            goToATM += needATM10 * 10;
            } else {
            goToATM += howMuchTenDol * 10;
            int need1 = (outCash - goToATM);
            goToATM += need1;
            System.out.print("Сумма " + outCash +  "$ для снятия  доступна. Купюр в сто долларов будет выдано: " + needATM100 + ".\n"
            + "Купюр в десять долларов будет выдано: " + howMuchTenDol + ".\n" + "Купюр в один доллар будет выдано: " + need1 + ".\n" );
            return;
        }
        if (needATM1 <= howMuchOneDol) {
            goToATM += needATM1;
            };
        System.out.println("Сумма " + outCash +  "$ для снятия  доступна. Купюр в сто долларов будет выдано: " + needATM100 + ".\n"
                + "Купюр в десять долларов будет выдано: " + needATM10 + ".\n"
                + "Купюр в один доллар будет выдано: " + needATM1 + ".\n" );
        } else {
        System.out.println("Для выдачи " + outCash + "$ купюр в банкомате не хватает.");// если купюр недостаточно, то сообщаем об этом
        }
    }
}
