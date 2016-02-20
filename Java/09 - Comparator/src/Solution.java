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
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Checker{
    public Comparator<Player> desc = null;
    public Checker(){
        desc = new Comparator<Player>(){
            public int compare(Player a, Player b){
                int i = a.score - b.score;
                
                if(i == 0)
                    i = a.name.compareTo(b.name);
                return -i; 
            }
        };
    }
} 

class Player{
	String name;
	int score;
}

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine().trim());
		String s;
		StringTokenizer st;
		Player[] Player = new Player[N];
		Checker check = new Checker();
		for(int i = 0; i < N; i++){
			s = br.readLine().trim();
			st = new StringTokenizer(s);
			Player[i] = new Player();
			Player[i].name = st.nextToken();
			Player[i].score = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(Player,check.desc);
		for(int i = 0; i < Player.length; i++){
			System.out.printf("%s %s\n",Player[i].name,Player[i].score);
		}
    }
}
