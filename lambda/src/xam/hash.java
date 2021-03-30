package xam;
import java.util.*;
public class hash {
	public static void main(String[] args){
		Map<student,String> mp = new HashMap<student,String>();
		mp.put(new student("meera","lok",67),"Trichy");
		mp.put(new student("latha","tar",45), "chennai");
		mp.put(new student("meera","lok",67), "Trichy");
		for(Map.Entry<student, String> k : mp.entrySet()){
			System.out.println("fname : "+k.getKey().getFirstName()+" lname : "+k.getKey().getLastName()+" roll : "+k.getKey().getRollNo()+" district :"+k.getValue());
		}
		System.out.println("sorted:");
		mp.entrySet().stream().sorted((e1,e2)->e1.getKey().getFirstName().compareTo(e2.getKey().getFirstName())).forEach((e)->{
		
			String fname = e.getKey().getFirstName();
			int lname = e.getKey().getRollNo();
			String dis = e.getValue();
			System.out.println(fname+" "+lname+" "+dis);
		});
	}

}
