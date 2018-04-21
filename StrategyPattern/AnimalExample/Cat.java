package AnimalExample;

public class Cat extends Animal {

    public Cat(){
        super();
        setSound("Meow");
        flyingType = new CannotFly();
    }

    public void followThread(){
        System.out.println("Following thread.....");
    }
}
