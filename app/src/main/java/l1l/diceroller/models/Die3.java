package l1l.diceroller.models;

public class Die3 extends Die {

    public static final Integer faces = 3;
    private static volatile Die3 instance = null;

    @Override
    public Integer roll() {
        return ((int) Math.ceil(Math.random() * faces));
    }

    private Die3() {}

    public static Die3 getInstance() {
        if(instance == null) {
            synchronized (Die3.class) {
                if(instance == null) {
                    instance = new Die3();
                }
            }
        }
        return instance;
    }

    public static Integer getFaces() {
        return faces;
    }
}
