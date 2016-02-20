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

public class Solution{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int T = Integer.parseInt(in.nextLine());
		while(0 < T--){
			String line = in.nextLine();
			String pattern = "<(.+)>(([^<>]+))</\\1>";
			Pattern p = Pattern.compile(pattern);
			Matcher m = p.matcher(line);
			if(!m.find())
				System.out.println("None");
			m.reset();
			while(m.find()){
              System.out.println(m.group(2));
			}
		}
		in.close();
	}
}