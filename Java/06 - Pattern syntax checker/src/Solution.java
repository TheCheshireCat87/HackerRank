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
import java.util.regex.PatternSyntaxException;

public class Solution{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int T = Integer.parseInt(in.nextLine());
		while(0 < T--){
			String pattern = in.nextLine();
			try{
				Pattern.compile(pattern);
				System.out.println("Valid");
			}
			catch(PatternSyntaxException e){
				System.out.println("Invalid");
			}
		}
		in.close();
	}
}