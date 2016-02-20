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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution{
	public static void main(String[] args){
		String pStr = "(\\b\\w+\\b)(\\s*\\1\\b)+";
        Pattern p = Pattern.compile(pStr, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        while(0 < T--){
        	String input = in.nextLine();
            Matcher m = p.matcher(input);
            while(m.find()){
            	input = input.replaceAll(m.group(), m.group(1));
            }
            System.out.println(input);
        }
        in.close();
    }
}