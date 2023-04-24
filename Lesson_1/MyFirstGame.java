public class MyFirstGame {
    public static void main(String[] args) {
        int guessNumber = 42;
        int inputNumber = 32;
        while (inputNumber != guessNumber) {
            System.out.print("Число " + inputNumber + " не подходит - ");
            if (inputNumber > guessNumber) {
                System.out.println(" оно чуть меньше того, что я загадал.");
                inputNumber--;
            } else if (inputNumber < guessNumber) {
                System.out.println(" оно чуть больше того, что я загадал.");
                inputNumber++;
            }
        }
        System.out.println("Отгадал! Как ты узнал, что я загадал " + guessNumber + "?!");
    }
}
