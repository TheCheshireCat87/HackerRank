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

abstract class Book
{
   String title;
   abstract void setTitle(String s);
   String getTitle() { return title; }
}

class MyBook extends Book{    	
    public void setTitle(String s){
        title = s;
    }
}

public class Solution
{   
	public static void main(String []args)
	{
		//Book new_novel=new Book(); This line error: Book is abstract; cannot be instantiated
		Scanner in = new Scanner(System.in);
		String title = in.nextLine();
		in.close();
		MyBook new_novel = new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());      
	}
}
