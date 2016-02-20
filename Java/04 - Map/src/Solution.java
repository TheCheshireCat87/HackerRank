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
import java.util.HashMap;

class Solution{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		HashMap map = new HashMap();
		for(int i = 0; i < n; i++)
		{
			String name = in.nextLine();
			int phone = in.nextInt();
			in.nextLine();
			map.put(name, phone);
		}
		while(in.hasNext())
		{
			String s = in.nextLine();          
			if(map.containsKey(s))
				System.out.println(s + "=" + map.get(s));
			else
				System.out.println("Not found"); 
		}
		in.close();
	}
}
