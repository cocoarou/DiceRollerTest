package l1l.test.models;

public class Die20 extends Die {

    public static final Integer faces = 20;
    private static volatile Die20 instance = null;

    @Override
    public Integer roll() {
        return ((int) Math.ceil(Math.random() * faces));
    }

    private Die20() {}

    public static Die20 getInstance() {
        if(instance == null) {
            synchronized (Die20.class) {
                if(instance == null) {
                    instance = new Die20();
                }
            }
        }
        return instance;
    }

    public static Integer getFaces() {
        return faces;
    }
}
