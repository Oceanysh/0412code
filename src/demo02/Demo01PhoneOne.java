package demo02;

public class Demo01PhoneOne {

    public static void main(String[] args) {


        Phone one=new Phone();

        System.out.println(one.color);

        System.out.println(one.name);

        System.out.println(one.price);

        System.out.println("============");


        one.color="黑色";

        one.name="雷军";

        one.price=4999.0;

        System.out.println(one.color);

        System.out.println(one.name);

        System.out.println(one.price);

        System.out.println("============");


        one.call("雷军");

        one.sendMessage();

    }
}
