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

interface AdvancedArithmetic{
  public abstract int divisorSum(int n);
}

class MyCalculator implements AdvancedArithmetic{
    public MyCalculator(){}
    public int divisorSum(int n){
        int sum = 0;
        if(n > 1){
            for(int i = 1; i < Math.sqrt(n); i++){
                if(n % i == 0){
                    sum += (i + (n / i));
                }
            }
        }
        else
            return n;
        return sum;
    }
}

class Solution{
    public static void main(String []argh)
    {
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        System.out.print(my_calculator.divisorSum(n)+"\n");
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o)
    {
        @SuppressWarnings("rawtypes")
		Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++)
        {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}