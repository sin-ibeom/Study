package Quiz_05;

import java.util.ArrayList;

public class User {

    int id;
    ArrayList<Object> objects = new ArrayList();

    User(int id) {
        this.id = id;
    }

    void buy(Object object){
        objects.add(object);
    }

}
