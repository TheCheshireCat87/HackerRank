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
public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] weights = new int[6];
		
		for(int i = 0; i < 6; i++){
			weights[i] = in.nextInt();
		}
		in.close();
		
		fixGraph(weights);
	}
	
	public static void fixGraph(int[] a){
		int minChange = Integer.MAX_VALUE;
		
		minChange = getBranchMinWeight(a, 0); 
		
		minChange = Math.min(0, minChange);
		
		System.out.println(Math.abs(minChange));
	}
	
	public static int getBranchMinWeight(int[] a, int i){
		if(i >= a.length)
			return Integer.MAX_VALUE;
		else{
			int minWeight = a[i];
			int lInd = i + 1;
			int rInd = 4 + i;
			
			if(lInd < 4 && rInd >= a.length)
				minWeight += getBranchMinWeight(a, lInd);
			else if(rInd < a.length && lInd >= 4)
				minWeight += getBranchMinWeight(a, rInd);
			else if(lInd < 4 && rInd < a.length)
				minWeight += Math.min(getBranchMinWeight(a,  lInd), getBranchMinWeight(a, rInd));
			return minWeight;
		}
	}
}