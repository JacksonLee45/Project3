import java.util.Random;

public enum RollEnum {
    SPRING("Springroll"),
    EGG("Eggroll"),
    PASTRY("Pastryroll"),
    SAUSAGE("Sausageroll"),
    JELLY("Jellyroll");

    public final String label;

    private RollEnum(String label) {
        this.label = label;
    }
    private static final Random random = new Random();
    public static <T extends Enum<?>> T randomEnum(Class<T> clazz){
        int x = random.nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[x];
    }
}
