
import  java.util.*;
import java.io.*;
class Customer extends Exception{
    private String cname,password,phNo;
	String getName(){
		return this.cname;
	}
	void setName(String s){
		this.cname=s;
	}
	String getPassword(){
		return this.password;
	}
	void setPassword(String s){
		this.password=s;
	}
	String getPhno(){
		return this.phNo;
	}
	void setPhno(String s){
		this.phNo=s;
	}
	
}
public class Customers  extends Exception
{
    private HashMap<Integer,Customer> hm=new HashMap<Integer,Customer>();
    Customers(){
        Customer l=new Customer();
        l.setName("Revanth");
        l.setPassword("Password");
        l.setPhno("9703531900");
        hm.put(16900,l);
        l=new Customer();
        l.setName("Vamshi");
        l.setPassword("Password");
        l.setPhno("6303877578");
        hm.put(17900,l);
        l.setName("Pranay");
        l.setPassword("Password");
        l.setPhno("9645555541");
        hm.put(54545,l);
        l.setName("Vijay");
        l.setPassword("Password");
        l.setPhno("8686156545");
        hm.put(28285,l);
        l.setName("Abhilash");
        l.setPassword("Password");
        l.setPhno("725651900");
        hm.put(23546,l);
        l.setName("Sandeep");
        l.setPassword("Password");
        l.setPhno("5656531900");
        hm.put(02020,l);
        l.setName("Aditya");
        l.setPassword("Password");
        l.setPhno("984851900");
        hm.put(42425,l);  
    }
     void allCustoDetails(){
         System.out.println("Customer id\t\t\tCustomer Name\t\t\t Contact no");
        for(Map.Entry e:hm.entrySet()){
            Customer c=(Customer)e.getValue();
            
            System.out.println(e.getKey()+"\t\t\t\t"+c.getName()+"\t\t\t\t"+c.getPhno());
        }
    }
    void remove(int cid){
        if(hm.containsKey(cid)){
            System.out.println("User "+this.hm.get(cid).getName()+" Removed successfully");
            this.hm.remove(cid);
        }
    }
    boolean login(int cid,String password){
        if(hm.containsKey(cid) && hm.get(cid).getPassword().equals(password)){
            return true;
        }
		//System.out.println(hm.get(cid).getPassword());
        return false;
    }
    String getName(int cid){
        return this.hm.get(cid).getName();
    }
    String getPhno(int cid){
        return this.hm.get(cid).getPhno();
    }
    void signup(){
        int cid;
        String phno;
        Scanner sc=new Scanner(System.in);
        String name,password;
        while(true){
        System.out.print("Enter 5 digit customer id: ");
        cid=sc.nextInt();
		if(String.valueOf(cid).length()!=5){
			System.out.println("Enter valid id number");
			continue;
		}
        if(hm.containsKey(cid)){
            System.out.print("\nalready exists select new one ");
        }
        else
        break;
        }
        Console con=System.console();
        System.out.print("Create password: ");
        password=String.valueOf(con.readPassword());
        System.out.print("Enter name: ");
        name=sc.next();
        System.out.print("Enter phno: ");
        phno=sc.next();
        Customer l=new Customer();
        l.setName(name);
        l.setPhno(phno);
        l.setPassword(password);
        hm.put(cid,l);
    }
/*public static void main(String[] args) {
Customers m=new Customers();
int cid;String password;
int c;
Scanner sc=new Scanner(System.in);
System.out.println("Hello Welcome to the Delta Online Shopping \nPress 1 for login\nNew User? Press 2 for signup");
c=sc.nextInt();
switch(c){
case 1:	
System.out.print("Enter Customer Id: ");
cid=sc.nextInt();
Console con=System.console();
System.out.print("Enter Password: ");
password=String.valueOf(con.readPassword());
try{
if(m.login(cid,password)){
   System.out.print("Login success");
}
else
throw new Customer();
}
catch(Customer e){
    System.out.println("Invalid User");
}break;
case 2:m.signup();
System.out.println("Signed up successfully");
break;
default :System.out.println("Enter a Valid choice Broo...");
}
}*/
}