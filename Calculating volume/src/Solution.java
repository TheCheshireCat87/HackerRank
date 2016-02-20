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
import java.io.IOException;
import java.security.Permission;

class Calculate{
    Scanner in;
    Calc_Vol output;
    
    Calculate(){
        in = new Scanner(System.in);
        output = new Calc_Vol();
    }
    
    static Calc_Vol get_Vol(){
        return new Calc_Vol();
    }
    
    int getINTVal() throws NumberFormatException, IOException{
        return in.nextInt();
    }
    
    Double getDoubleVal() throws NumberFormatException, IOException{
        return in.nextDouble();
    }
}

class Calc_Vol{
    double main(int... a){
        double res = 0.0;
        
        for(int i : a){
            if(i < -100 || i > 100)
                throw new NumberFormatException("Out of range");
            if(i <= 0)
                throw new NumberFormatException("All the values must be positive");
        }
        
        if(a.length > 1)
            res = a[0] * a[1] * a[2];
        else
            res = Math.pow(a[0], 3);
        
        return res;
    }

    double main(double... a){
        double res = 0.0;
        
        for(double i : a){
            if(i < -100 || i > 100)
                throw new NumberFormatException("Out of range");
            if(i <= 0)
                throw new NumberFormatException("All the values must be positive");
        }
        
        if(a.length == 3)
            res = a[0] * a[1] * a[2];
        else if(a.length == 2)
            res = Math.PI * Math.pow(a[0], 2) * a[1];
        else
            res = ((double)2 / 3) * Math.PI * Math.pow(a[0], 3);
        
        return res;
    }
    
     void display(double out){
        System.out.printf("%.3f\n", out);
    }
}

public class Solution{
	public static void main(String[] args) {
		Do_Not_Terminate.forbidExit();		
		try{
			Calculate cal = new Calculate();
			int T = cal.getINTVal();
			while(T-- > 0){
			double volume = 0.0d;		
			int ch = cal.getINTVal();			
			if(ch == 1){
				int a = cal.getINTVal();
				volume = Calculate.get_Vol().main(a);
			}
			else if(ch == 2){
				int l = cal.getINTVal();
				int b = cal.getINTVal();
				int h = cal.getINTVal();
				volume = Calculate.get_Vol().main(l,b,h);
			}
			else if(ch == 3){
				double r = cal.getDoubleVal();
				volume = Calculate.get_Vol().main(r);
				
			}
			else if(ch == 4){
			
				double r = cal.getDoubleVal();
				double h = cal.getDoubleVal();
				volume = Calculate.get_Vol().main(r,h);	
			}
			cal.output.display(volume);
			}			
		}
		catch (NumberFormatException e) {
			System.out.print(e);
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}
}
/**
 *This class prevents the user from using System.exit(0)
 * from terminating the program abnormally.
 */
class Do_Not_Terminate {
    public static class ExitTrappedException extends SecurityException {
		private static final long serialVersionUID = 1L;
	}
 
    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}//end of Do_Not_Terminate
