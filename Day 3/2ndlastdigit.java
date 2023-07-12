public class SecondLastDigit {
    public static int getSecondLastDigit(int number) {
        int absNumber = Math.abs(number);

        if (absNumber < 10) {
            // Single digit number, second last digit does not exist
            return -1;
        } else {
            int secondLastDigit = (absNumber / 10) % 10;
            return secondLastDigit;
        }
    }

    public static void main(String[] args) {
        int number = 197;
        int secondLastDigit = getSecondLastDigit(number);
        System.out.println("The second last digit of " + number + " is " + secondLastDigit);
        
        number = -197;
        secondLastDigit = getSecondLastDigit(number);
        System.out.println("The second last digit of " + number + " is " + secondLastDigit);
        
        number = 5;
        secondLastDigit = getSecondLastDigit(number);
        System.out.println("The second last digit of " + number + " is " + secondLastDigit);
    }
}
