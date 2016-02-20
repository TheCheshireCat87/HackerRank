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
***********************************************/
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		String out = "";

		for (int j = 0; j < t; j++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			for (int i = 0; i < n; i++) {
				a += Math.pow(2, i) * b;
				out += a + " ";
			}

			out += "\n";
		}

		System.out.println(out);
		in.close();
	}
}