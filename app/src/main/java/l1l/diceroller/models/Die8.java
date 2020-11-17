package l1l.diceroller.models;

public class Die8 extends Die {

    public static final Integer faces = 8;
    private static volatile Die8 instance = null;

    @Override
    public Integer roll() {
        return ((int) Math.ceil(Math.random() * faces));
    }

    private Die8() {}

    public static Die8 getInstance() {
        if(instance == null) {
            synchronized (Die8.class) {
                if(instance == null) {
                    instance = new Die8();
                }
            }
        }
        return instance;
    }

    public static Integer getFaces() {
        return faces;
    }
}
