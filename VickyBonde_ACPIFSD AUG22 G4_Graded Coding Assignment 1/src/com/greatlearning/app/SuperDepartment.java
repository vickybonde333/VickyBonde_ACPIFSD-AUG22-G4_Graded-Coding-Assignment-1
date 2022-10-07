package com.greatlearning.app;

public class SuperDepartment {

	public static void main(String[] args) {

		//Driver class //
		SuperDepartment obj = new SuperDepartment() ;
		String C = obj.department();
		String D = obj.getTodaysWork();
		String E = obj.getWorkDeadline();
		String F = obj.isTodayAHoliday();
		
		System.out.println(C);
		System.out.println(D);
		System.out.println(E);
		System.out.println(F);
	
		AdminDepartment obj1 = new AdminDepartment ();
		String g = obj1.departmentName();
		String h = obj1.getTodaysWork();
		String i = obj1.getWorkDeadline();
		String j = obj.isTodayAHoliday();
		
		System.out.println(g);
	    System.out.println(h);
	    System.out.println(i);
	    System.out.println(j);     
	    
	    HrDepartment obj2 = new HrDepartment();
	    String k = obj2.departmentName();
	    String l = obj2.doActivity();
	    String m = obj2.getTodaysWork();
	    String a = obj2.getWorkDeadline();
	    String n = obj.isTodayAHoliday();
	    
	    System.out.println(k);
	    System.out.println(l);
	    System.out.println(m);
	    System.out.println(a);
	    System.out.println(n);
	    
	    Techdepartment obj3 = new Techdepartment();
	    String o = obj3.departmentName();
	    String p = obj3.getTodaysWork();
	    String q = obj3.getWorkDeadline();
	    String r = obj3.getTechStackInformation();
	    String s = obj.isTodayAHoliday();
	    
	    System.out.println(o);
	    System.out.println(p);
	    System.out.println(q);
	    System.out.println(r);  
	    System.out.println(s);
	    
	}
	public String department()
	{
	 System.out.println();
	 return "Welcome to Super Department";
	}
	public String getTodaysWork()
	{
	 System.out.println();
	 return "No Work as of now";
	}
	public String getWorkDeadline()
	{
	 System.out.println();
	 return "Nil";
	}
	public String isTodayAHoliday()
	{
	 System.out.println();
	 return "Today is not a holiday";
	}
}

 class AdminDepartment extends SuperDepartment {
	
	public String departmentName()
	{
		System.out.println();
		return "Welcome to Admin Department";
	}
	public String getTodaysWork()
	{
		System.out.println();
		return "Complete your documents Submission";
	}
	public String getWorkDeadline()
	{
		System.out.println();
	   return "Complete by EOD";
	}
}

  class HrDepartment extends SuperDepartment {
	 
	 public String departmentName()
	 {
		 System.out.println();
		 return "Welcome to Hr Department";
	 }
	 public String getTodaysWork()
	 {
		 System.out.println();
		 return "Fill today’s timesheet and mark your attendance";
	 }
		 public String getWorkDeadline()
		 {
			 System.out.println();
			 return "Complete by EOD";
	 }
		 public String doActivity()
		 {
			 System.out.println();
			 return "team Lunch";
	 }
}
 
  class Techdepartment extends SuperDepartment {
	 
	 public String departmentName()
	 {
		 System.out.println();
		 return "Welcome to Tech Department";
	 }
	 public String getTodaysWork()
	 {
		  System.out.println();
		  return"Complete coding of module 1";
	 }
	 public String getWorkDeadline()
	 {     
		 System.out.println();
		 return"Complete by EOD";
	 }
	 public String getTechStackInformation()
	 {
		 System.out.println();
		 return"Core Java";	
		}
	}
 