package xam;

public class student implements Comparable<student>{
	private String firstName;
	private String lastName;
	private int marks;
	public student(){
		
	}
	public student(String firstName,String lastName,int marks){
		this.firstName = firstName;
		this.lastName = lastName;
		this.marks = marks;
		
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
    public void setmarks(int marks){
    	this.marks=marks;
    }
    public String getFirstName(){
    	return firstName;
    }
    public String getLastName(){
    	return lastName;
    }
    public int getmarks(){
    return marks;
    }
}
