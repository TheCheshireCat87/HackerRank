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

class myCalculator{
    public int power(int n, int p) throws Exception{
        if(n < 0 || p < 0)
            throw new Exception("n and p should be non-negative");
        else
            return (int)Math.pow(n, p);
    }
}

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);

        while(in.hasNextInt())
        {
            int n = in.nextInt();
            int p = in.nextInt();
            myCalculator M = new myCalculator();
            try{
                System.out.println(M.power(n,p));
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        
        in.close();
    }
}