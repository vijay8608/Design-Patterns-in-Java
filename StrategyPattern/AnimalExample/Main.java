package AnimalExample;

public class Main {

    public static void main(String[] args) {

        Animal roxy = new Dog();
        Animal tweety = new Bird();
        Animal misty = new Cat();

        System.out.println("AnimalExample.Dog : " + roxy.tryToFly());
        System.out.println("AnimalExample.Bird : " + tweety.tryToFly());
        System.out.println("AnimalExample.Cat : " + misty.tryToFly());

        roxy.setFlyingAbility(new ItFlys());
        System.out.println("AnimalExample.Dog : " + roxy.tryToFly());

    }
}
