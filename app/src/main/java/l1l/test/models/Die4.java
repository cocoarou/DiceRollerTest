package l1l.test.models;

public class Die4 extends Die {

    public static final Integer faces = 4;
    private static volatile Die4 instance = null;

    @Override
    public Integer roll() {
        return ((int) Math.ceil(Math.random() * faces));
    }

    private Die4() {}

    public static Die4 getInstance() {
        if(instance == null) {
            synchronized (Die4.class) {
                if(instance == null) {
                    instance = new Die4();
                }
            }
        }
        return instance;
    }

    public static Integer getFaces() {
        return faces;
    }
}
