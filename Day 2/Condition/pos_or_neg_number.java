import java.util.Scanner;

class pos_or_neg_number{
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int a = obj.nextInt();
    if(a>0)
      System.out.println("Positive");
    else if(a=0)
      System.out.println("Zero");
    else
      System.out.println("Negative");
  }
}
