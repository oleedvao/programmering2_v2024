package no.hiof.oleedvao.lecture21.models;

public class HoneyBadger extends Animal{

    private int numSnakesEaten = 0;

    public HoneyBadger(String name) {
        super(name);
        species = "Honey Badger";
    }

    public int getNumSnakesEaten() {
        return numSnakesEaten;
    }

    public void eatASnake() {
        numSnakesEaten++;
    }
}
