import java.io.*;
import java.util.*;

public class Dices{
  public static void main(String[] args){
    Random RandObj = new Random();

    for(int i = 0; i < 10; i++){
      int n = RandObj.nextInt(6) + 1;
      System.out.println(Integer.toString(n) + "");
    }
  }
}
