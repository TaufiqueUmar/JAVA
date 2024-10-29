class Student
{
    String name;
    int age;
    String address;

   Student()
{
    name="unknown";
    age=0;
    address="not available";
}

Student(int num){
   System.out.println("Student number is:" + num);
}
 
 public void setInfo(String name,int age)
{
   this.name=name;
   this.age=age;
}

 public void setInfo(String name,int age,String address)
{
   this.name=name;
   this.age=age;
   this.address=address;
}

public void showInfo()
{
   System.out.print(this.name+"\t");
   System.out.print(this.age+"\t");
   System.out.print(this.address+"\n");
}


public static void main(String[] args)
{
    Student s=new Student(1);
    s.setInfo("abc",25);
    s.showInfo();
    s.setInfo("xyz",35,"mumbai");
    s.showInfo();
}
}
