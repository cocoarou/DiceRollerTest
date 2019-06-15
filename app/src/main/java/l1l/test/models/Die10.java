package l1l.test.models;

public class Die10 extends Die {

    public static final Integer faces = 10;
    private static volatile Die10 instance = null;

    @Override
    public Integer roll() {
        return ((int) Math.ceil(Math.random() * faces));
    }

    private Die10() {}

    public static Die10 getInstance() {
        if(instance == null) {
            synchronized (Die10.class) {
                if(instance == null) {
                    instance = new Die10();
                }
            }
        }
        return instance;
    }

    public static Integer getFaces() {
        return faces;
    }
}
