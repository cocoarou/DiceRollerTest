package l1l.diceroller.models;

public class Die6 extends Die {

    public static final Integer faces = 6;
    private static volatile Die6 instance = null;

    @Override
    public Integer roll() {
        return ((int) Math.ceil(Math.random() * faces));
    }

    private Die6() {}

    public static Die6 getInstance() {
        if(instance == null) {
            synchronized (Die6.class) {
                if(instance == null) {
                    instance = new Die6();
                }
            }
        }
        return instance;
    }

    public static Integer getFaces() {
        return faces;
    }
}
