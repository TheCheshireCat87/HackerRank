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

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(N);
        for(int i = 0; i < N; i++){
            int D = in.nextInt();
            list.add(new ArrayList<Integer>(D));
            if(D > 0){
                for(int j = 0; j < D; j++){
                    list.get(i).add(in.nextInt());
                }
            }
        }
        int Q = in.nextInt();
        for(int i = 0; i < Q; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            if(list.size() > (x - 1) && list.get(x - 1).size() > (y - 1))
                System.out.println(list.get(x - 1).get(y - 1));
            else
                System.out.println("ERROR!");
        }
        in.close();
    }
}