package Quiz_12;

import java.util.Scanner;

public class Login {
    Member member;


    Login(Member member){
        this.member = member;
    }
    boolean login_device(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID");
        String id = sc.nextLine();
        System.out.println("Enter Password");
        String pw = sc.nextLine();

        if(id.equals(member.getId())&&pw.equals(member.getPw())){
            return true;
        } else return false;
    }
}
