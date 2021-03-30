package xam;
import java.util.*;
import java.util.stream.*;
public class studentimplementation {
	
	public int total(List<student> lis){
		int res =lis.stream().mapToInt(e->e.getmarks()).sum();
		return res;
	}
	public List<String> fullname(List<student> lis){
		
		List<String> l = lis.stream().map(e->{
			String fname = e.getFirstName();
			String lname = e.getLastName();
			String result = fname+" "+lname;
			return result;
		}).collect(Collectors.toList());
		return l;
	}
	public List<String> lo(List<student> lis){
		List<String> lj = lis.stream().map(e->{
			String fname = e.getFirstName();
			String lname = e.getLastName();
			String res="";
			char c = fname.charAt(0);
			String g = String.valueOf(c);
			String h = g.toUpperCase();					
			String nfname = fname.replace(g,h);
			char b = lname.charAt(0);
			String a = String.valueOf(b);
			String v = a.toUpperCase();
			String nlname = lname.replace(a,v);
			res = nfname + " " + nlname;
			return res;
			}).collect(Collectors.toList());
		return lj;
	}

	public static void main(String[] args){
	 List<student> list = new ArrayList<student>();
	 list.add(new student("meera","pik",57));
	 list.add(new student("lucy","kio",68));
	 list.add(new student("namrata","mish",74));
	 list.add(new student("pinku","rita",53));
	 studentimplementation st = new studentimplementation();
	 int res = st.total(list);
	 System.out.println(res);
	 System.out.println("--------------------");
	 List<String> lo = st.fullname(list);
	 lo.stream().forEach(e->System.out.println(e));
	 System.out.println("--------------------");
	 List<String> lp = st.lo(list);
	lp.stream().forEach(e->System.out.println(e));
		
	}
	
}
