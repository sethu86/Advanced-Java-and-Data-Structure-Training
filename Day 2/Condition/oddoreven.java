import java.util.Scanner;

class oddoreven {
  public static void main(String[] args){
      Scanner obj= new Scanner(System.in);
      int a = obj.nextInt();
      
    if(a%2==0)
        System.out.println("EVEN");
    else 
        System.out.println("ODD");
    
  }
}
