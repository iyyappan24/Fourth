package xam;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;
public class liswithlamb {
	public static void main(String[] args){
           ArrayList<student> list = new ArrayList<student>();
           list.add(new student("pinku","lol",34));
           list.add(new student("lanki","joi",67));
           list.add(new student("pim","lol",45));
           list.add(new student("jonki","boy",74));
           list.add(new student("hanki","poy",23));
        //   list.stream().sorted((e1,e2)->e1.getLastName().compareTo(e2.getLastName())).forEach(System.out::println);
          // list.stream().map(e->e.getFirstName().toUpperCase()).forEach(e->System.out.println(e));
        int[] arr = {3,2,1,4};
        /*   long l = IntStream.of(arr).count();
           System.out.println(l);
           int  i = IntStream.of(arr).min().getAsInt();
           System.out.println(i);   */
           Set<student> d = list.stream().collect(Collectors.toSet());
           Set<student> kj = new TreeSet<>(d);
           for(student hj : kj){
          System.out.println(hj.getFirstName()+" "+hj.getLastName());
           }
         kj.stream().sorted((e1,e2)->e1.getFirstName().compareTo(e2.getFirstName())).forEach(e->System.out.println(e.getFirstName()+" "+e.getLastName()));
	     int pk =IntStream.of(arr).reduce((a,b)->a*b).getAsInt();
	     System.out.println(pk);
	}
}
