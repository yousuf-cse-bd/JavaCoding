public class JavaStaticNonStaticMethod {

    public static void aStaticMethod() {
        System.err.println("Static Method");
    }

    public void aNonStaticMethod() {
        System.out.println("Non Static Method");
    }

    public static void main(String[] args) {

        aStaticMethod();
        JavaStaticNonStaticMethod object = new JavaStaticNonStaticMethod();
        object.aNonStaticMethod();
    }
}