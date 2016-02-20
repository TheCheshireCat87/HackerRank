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

public class Solution {
	public static int B;
	public static int H;
	public static boolean flag;

	static{
	    try{
	        Scanner in = new Scanner(System.in);
	        B = in.nextInt();
	        H = in.nextInt();
	        in.close();
	        if(B > 0 && B <= 100 && H > 0 && H <= 100){
	            flag = true;
	        }
	        else{
	            flag = false;
	            throw new Exception("Breadth and height must be positive");
	        }
	    }
	    catch(Exception e){
	        System.out.println(e);
	    }
	}
	
	public static void main(String[] args) {
		if(flag){
			int area = B * H;
			System.out.println(area);
		}
	}

}
