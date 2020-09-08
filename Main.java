import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int num;

    System.out.println("Enter a number to count down or up from: ");
    num = s.nextInt();

    if(num > 0)
      for(int count = num; count >= 0; count --)
      {
        System.out.println(count);
      }
    
    else {
      for(int count = num; count <= 0; count ++)
      {
        System.out.println(count);
      }
    }
    System.out.println("Blast off!");
  }
}

    