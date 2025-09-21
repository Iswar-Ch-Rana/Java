package CoreJava.ImmutableClass;

import java.util.Date;

public final class ImmutablePerson {
    private final String name;
    private final int age;
    private final Date birthDate;

    public ImmutablePerson(String name, int age, Date birthDate) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
    }

    static void main() {
        Date d = new Date();
        ImmutablePerson emp = new ImmutablePerson("John", 101, d);

        d.setTime(999999999); // Trying to change joiningDate outside
        System.out.println(emp.getBirthDate()); // Still safe
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthDate() {
        // Returning a defensive copy of the mutable Date object
        return new Date(birthDate.getTime());
    }
}
