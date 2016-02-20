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
import java.util.LinkedList;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int T = in.nextInt();
       while(0 < T--){
           int n = in.nextInt();
           int m = in.nextInt();
           int[] board = new int[n];
           for(int i = 0; i < n; i++){
               board[i] = in.nextInt();
           }
           if(winnable(m, board))
               System.out.println("YES");
           else
               System.out.println("NO");
       }
       in.close();
    }
    
    public static boolean winnable(int m, int[] board){
        boolean won = false;
        Map<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
        LinkedList<Integer> moves = new LinkedList<Integer>();
        int currentMove = 0;
        moves.add(0);
        if(m >= board.length)
            won = true;
        else{
            while(moves.size() > 0 && !won){
                currentMove = moves.poll();
                visited.put(currentMove, true);                
                if((currentMove >= board.length) || (currentMove + m >= board.length) || (currentMove + 1 >= board.length))
                    won = true;
                else{
                    if(board[currentMove + m] != 1 && !visited.containsKey(currentMove + m))
                        moves.add(currentMove + m);
                    if(board[currentMove + 1] != 1 && !visited.containsKey(currentMove + 1))
                        moves.add(currentMove + 1);
                    if(currentMove > 0 && board[currentMove - 1] != 1 && !visited.containsKey(currentMove - 1))
                        moves.add(currentMove - 1);
                }
            }
        }       
        return won;
    }
}