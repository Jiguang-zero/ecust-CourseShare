class Person{
	public String name;//姓名
	public String Id; //身份证 
	private int   age;  //年龄 ：私有属性

	public Person(){	}
	public Person(String name,String Id, int age){	
	    this.name=name; this.Id=Id;  this.age=age;
	}
    
	public void setName(String name){ this.name=name;}
	public String getName(){return name;}

	public void setId(String Id){ this.Id=Id;}
	public String getId(){return Id;}

	public void setAge(int age){ this.age=age;}
	public int getAge(){return age;} 

	public String toString(){return "Person类";}
}

public class  Student  extends Person{
	public String no;//学号
	public String school; //学校 
    
	public Student(){	}
	public Student(String name,String Id, int age,
		String no,String school ){	
	    this.name=name; this.Id=Id;  setAge(age);
		this.no=no;this.school=school; 
	}

	public void setNo(String no){ this.no=no;}
	public String getNo(){return no;}

	public void setSchool(String school){ this.school=school;}
	public String getSchool(){return school;}

    //overriding
    public String toString(){return "Student类";}

	public static void main(String[] args) 	{
		String  name=null; 
		String id=null;
		int     age=0;  

		Student tom=new Student(); 
		 tom.setName("Tom");
		 tom.setId("3301");
		 tom.setAge(19); 
		 tom.setNo("2006");
		 tom.setSchool("Ecust");

		  age=tom.getAge();
		  name=tom.getName(); 
		  id=tom.getId();

		System.out.println( age);
		System.out.println( name);
		System.out.println( id);
		System.out.println(tom.toString());  

	}
}
