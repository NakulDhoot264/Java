class student1{
    String name;
    int age;

    student1( String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    student1(student1 S)
    { 
        this.name= S.name;
        this.age= S.age;
    }

    void display()
    { 
        System.out.println("Name:" + name +"Age:" +age);


    }
}
public class student
{
    public static void main(String[] args)
    {
        student1 S = new student1("Ojus",18);
        S.display();

        student1 S2 = new student1(S);
        S2.display();
    }
}
