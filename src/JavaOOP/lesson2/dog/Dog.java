package JavaOOP.lesson2.dog;

public class Dog {

    private final String dogName;

    public Dog(String dogName) {
        this.dogName = dogName;
    }

    public void dogInfo(){
        System.out.println("Hi " + dogName);
    }

    public void bark(int bark){
        for (int i = 0; i < bark; i++) {
            System.out.print("bark ");
        }
    }
}
