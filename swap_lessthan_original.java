//return true if swaped 2 digit number is lesser than or equal to original number
import java.util.*;

public class Prob3{
  public static boolean countTrue(int a){
    boolean bool=false;
    int num;
    num=(a%10)*10+a/10;
    if(num<=a){
      System.out.println(num);
      bool=true;
    }
    return bool;
  }
  public static void main(String[] args){
    int a=56;
    System.out.println(countTrue(a));
  }
}
