import java.util.ArrayList;

public class MyEnum {
    private static ArrayList<MyEnum> values = new ArrayList<>();

    private String name;

    private MyEnum(String name) {
        this.name = name;
    }

    public static MyEnum[] values() {
        MyEnum[] res = new MyEnum[values.size()];
        int index = 0;
        for (MyEnum m :values) {
            res[index++] = m;
        }
        return res;
    }

    public static MyEnum valueOf(String name) {
        for (MyEnum m : values) {
            if (m.getName().equals(name)) {
                return m;
            }
        }
        throw new IllegalArgumentException();
    }

    public String getName() {
        return name;
    }

    public static void addConst(String name) {
        values.add(new MyEnum(name));
    }

    public int ordinal() {
        return values.indexOf(this);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
