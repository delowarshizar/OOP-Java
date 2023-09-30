public class Teacher {
    int mobile;
    String Name,Adress;
    Teacher(String x,String y,int z)
    {
        Name = x;
        Adress = y;
        mobile = z;
    }
    void Display()
    {
        System.out.println("Name: "+Name);
        System.out.println("Adress: "+Adress);
        System.out.println("Mobile: "+mobile);
        System.out.println();
    }
}

public class SetInfo {
    public static void main(String[] args) {
        Teacher obj1 = new Teacher("Asharful","Tangail",834993);
        obj1.Display();

        Teacher obj2 = new Teacher("Delowar","Rajshahi",83843993);
         obj2.Display();
    }
}

