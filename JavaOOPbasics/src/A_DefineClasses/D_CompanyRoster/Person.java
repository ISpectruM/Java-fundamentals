package A_DefineClasses.D_CompanyRoster;

public class Person {
    private String name;
    private int age;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public Person(){
        this("No name",1);
    }

    public Person(int age){
        this("No name",age);
    }

    public  Person(String name,int age ){
        this.age = age;
        this.name = name;
    }
}

