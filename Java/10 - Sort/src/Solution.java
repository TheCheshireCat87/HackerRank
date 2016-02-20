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
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student implements Comparable<Student>{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	
	public int getId() { return id; }
	public String getFname() { return fname; }
	public double getCgpa() { return cgpa; }
    
    public int compareTo(Student s){
        int res = Double.compare(this.cgpa, s.cgpa);        
        if(res != 0)
            return -res;            
        res = this.fname.compareTo(s.fname);            
        if(res != 0)
            return res;            
        return Integer.compare(this.id, s.id);
    }
}

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());      
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();         
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);         
			testCases--;
		}  
		in.close();
		Collections.sort(studentList);
		for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}
