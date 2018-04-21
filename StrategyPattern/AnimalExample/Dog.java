package AnimalExample;

public class Dog extends Animal {

    public Dog(){
        super();
        setSound("Woof");
        flyingType = new CannotFly();
    }

    public void digHole(){
        System.out.println("Dug a hole");
    }


}
