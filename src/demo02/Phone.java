package demo02;

public class Phone {

    String name;

    double price;

    String color;


    public void call(String who){

        System.out.println("打给"+who);
    }


    public void sendMessage(){

        System.out.println("群发短信");
    }
}
