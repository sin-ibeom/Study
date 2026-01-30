package Quiz_13;

public class Execution {
    public static void main(String[] args) {
        Process process = new Process();

        Item i1 = new Item("마우스");
        Item i2 = new Item("키보드");

        process.run(i1);
        process.run(i2);
    }
}
