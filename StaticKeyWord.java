

class Mobile
{
    String brand;
    int price;
    String network;
    static String name;
    void show ()
    {
        System.out.println(name+" "+brand+" "+network+" "+price);
    }

}
public class StaticKeyWord{
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();

        Mobile.name = "SmartPhone";

        obj1.brand = "apple";
        obj1.network = "5G";
        obj1.price = 1000;

        Mobile obj2 = new Mobile();
        obj2.brand = "OnePlus";
        obj2.network = "5G";
        obj2.price = 1049;

        obj1.show();
        obj2.show();




   }
}
