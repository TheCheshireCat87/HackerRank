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
import java.math.BigDecimal;
import java.util.Scanner;
class HeapSort{
	@SuppressWarnings("rawtypes")
	public Comparable[] sort(Comparable[] a, int count){
    	int start = getParent(count);    	
    	while(0 <= start){
    		a = siftDown(a, start, count);
    		start--;
    	}
    	int end = count;
    	while(end > 0){
    		Comparable tmp = a[0];
    		a[0] = a[end];
    		a[end] = tmp;
    		end--;
    		a = siftDown(a, 0, end);
    	}
    	return a;
    }
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
	private Comparable[] siftDown(Comparable[] a, int start, int end){
    	int root = start;
    	int child = getLeftChild(root);
    	int swap = root;
    	while(child <= end){ 
    		if((a[swap]).compareTo(a[child]) == 1){
    			swap = child;
    		}
    		if(child + 1 <= end){
    			if(a[swap].compareTo(a[child + 1]) == 1){
    				swap = child + 1;
    			}
    		}
    		if(swap == root){
    			break;
    		}else{
    			Comparable tmp = a[swap];
    			a[swap] = a[root];
    			a[root] = tmp;
    			root = swap;
    		}	
    		child = getLeftChild(root);
    	}
    	return a;
    }
    
    public static int getParent(int i){
    	return (int) Math.floor((i - 1) / 2);
    }
    
    public static int getLeftChild(int i){
    	return (2 * i) + 1;
    }
    
    public static int getRightChild(int i){
    	return getLeftChild(i) + 1;
    }
}
class Solution{
    @SuppressWarnings("unchecked")
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        String[] s = new String[T + 2];
        for(int i=0; i < T; i++){
            s[i] = in.next();
        }
        in.close();   
        Comparable<BigDecimal>[] b = new BigDecimal[T];
        for(int i = 0; i < T; i++){
        	b[i] = new BigDecimal(s[i]);
        }
        b = new HeapSort().sort(b, T - 1);       
        
        for(int i = 0; i < T; i++){
        	s[i] = b[i].toString();
        }
        
        for(int i = 0; i < T; i++)
        {
            System.out.println(s[i]);
        }
    }
}