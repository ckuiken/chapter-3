import java.util.Scanner;

public class PowersOf2

{
  public static void main(String[] args)

  {
      int numPowersOf2;        
      int nextPowerOf2 = 1;
      int exponent = 0;        
      Scanner scan = new Scanner(System.in);
      System.out.println("How many powers of 2 would you like printed?");
      numPowersOf2 = scan.nextInt();
      System.out.println("Here are the first " + numPowersOf2 + " power of 2");
      while (exponent<numPowersOf2)
        {
            nextPowerOf2=nextPowerOf2*2;
            exponent++;
            System.out.println(nextPowerOf2);
             }
        }
}