public class Calculator {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        char sign  = '^';
        int result = 0;
        int resultOFexponentiation = 1;
        if (sign == '+') {
            result = x + y;
        } else  if (sign == '-') {
            result = x - y;
        } else if (sign == '*') {
            result = x * y;
        } else if (sign == '/') {
            result = x / y;
        } else if (sign == '^') {
            for (int s = 1; s <= y; s++) {
                result = resultOFexponentiation;
                resultOFexponentiation = x * result;
                }
            result = resultOFexponentiation;
        } System.out.println("Число "+ x + " "+ sign + " " + y + " = " + result);
    }
}