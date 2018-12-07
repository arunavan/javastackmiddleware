package com.cts;
class Person {
	String name;
	String contact;
	String address;
	static String country1="India";
	Person()
	{
		name="ram";
		contact="98989823";
	}
	public Person(String name, String contact) {
		this.name = name;
		this.contact = contact;
	}
	void show()
	 {
		 System.out.println(name+"  "+contact);
	 }
	
}
class Student extends Person
{    String cname;
    int marks;
    String address;
     Student()
    {   //super();
    	cname="JKT";
    	marks=99;
    }
	public Student(String address) {
		this();
		//super("scott","78675645");
		//this.cname = cname;
		//this.marks = marks;
		this.address=address;
	}
	static void disp()
	{	  Student ss=new Student();
		System.out.println("static function"+ss.cname);
	}
	void show()
	{   super.show();
		System.out.println("sub class"+ this.address+"  "+super.address);
	}
}
public class Demo {
	
	static String  country="India";  //1
	Demo()//5
	{
		System.out.println("in constructor");
	}
	
	{  //4
		System.out.println("instance block1");
	}
	{
		System.out.println("instance block2");
	}
	static {//2
		
		System.out.println("static block");
	}
	
	public static void main(String[] args) {//3
		// TODO Auto-generated method stub
 System.out.println(" Welcome to Core java training");
 
    Person p=new Person();
    p.show();
    Person p1=new Person("kiran","5676897898");
    System.out.println(p+"  "+p1);
    p1.show();
    Student s=new Student("Chennai");
    Student.disp();
    System.out.println(s.name+"  "+s.contact+"  "+s.cname+"  "+s.marks+s.address);
    System.out.println(country);
    System.out.println(Person.country1);
    Demo d1=new Demo();
    Demo d2=new Demo();
	}

}
