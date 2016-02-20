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
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int[] nums = new int[10000001];
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;
        int numUnique = 0;
        boolean isUnique = false;
        for(int i = 0; i < n; i++){
            int num = in.nextInt();
            if(i < m){
                if(nums[num] == 0){
                    numUnique++;
                }
                nums[num]++;
                deque.add(num);
            }else{
                int top = (int)deque.peek();
                deque.pop();
                nums[top]--;
                if(nums[top] == 0)
                    numUnique--;
                if(nums[num] == 0)
                    numUnique++;
                nums[num]++;
                deque.add(num);
                isUnique = true;
            }
            if(isUnique)
                max = max >= numUnique ? max : numUnique;
        }
        in.close();
        max = max >= numUnique ? max : numUnique;
        System.out.println(max);
    }
}