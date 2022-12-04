import java.util.*;
public final class  Birth{
   final String name;
   private final Date birth;
   
   Birth(String sName,Date dBirth){ 
     name=sName;birth= dBirth; 
    }
	
   final Date getBirth(){
      //birth=new Date(1988,10,11); cannot assign a value to final  variable birth
      return birth;
    }

   public static void main(String[] args) {
      Birth myBirth=new Birth("Tom",new Date(1984,10,11));
        // myBirth.name="Rose"; 	cannot assign a value to final  variable birth	
      System.out.println( myBirth.name);
      System.out.println(myBirth.getBirth().getYear());
      System.out.println(myBirth.getBirth().getMonth());
      System.out.println(myBirth.getBirth().getDate());
   }

}
