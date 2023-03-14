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
                        };

                        if (isFemale != true) {
                            System.out.println("Пол: мужской.");
                        } else {
                            System.out.println("Пол: женский.");
                        };

                        if (height < 1.80) {
                            System.out.println("Рекомендуемые занятия: баскетбол, плаванье, волейбол.");
                        } else {
                            System.out.println("Рекомендуемые занятия: плаванье, скалодром, футбол.");
                        };

                        char firstCharName = name.charAt(0);
                        if(firstCharName == 'M') {
                            System.out.println("У нас есть готовые футболки с большой буквой М спине.");
                        } else if (firstCharName == 'I') {
                            System.out.println("У нас есть готовые кепки с  буквой I.");
                        } else {
                            System.out.println("Также вы можете заказать у нас футболки, кепки и носки с указанием первой буквы вашего имени!");
                        };

        System.out.println("\n2. Поиск max и min числа.\n");
                int a = 46;
                int b = 46;
                        if (a > b) {
                            System.out.println("Мax: " + a + "\nMin: " + b);
                        } else if (a < b) {
                            System.out.println("Мax: " + b + "\nMin: " + a);
                        } else if (a == b) {
                            System.out.println("Числа: " + a + " и " + b + " равны.");
                        } else {
                            System.out.println("Введите числа.");
                        };

        System.out.println("\n3. Проверка числа.\n");
                int anyNum = 0;
                        if (anyNum != 0) 
                            { 
                            if (anyNum > 0) {
                                    System.out.print("Число " + anyNum + " положительное ");
                            } else {
                                    System.out.print("Число " + anyNum + " отрицательное ");
                            } if ((anyNum % 2) == 0) {
                                    System.out.print("и чётное.");
                            } else {
                                    System.out.print("и нечётное.");
                            };
                        } else {
                            System.out.println("Исходное число: " + anyNum);
                        };

        System.out.println("\n4. Поиск одинаковых цифр в числах.\n");
                int firstNum = 123;
                int secondNum = 223;
                        System.out.println("Есть два числа: " + firstNum + " и " + secondNum + ".\n");
                        int firstNum100 = firstNum / 100;
                        int firstNum10 = firstNum /10 % 10;
                        int firstNum1 = firstNum % 10;
                                int secondNum100 = secondNum / 100;
                                int secondNum10 = secondNum /10 % 10;
                                int secondNum1 = secondNum % 10;
                                        if (firstNum100 == secondNum100 || firstNum10 == secondNum10 || firstNum1 == secondNum) 
                                            {
                                                if (firstNum100 == secondNum100) {
                                                    System.out.println("\n В первом разряде числа " + firstNum100 + " у обоих чисел одинаковые.");
                                                } if (firstNum10 == secondNum10) {
                                                    System.out.println("\n Во втором разряде числа " + firstNum10 + " у обоих чисел одинаковые.");
                                                } if (firstNum1 == secondNum1) {
                                                    System.out.println("\n В первом разряде числа " + firstNum1 + " у обоих чисел одинаковые.");
                                                } else {
                                                System.out.println("У данных чисел одинаковых цифр в одном и том же разряде нет.\n"); 
                                                }
                                            };
        System.out.println("\n5. Определение символа по его коду.\n");
                char varChar = '\u0057';
                        if (varChar >= 'a' && varChar <= 'z') {
                           System.out.println( varChar + " - это маленькая латинская буква.\n");
                        } else if (varChar >= 'A' && varChar <= 'Z') {
                           System.out.println( varChar + " - это большая латинская буква.\n");
                        } else if (varChar >= '0' && varChar <= '9') {
                           System.out.println( varChar + " - это число.");
                        } else {
                           System.out.println( varChar + " - это не буква и не число.\n");
                        };

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %.\n");
                int deposit = 300000;
                int depTerm = 365;
                int depLes100 = 5 * deposit / 100;
                int depUp100To300 = 7 * deposit / 100;
                int depUp300 = 10 * deposit / 100;
                
                if (deposit < 100000) {
                    System.out.println(" Сумма вклада равна " + deposit + ". Процент по вкладу составляет 5% годовых, начисленный процент \n"
                           + " за срок " + depTerm + " дней, составит " + depLes100 + " рублей. Итоговая сумма будет равна " + (deposit + depLes100));
                } else if (deposit >= 100000 && deposit <= 300000) {
                    System.out.println(" Сумма вклада равна " + deposit + " процент по вкладу составляет 7% годовых, начисленный процент \n"
                           + " за срок " + depTerm + " дней, составит " + depUp100To300 + " рублей. Итоговая сумма будет равна " + (deposit + depUp100To300));
                } else if (deposit > 300000) {
                    System.out.println(" Сумма вклада равна " + deposit + " процент по вкладу составляет 10% годовых, начисленный процент \n"
                           + " за срок " + depTerm + " дней, составит " + depUp300 + " рублей. Итоговая сумма вклада будет равна " + (deposit + depUp300));
                };

        System.out.println("\n7. Определение оценки по предметам.\n");
               int historyMark = 0;
               int progMark = 0;
               int historyPerc = 59;
               int progPerc = 91;
               int overagePerc = (historyPerc + progPerc)/ 2;
                        if ( historyPerc <= 60) {
                             historyMark = 2;
                        } if ( historyPerc > 60) {
                             historyMark = 3;
                        } if ( historyPerc > 73) {
                             historyMark = 4;
                        } if ( historyPerc > 91) {
                             historyMark = 5;
                        };
                        System.out.println("История: " + historyMark);

                        if ( progPerc <= 60) {
                             progMark = 2;
                        } if ( progPerc > 60) {
                             progMark = 3;
                        } if ( progPerc > 73) {
                             progMark = 4;
                        } if ( progPerc > 91) {
                             progMark = 5;
                        };
                        System.out.println("Программирование: " + progMark);
                        System.out.println("Средний балл по предметам составляет: " + ((progMark + historyMark) / 2) + "\n"
                                + "Средний % по предметам составляет: " + ((historyPerc + progPerc)/ 2));

        System.out.println("\n8. Расчет прибыли за год.\n");
                int monthlyRent = 5000;
                int monthlyProfit = 13000;
                int monthlySelfPrice = 9000;
                //int clearProfit = monthlyProfit - (monthlyRent + monthlySelfPrice);
                int clearProfit= 0;
                    if (clearProfit <= 0) {
                        System.out.println(clearProfit + " руб.");
                    } else {
                        System.out.println(" + " + clearProfit + " руб.");
                    };

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

                                        System.out.print("2-. Сумма " + outCash +  "$ для снятия  доступна. Купюр в сто долларов будет выдано: " + howMuchHundredDol + ".\n"
                                        + "Купюр в десять долларов будет выдано: " + need10 + ".\n" + "Купюр в один доллар будет выдано: " + need1 + ".\n" );
                                        return;
                };

                if (needATM10 <= howMuchTenDol) {
                        goToATM += needATM10 * 10;
                                } else {
                                    goToATM += howMuchTenDol * 10;
                                    int need1 = (outCash - goToATM);
                                    goToATM += need1;
                                        
                                        System.out.print("2-. Сумма " + outCash +  "$ для снятия  доступна. Купюр в сто долларов будет выдано: " + needATM100 + ".\n"
                                        + "Купюр в десять долларов будет выдано: " + howMuchTenDol + ".\n" + "Купюр в один доллар будет выдано: " + need1 + ".\n" );
                                        return;
                };

                if (needATM1 <= howMuchOneDol) {
                        goToATM += needATM1;
                };

                System.out.println("3 +. Сумма " + outCash +  "$ для снятия  доступна. Купюр в сто долларов будет выдано: " + needATM100 + ".\n"
                        + "Купюр в десять долларов будет выдано: " + needATM10 + ".\n"
                        + "Купюр в один доллар будет выдано: " + needATM1 + ".\n" );

                } else { System.out.println("Для выдачи " + outCash + "$ купюр в банкомате не хватает.");// если купюр недостаточно, то сообщаем об этом
            }
    }
}

