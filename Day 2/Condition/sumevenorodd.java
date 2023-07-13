import java.util.Scanner;

class sumevenorodd {
  public static void main(String[] args){
      Scanner obj= new Scanner(System.in);
      int a = obj.nextInt();
      int b = obj.nextInt();
      int c = a+b;
      
    if(c%2==0)
        System.out.println("EVEN");
    else 
        System.out.println("ODD");
    
  }
}
