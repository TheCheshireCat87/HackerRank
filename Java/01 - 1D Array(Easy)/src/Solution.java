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
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = 0;
        int s = 0;
        if(n == 1 && in.nextInt() < 0)
                s++;
        else{
            int[] ns = new int[n];   
            for(int i = 0; i < n; i++){
                ns[i] = in.nextInt();
            }
            for(int i = 0; i < n; i++){
                c = ns[i];
                if(c < 0)
                    s++;
                for(int j = i + 1; j < n; j++){
                    c += ns[j];
                    if(c < 0){
                        s++;
                    }
                }
            }
        }
        System.out.println(s);
        in.close();
    }
}
