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
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        in.close();
        int sum = 0;
        int max = -63;
        for(int i = 0; i <= 3; i++){
            for(int j = 0; j <= 3; j++){
                sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                sum += arr[i + 1][j + 1];
                sum += arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if(sum > max){
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}