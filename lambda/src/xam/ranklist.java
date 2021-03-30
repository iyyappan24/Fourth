package xam;
import java.util.*;
import java.util.stream.*;
public class ranklist {
	public static void main(String[] args){
		
	 Map<student,Character> mp = new TreeMap<student,Character>((student s1, student s2)->s1.getRollNo()-s2.getRollNo());
	 mp.put(new student("rio","yam",23),'A');
	 mp.put(new student("rio","krish",12), 'A');
	 mp.put(new student("lio","dan",23), 'B');
	 mp.put(new student("vir","kio",27),'C');
	System.out.println("the students performance :");
	System.out.println("according to rollno:");
	for(Map.Entry<student,Character> mt : mp.entrySet()){
		String fname = mt.getKey().getFirstName();
		String lname = mt.getKey().getLastName();
		int num = mt.getKey().getRollNo();
		char c =mt.getValue();
		System.out.println("FirstName : "+fname+" LastName : "+lname+" RollNo : "+num+" Grade : "+ c);
	}
	System.out.println("according to FirstName:");
    mp.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(student::getFirstName))).forEach(e->{
    	String fname = e.getKey().getFirstName();
    	String lname = e.getKey().getLastName();
    	int roll = e.getKey().getRollNo();
    	char c = e.getValue();
    	System.out.println("FirstName : "+fname+" LastName : "+lname+" Rollno : "+roll+" Grade : "+c);
    });
    System.out.println("according to last Name :");
    mp.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(student::getLastName).reversed())).forEach(e->
	{
		String fname = e.getKey().getFirstName();
		String lname = e.getKey().getLastName();
		int num = e.getKey().getRollNo();
		char c =e.getValue();
		System.out.println("FirstName : "+fname+" LastName : "+lname+" RollNo : "+num+" Grade : "+ c);     	
	});

   System.out.println("based on grade:"); 
    mp.entrySet().stream().sorted(Map.Entry.comparingByValue()).sorted((e1,e2)-> e2.getValue().compareTo(e1.getValue())).forEach(e->{
    	String fname = e.getKey().getFirstName();
    	String lname = e.getKey().getLastName();
    	int roll = e.getKey().getRollNo();
    	char c = e.getValue();
    	System.out.println("FirstName : "+fname+" LastName : "+lname+" Rollno : "+roll+" Grade : "+c);});
    
}
}