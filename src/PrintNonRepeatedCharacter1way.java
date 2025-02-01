

import java.util.*;

public class PrintNonRepeatedCharacter1way {
   public static void main(String argu[]) {
      String str = "srrrrrriiiiilllllaaannnnkkkk";
      char carray[] = str.toCharArray();
      System.out.println("The string is:" + str);
     
      for (int i = 0; i < str.length(); i++) {
         for (int j = i + 1; j < str.length(); j++) {
            if (carray[i] == carray[j]) {
              carray[j]='0';
               
            }
         }
      }
   StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
        if(carray[i]!='0')
        sb.append(carray[i]);}
        
     System.out.println("String: " +sb.toString());
       
   }
}
