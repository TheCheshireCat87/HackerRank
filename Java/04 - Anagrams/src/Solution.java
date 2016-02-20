/**********************************************
*                  .'\   /`.                  *
*                .'.-.`-'.-.`.                *
*           ..._:   .-. .-.   :_...           *
*         .'    '-.(o ) (o ).-'    `.         *
*        :  _    _ _`~(_)~`_ _    _  :        *
*       :  /:   ' .-=_   _=-. `   ;\  :       *
*       :   :|-.._  '     `  _..-|:   :       *
*        :   `:| |`:-:-.-:-:'| |:'   :        *
*         `.   `.| | | | | | |.'   .'         *
*           `.   `-:_| | |_:-'   .'           *
*             `-._   ````    _.-'             *
*                 ``-------''                 *
*               The Cheshire Cat              *
**********************************************/
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
   static boolean isAnagram(String A, String B) {
       if(A.length() != B.length()) 
           return false;
       else if(A.equalsIgnoreCase(B))
           return true;
       else{
    	   char[] a = A.toCharArray();
    	   Arrays.sort(a);
    	   char[] b = B.toCharArray();
    	   Arrays.sort(b);
    	   String aStr = String.valueOf(a);
    	   String bStr = String.valueOf(b);
    	   if(aStr.equalsIgnoreCase(bStr))
    		   return true;
       }
       
       return false;
   }
    public static void main(String[] args) {       
        Scanner in = new Scanner(System.in);
        String A = in.next();
        String B = in.next();
        in.close();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");        
    }
}
