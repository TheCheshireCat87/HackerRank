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
import java.util.ArrayList;
import java.util.Scanner;

class Student{}
class Rockstar{}
class Hacker{}

public class Solution
{
	static String count(ArrayList<Object> mylist){
		int a=0,b=0,c=0;
		for(int i=0;i<mylist.size();i++){
			Object element = mylist.get(i);
			if(element instanceof Student)
				a++;
			if(element instanceof Rockstar)
				b++;
			if(element instanceof Hacker )
				c++;
		}
		String ret = Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c);
		return ret;
	}

	public static void main(String []argh){
		ArrayList<Object> mylist = new ArrayList<Object>();
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0;i<t;i++){
			String s = in.next();
			if(s.equals("Student"))mylist.add(new Student());
			if(s.equals("Rockstar"))mylist.add(new Rockstar());
			if(s.equals("Hacker"))mylist.add(new Hacker());
		}
		in.close();
		System.out.println(count(mylist));
	}
}