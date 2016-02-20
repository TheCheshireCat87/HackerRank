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

public class Solution {      
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();
          
        if(s.trim().length() > 0){
        	String[] strings = s.trim().split("[^a-zA-Z]+");
            System.out.println(strings.length);  
            for(String str : strings){
            	System.out.println(str);
            }
        }
        else
        	System.out.println(0);
    }
}
