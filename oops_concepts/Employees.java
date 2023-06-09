package oops_concepts;

class Employee
{
    private int empno;
    private String name;
    private double salary;

    public int getempno()
    {
        return empno;
    }
    
    public String getname() {
        return name;
    }
    
    public double getsalary() {
        return salary;
    }
    public void setempno(int e)
    {
        empno=e;
    }
    
    public void setname(String n) {
        name = n;
    }

    public void setsalary(double s) {
        salary = s;
    }
}

class Employees {

    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setempno(1);
        e1.setname("Person1");
        e1.setsalary(150000);
        System.out.println("Employee No.:"+e1.getempno()+"\tName:"+e1.getname()+"\tSalary:"+e1.getsalary());
        Employee e2 = new Employee();
        e2.setempno(2);
        e2.setname("Person2");
        e2.setsalary(75000);
        System.out.println("Employee No.:" + e2.getempno() + "\tName:" + e2.getname() + "\tSalary:" + e2.getsalary());

    }
}
