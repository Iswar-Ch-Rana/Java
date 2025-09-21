package CoreJava.EqualsMethod;

class MyClass1 {
    int value;

    MyClass1(int value) {
        this.value = value;
    }

    static void main() {
        MyClass1 obj1 = new MyClass1(10);
        MyClass1 obj2 = new MyClass1(10);
        System.out.println(obj1.equals(obj2)); // Output: true (values are the same)
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyClass1 myClass = (MyClass1) obj;
        return value == myClass.value;
    }
}
