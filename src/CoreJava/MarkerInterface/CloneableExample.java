package CoreJava.MarkerInterface;

// Cloneable Example:
public class CloneableExample {
    public static void main(String[] args) {
        MyClass1 obj1 = new MyClass1(1, "John");
        try {
            MyClass1 obj2 = (MyClass1) obj1.clone();
            System.out.println("Cloned object: " + obj2.getName()); // Cloned object: John
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

class MyClass1 implements Cloneable {
    private int id;
    private String name;

    public MyClass1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
