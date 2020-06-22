package ruoob;
class Dog{
    int age;
    String name;
    String color;
    public Dog(String name){
        this.name=name;
    }

    public void getName() {
    System.out.println("myname is:"+name);
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        System.out.println("myage is:"+age);
        return age;
    }
    public void setColor(String color){
        this.color=color;
    }

    public void getColor() {
        System.out.println("mycolor is:"+color);
    }
}

public class lec1 {
    public static void main(String []args){
 Dog mydog=new Dog("qq");
 mydog.setAge(3);
 mydog.setColor("white");
 mydog.getAge();
mydog.getName();
mydog.getColor();;

    }
}
