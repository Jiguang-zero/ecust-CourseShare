class  Parent {
	public int no=0;		
	public String name=null;
    protected String address=null;
	String email=null;
	private int age=0; 
}
public class child  extends Parent {
	public String msn=null;    
	public void setNo(int no){this.no=no;}
	public int getNo(){return no;}
	
	public void setName(String name){this.name=name;}
	public String getName(){return name;}

	public void setAddress(String address){this.address=address;}
	public String getAddress(){return address;}

	public void setEmail(String email){this.email=email;}
	public String getEmail(){return email;}

    
	public void setAge(int age){this.age=age;}
	public int getAge(){return age;}
    

	public static void main(String[] args){
		child  c=new child ();		 
		 c.setEmail("ecust");
		System.out.println(c.getEmail());
	}
}

 
