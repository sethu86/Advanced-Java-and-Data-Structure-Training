public class LastDigit {
    public static int getLastDigit(int number) {
        int lastDigit = Math.abs(number % 10);
        return lastDigit;
    }

    public static void main(String[] args) {
        int number = 197;
        int lastDigit = getLastDigit(number);
        System.out.println("The last digit of " + number + " is " + lastDigit);
        
        number = -197;
        lastDigit = getLastDigit(number);
        System.out.println("The last digit of " + number + " is " + lastDigit);
    }
}
