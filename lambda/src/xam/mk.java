package xam;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;
public class mk {
public static void main(String[] args){
       List<student> lis = new ArrayList<student>();
       lis.add(new student("yam","lilo",78999));
       lis.add(new student("ril","mik",57777));
       lis.add(new student("nok","rik",67999));
       student s = lis.stream().min((s1,s2)->{
    	   if(s1.getRollNo()==s2.getRollNo()){
    		   return 0;
    	   }
    	   else if(s1.getRollNo()>s2.getRollNo()){
    		   return 1;
    	   }
    	   else{
    		   return -1;
    	   }
       }).get();
       System.out.println("FirstName : "+s.getFirstName()+" LastName : "+s.getLastName()+" Salary : "+s.getRollNo());

}
}