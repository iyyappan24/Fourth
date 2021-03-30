package xam;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;
public class str {
     public static void main(String[] args){
    	 Scanner sc = new Scanner(System.in);
    	 List<String> lis = new ArrayList<String>();
    	 lis.add("lama");
    	 lis.add("nithu");
    	 lis.add("srisha");
    	   String n ="";
           String res ="";
           List<String> li = new ArrayList<>();
    	 for(String l : lis){
              char[] ar = l.toCharArray();
              char[] br = new char[ar.length];
              for(int i=0;i<ar.length;i++){
            	  res = String.valueOf(ar[i]);
            	  if(i!=0 && i!=ar.length-1){
            	  n=n+res;
            	  }
            	  if(i == ar.length-1){
            		  n=n+res.toUpperCase();
            	  }
            	  if(i==0){
            		  n=n+res.toUpperCase();
            	  }
            	     
              }
               li.add(n);
               n="";
    	 }
    	 for(String f : li){
    		 System.out.println(f);
    	 }
     }
}