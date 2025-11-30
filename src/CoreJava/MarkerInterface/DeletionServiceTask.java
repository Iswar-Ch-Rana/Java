package CoreJava.MarkerInterface;

// Marker Interface
interface Deletable {
}

// Class that can be deleted
class FileRecord implements Deletable {
    String file;

    FileRecord(String file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "FileRecord(" + file + ")";
    }
}

// Class that is NOT deletable
class User {
    String name;

    User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User(" + name + ")";
    }
}

// Deletion service
class DeletionService {
    public static void delete(Object obj) {
        if (obj instanceof Deletable) {
            System.out.println("Deleted: " + obj);
        } else {
            System.out.println("Rejected: " + obj + " cannot be deleted");
        }
    }
}

public class DeletionServiceTask {
    public static void main(String[] args) {
        FileRecord fileRecord = new FileRecord("hello.txt");
        User user = new User("iswar");

        DeletionService.delete(fileRecord);
        DeletionService.delete(user);
    }
}