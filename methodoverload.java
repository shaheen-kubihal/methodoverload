public class methodoverload {
    int a;
    int b;

    void overload() {
        a = 10;
        b = 20;
        int add = a + b;
        System.out.println("Addition : " + add);
    }

    void overload(int a, int b) {
        int sub = a - b;
        System.out.println("Substraction : " + sub);
    }

    public static void main(String[] args) {
        methodoverload obj = new methodoverload();
        obj.overload();
        obj.overload(40, 20);
        System.out.println("Method overloading java program");
    }

}
