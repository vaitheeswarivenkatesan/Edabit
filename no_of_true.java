//find the no of trues in a an array


import java.util.*;

public class Prob1{
  public static int countTrue(boolean[] arr){
    int count=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]==true){
        count++;
      }
    }
    return count;
  }
  public static void main(String[] args){
    boolean[] arr={true, false, false, true, false};
    System.out.println(countTrue(arr));

  }


}
