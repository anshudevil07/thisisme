
public class JavaDay3 {
          
	public static void main(String args[]) {
		
		EmployeeData o1=new EmployeeData("himansu","Ajay","Rahul",899,9876) ;
		EmployeeData o2=new EmployeeData("himan","Aja","Rahu",89,987) ;
		
		
		System.out.println(o1.Dept+" "+o1.Eid+" "+o1.Ename+" "+o1.Hrname+" "+o1.sal);
		System.out.println(o2.Dept+" "+o2.Eid+" "+o2.Ename+" "+o2.Hrname+" "+o2.sal);
		}
	
}
	
	class EmployeeData{
		String Ename,Dept,Hrname;
		double sal;
		int Eid;
		
		EmployeeData(String en,String dep,String name,double sl,int id){
			this.Ename=en;
			this.Eid=id;
			this.sal=sl;
			this.Dept=dep;
			this.Hrname=name;
			
		}
	}

