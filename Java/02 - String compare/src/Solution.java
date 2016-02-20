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
        String chars = in.next();
        int k = in.nextInt();    
        in.close();
        String smallest = chars.substring(0, k);
        String largest = chars.substring(0, k);
        
        for(int i = 0; i <= chars.length() - k; i++){
            String compareString = chars.substring(i, i+k);
            if(smallest.compareTo(compareString) > 0){
                smallest = compareString;
            }
            if(largest.compareTo(compareString) < 0){
                largest = compareString;
            }
        }
        
        System.out.println(smallest);
        System.out.println(largest);
    }
}
