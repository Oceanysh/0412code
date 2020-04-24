package demo02;

public class Demo02PhoneTwo {

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







        Phone two=new Phone();

        System.out.println(two.color);

        System.out.println(two.name);

        System.out.println(two.price);


        System.out.println("============");


        two.color="蓝色";

        two.name="雷军";

        two.price=5999.0;

        System.out.println(two.color);

        System.out.println(two.name);

        System.out.println(two.price);

        System.out.println("============");


        two.call("乔布斯");

        two.sendMessage();

    }
}
