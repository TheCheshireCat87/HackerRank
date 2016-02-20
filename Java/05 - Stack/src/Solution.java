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
import java.util.Stack;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String input = in.next();
			char[] chars = input.toCharArray();
			Stack<Character> OB = new Stack<Character>();
			boolean balanced = true;
			for(char c : chars){
				if(c == '{' || c == '(' || c == '[')
					OB.push(c);
				else if(c == '}' || c == ')' || c == ']'){
					if(OB.size() == 0){
						balanced = false;
						break;
					}else{
						char last = OB.peek();           
						if((last == '{' && c == '}') || (last == '(' && c == ')') || (last == '[' && c == ']'))
							OB.pop();
						else{
							balanced = false;
							break;
						}
					}
				}
			}
			if(OB.size() > 0)
				balanced = false;   
			if(balanced)
				System.out.println("true");
            else
                System.out.println("false");
		}
		in.close();
	}
}