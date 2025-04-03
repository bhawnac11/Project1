class Constructor{

// declared instance variables.

String name;
int age;

public static void main(String[]args){

Constructor c1 = new Constructor("bhawna" + 34);
System.out.println(c1.name);


   }


public Constructor(String name,int age){

this.name=name;
this.age=age;
}

}


