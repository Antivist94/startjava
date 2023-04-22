public class MyFirstGame {
    public static void main(String[] args) {
        int guesNumber = 42;
        int inputNumber = 47;
        if (inputNumber != guesNumber) {
            while (inputNumber != guesNumber) {
            System.out.print("Число " + inputNumber + " не подходит - ");
            if (inputNumber > guesNumber) {
                System.out.println(" оно чуть меньше того, что я загадал.");
                inputNumber--;
            } else if (inputNumber < guesNumber) {
                System.out.println(" оно чуть больше того, что я загадал.");
                inputNumber++;
                }
            }
            System.out.println("Отгадал! Как ты узнал, что я загадал " + guesNumber + "?!");
            } else {
                System.out.println("Читер! Как ты узнал, что я загадал " + guesNumber+ "?!");
        }
    }
}