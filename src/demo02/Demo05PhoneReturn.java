package demo02;

/*
    当使用对象类型作为方法的返回值时，返回的是对象的【地址值】
 */

public class Demo05PhoneReturn {

    public static void main(String[] args) {

        Phone two=getPhone();

        System.out.println(two.color);
        System.out.println(two.name);
        System.out.println(two.price);

    }

    public static Phone getPhone(){

        Phone one=new Phone();

        one.color="黑色";

        one.name="苹果";

        one.price=8554.6;

        return one;
    }
}
