package Quiz_12;

public class Member {

    Member(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }

    private String id;
    private String pw;

    public String getId() {
        return id;
    }
    public String getPw() {
        return pw;
    }

}
