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
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int T = Integer.parseInt(in.nextLine());
		while(0 < T--){
			String username = in.nextLine();
			String pattern = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
			Pattern r = Pattern.compile(pattern);
			Matcher m = r.matcher(username);
 
			if (m.find()) {
				System.out.println("Valid");
			} else
				System.out.println("Invalid");
		}
		in.close();
	}
}