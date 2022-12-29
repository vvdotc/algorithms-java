package vv.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reverse {

    public static void main(String args[]){
        String str = "Venkat Vijay";
        String revStr = "";
        for (int i=0; i < str.length(); i++){
            revStr = str.charAt(i)+revStr;
        }
        System.out.println("Reverse String :: "+revStr);

        List<String> intList = new ArrayList<String>(Arrays.asList("1","2","3","4","5","6"));
        System.out.println("list :: "+intList);

        for(int i=intList.size()-1; i>=0; i--){
            intList.add(intList.get(i));
            intList.remove(i);
           System.out.println("temp list :: "+intList);
        }
        System.out.println("list :: "+intList);

        /**
        for(int i=0; i<intList.size()-1; i++){
            // System.out.println("i :: "+ intList.get(i));
            intList.add(intList.get(intList.size()-1-i));
            intList.remove(intList.size()-1-i);
            System.out.println("temp list :: "+intList);
        }
        System.out.println("list :: "+intList);
        */

        /**
         List<String> colors = new ArrayList<>(Arrays.asList("RED", "BLUE", "BLACK"));

         for (int i = 0, j = colors.size() - 1; i < j; i++) {
         colors.add(i, colors.remove(j));
         }

         System.out.println(colors);
         */

    }

}
