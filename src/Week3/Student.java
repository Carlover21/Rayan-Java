package Week3;

public class Student {
    private int id;
    private String name;
    
    //Constructor
    public Student(int id, String name)
    {
        this.id= id;
        this.name= name;
    }


    //print method
    public void print()
    {
        System.out.print("ID: "+ this.id + "\t");
        System.out.println("Name: "+ this.name);
    }

}
