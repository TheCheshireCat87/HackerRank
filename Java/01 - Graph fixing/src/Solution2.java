import java.util.Arrays;
import java.util.Scanner;

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

public class Solution2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] weights = new int[6];
		
		for(int i = 0; i < 6; i++){
			weights[i] = in.nextInt();
		}
		in.close();
		
		bellmanFord(weights);
	}
	
	public static void bellmanFord(int[] a){
		int[] minWeights = new int[a.length];
		Arrays.fill(minWeights, Integer.MAX_VALUE);
		minWeights[0] = 0;
		
		int i = 5;
		int changed = 0;
		int minCycleWeight = Integer.MAX_VALUE;
		while(0 <= i--){
			System.out.println("Loop: " + i);
			
			for(int j = 0; j < a.length; j++){
				int leftInd = (j + 1) % 6;
				int rightInd = 4 + (j % 2);
				int leftChild = a[leftInd];
				int rightChild = a[rightInd];
				changed = 0;
				int leftWeight = minWeights[j] + leftChild;
				int rightWeight = minWeights[j] + rightChild;
				
				if(leftWeight < minWeights[leftInd]){
					changed = Math.abs(minWeights[j]) - Math.abs(leftWeight);
					minWeights[leftInd] = leftWeight;
					System.out.println("Min weight " + leftInd + ": " + changed);
				}
				if(rightWeight < minWeights[rightInd]){
					changed = Math.abs(minWeights[j]) - Math.abs(rightWeight);
					minWeights[rightInd] = rightWeight;
					System.out.println("Min weight " + rightInd + ": " + changed);
				}
			}
			
			if(changed == 0){
				System.out.println(0);
				break;
			}
			if(i == -1)
				System.out.println(Math.abs(changed));
		}
	}
}
