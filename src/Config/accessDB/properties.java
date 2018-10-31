package Config.accessDB;

public class properties {
    private static properties ourInstance = new properties();

    public static properties getInstance() {
        return ourInstance;
    }

    private properties() {
    }
}
