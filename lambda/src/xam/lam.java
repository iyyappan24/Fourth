package xam;
import java.util.*;
public class lam {
	public static void main(String[] args){
		List<student> lis = new ArrayList<>();
		lis.add(new student("kamala","haris",23));
		lis.add(new student("deepak","kumar",45));
		lis.add(new student("lio","andrew",34));
		lis.add(new student("meera","ram",18));
		/*
		System.out.println("list of students :");
		for(student s : lis){
			System.out.println("Firstname : "+s.getFirstName()+" , lastName : "+s.getLastName()+" , Rollno : "+s.getRollNo());
		}
		System.out.println();
		System.out.println("list of students sorted based on first name:");
		Collections.sort(lis,new Comparator<student>(){
			public int compare(student s1, student s2){
				return s1.getFirstName().compareTo(s2.getFirstName());
			}
		});
		for(student s : lis){
			System.out.println("Firstname : "+s.getFirstName()+" , lastName : "+s.getLastName()+" , Rollno : "+s.getRollNo());
		}
		System.out.println();
		System.out.println("list of students sorted based on RollNo : ");
		Collections.sort(lis,new Comparator<student>(){
			public int compare(student s1,student s2){
				if(s1.getRollNo()>s2.getRollNo()){
					return 1;
				}
				else if(s1.getRollNo()<s2.getRollNo()){
					return -1;
				}
				else{
					return 0;
				}
			}
		});
		for(student s : lis){
			System.out.println("Firstname : "+s.getFirstName()+" , lastName : "+s.getLastName()+" , Rollno : "+s.getRollNo());
		}
		System.out.println();
		
		*/
		System.out.println("students sorted based on last name :");
		Collections.sort(lis, (s1 , s2) ->{ return s1.getLastName().compareTo(s2.getLastName());
		
		});
		for(student s : lis){
			System.out.println("Firstname : "+s.getFirstName()+" , lastName : "+s.getLastName()+" , Rollno : "+s.getRollNo());
		}
	}

}
