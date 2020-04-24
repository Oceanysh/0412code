package cn.itcast.day12.demo01;

/*
   通常一个类不能直接使用，需要根据类创建一个类，才能使用。

   1.导包，也就是指出要引用的类在什么位置

   import 包名.类名;

   对于和当前类同属于一个包的情况，可以省略导包语句不写

   2.创建对象 格式

   类名称 对象名=new 类名称（）；

   3.使用 分为两种情况


   对象名.成员变量名；

   对象名.成员方法名（参数）


   注意：如果成员变量没有赋值，那么将会有一个默认值，规则和数组一样
 */

public class Demo02Student {

    public static void main(String[] args) {

        Student stu = new Student();

        System.out.println(stu.age);

        System.out.println(stu.name);


        stu.eat();

        stu.sleep();
    }
}
