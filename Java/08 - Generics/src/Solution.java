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
import java.lang.reflect.Method;

class Printer
{
   //Write your code here
   static <T> void printArray(T[] items){
       for(T item : items){
           System.out.println(item);
       }
   }
}
public class Solution
{
    public static void main( String args[] )
    {
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello","World"};
        Printer.printArray( intArray  );
        Printer.printArray( stringArray );
        int count = 0;
        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();
            if(name.equals("printArray"))
              count++;
        }
        if(count > 1)System.out.println("Method overloading is not allowed!");
        assert count == 1;
    } 
}