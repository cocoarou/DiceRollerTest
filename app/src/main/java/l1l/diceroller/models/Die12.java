package l1l.diceroller.models;

public class Die12 extends Die {

    public static final Integer faces = 12;
    private static volatile Die12 instance = null;

    @Override
    public Integer roll() {
        return ((int) Math.ceil(Math.random() * faces));
    }

    private Die12() {}

    public static Die12 getInstance() {
        if(instance == null) {
            synchronized (Die12.class) {
                if(instance == null) {
                    instance = new Die12();
                }
            }
        }
        return instance;
    }

    public static Integer getFaces() {
        return faces;
    }
}
