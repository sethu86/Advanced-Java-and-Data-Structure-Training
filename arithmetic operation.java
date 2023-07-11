import java.util.Scanner;

class test {
  public static void main(String[] args) {
    int a,b;
    Scanner obj = new Scanner(System.in);
    System.out.println("Type a number:");
    a = obj.nextInt(); 

    System.out.println("Type another number:");
    b = obj.nextInt();

    int c=a+b;
    int d=b-a;
    System.out.println(c);
    System.out.println(d);
  }
}
