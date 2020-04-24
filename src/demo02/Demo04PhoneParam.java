package demo02;

/*
     当一个对象作为参数，传递到方法当中时，实际上传递进去的是对象的地址值
 */

public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone one=new Phone();

        one.price=8999.0;

        one.name="苹果";

        one.color="黑色";

        method(one);
    }

    public static void method(Phone param){

        System.out.println(param.price);

        System.out.println(param.name);

        System.out.println(param.color);
    }
}
