package AnimalExample;

public interface Flys {
    String fly();
}

class ItFlys implements Flys{

    @Override
    public String fly() {
        return "Flying high";
    }
}

class CannotFly implements Flys{

    @Override
    public String fly() {
        return "I cannot fly";
    }
}
