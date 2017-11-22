public class Main {
    public static void main(String[] args) {
        MyEnum.addConst("A");
        MyEnum.addConst("B");
        MyEnum.addConst("C");
        MyEnum myEnum = MyEnum.valueOf("B");
        MyEnum[] consts = MyEnum.values();
        System.out.println(myEnum);
        for (MyEnum m : consts) {
            System.out.println(m + " " + m.ordinal());
        }
    }
}
