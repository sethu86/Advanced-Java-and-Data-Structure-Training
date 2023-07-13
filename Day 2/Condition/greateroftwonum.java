import java.util.Scanner;

class greateroftwonum {
  public static void main(String[] args){
      Scanner obj= new Scanner(System.in);
      int a = obj.nextInt();
      int b = obj.nextInt();
      
    if(a>b)
        System.out.println("greater :"+a);
    else 
        System.out.println("greater :"+b);
    
  }
}
