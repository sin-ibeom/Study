package Quiz_01;

public class Member {

    int Member_ID;
    String Member_Name;
    // VIP, GOLD, NORMAL
    String Member_Grade;
    int point;

    Member(int member_ID, String member_Name, String member_Grade) {
        Member_ID = member_ID;
        Member_Name = member_Name;
        Member_Grade = member_Grade;
        this.point = 0;
    }

}
