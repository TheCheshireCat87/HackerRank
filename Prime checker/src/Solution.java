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
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.HashSet;
import static java.lang.System.in;

class Prime{
    public void checkPrime(int... nums){
        String out = "";
        for(int n : nums){
            boolean isPrime = true;
            if(n == 1){
                isPrime = false;
            }else{
                if((n != 2) && (n > 0)){
                    for(int i = 2; i <= Math.sqrt(n); i++){
                        if(n % i == 0){
                            isPrime = false;
                            break;
                        }
                    }
                }
            }   
        
            if(isPrime) out += n + " ";
        }
        
        System.out.println(out);
    }
}

public class Solution {
	public static void main(String[] args) {
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(in));
			int n1=Integer.parseInt(br.readLine());
			int n2=Integer.parseInt(br.readLine());
			int n3=Integer.parseInt(br.readLine());
			int n4=Integer.parseInt(br.readLine());
			int n5=Integer.parseInt(br.readLine());
			Prime ob=new Prime();
			ob.checkPrime(n1);
			ob.checkPrime(n1,n2);
			ob.checkPrime(n1,n2,n3);
			ob.checkPrime(n1,n2,n3,n4,n5);	
			Method[] methods=Prime.class.getDeclaredMethods();
			Set<String> set=new HashSet<>();
			boolean overload=false;
			for(int i=0;i<methods.length;i++){
				if(set.contains(methods[i].getName())){
					overload=true;
					break;
				}
				set.add(methods[i].getName());
			}
			if(overload) throw new Exception("Overloading not allowed");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}	
}
