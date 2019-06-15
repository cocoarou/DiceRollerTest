package l1l.test.models;

public class Die100 extends Die {

    public static final Integer faces = 100;
    private static volatile Die100 instance = null;

    @Override
    public Integer roll() {
        return ((int) Math.ceil(Math.random() * faces));
    }

    private Die100() {}

    public static Die100 getInstance() {
        if(instance == null) {
            synchronized (Die100.class) {
                if(instance == null) {
                    instance = new Die100();
                }
            }
        }
        return instance;
    }

    public static Integer getFaces() {
        return faces;
    }
}
