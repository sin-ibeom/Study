package sec02;


public class China {
    String name;
    String address;
    String menus[] = new String[2];

    China(String name, String address, String menu, String menu2) {
        this.name = name;
        this.address = address;
        this.menus[0] = menu;
        this.menus[1] = menu2;
    }
}
