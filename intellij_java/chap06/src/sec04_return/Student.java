package sec04_return;

public class Student {

    String name;
    int age;

    void setName(String name) {
        if(name != null){
            this.name = name;
        }
    }

    String getName() {
        return this.name;
    }
}
