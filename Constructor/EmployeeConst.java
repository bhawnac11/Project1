class EmployeeConst{
String name;
int age;

EmployeeConst(String name, int age){
this.name = name;
this.age = age;
}

public static void main(String[]args){
EmployeeConst e1 = new EmployeeConst("Bhawna", 34);
EmployeeConst e2 = new EmployeeConst("Seerat", 4);
System.out.println(e1.name+ e1.age);
System.out.println(e2.name+ e2.age);
}


}

