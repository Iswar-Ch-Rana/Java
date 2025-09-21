package CoreJava.VaribalesAndDataTypes;


public class InstanceStaticLocal {
    static int staticVar = 100;  // Static variable
    int instanceVar;  // Instance variable

    public static void showStatics() {
        System.out.println(staticVar);
    }

    public static void main(String[] args) {
        InstanceStaticLocal obj = new InstanceStaticLocal();
        obj.display();
        obj.show();
        showStatics();
    }

    public void display() {
        int localVar = 10; // Local variable
        System.out.println(localVar);
    }

    public void show() {
        System.out.println(instanceVar); // Default value: 0
    }
}
