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
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution{
	static Iterator<Object> func(ArrayList<Object> mylist)
	{
		Iterator<Object> it = mylist.iterator();
		while(it.hasNext())
		{
			Object element = it.next();
			if(element instanceof String)//Hints: use instanceof operator
				break;
		}
		return it;
	}

	public static void main(String []argh){
		ArrayList<Object> mylist = new ArrayList<Object>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		for(int i = 0; i < n; i++){
			mylist.add(in.nextInt());
		}
		mylist.add("###");
		for(int i = 0; i < m; i++){
			mylist.add(in.next());
		}
		in.close();
		Iterator<Object> it = func(mylist);
		while(it.hasNext()){
			Object element = it.next();
			System.out.println((String)element);
		}
	}
}