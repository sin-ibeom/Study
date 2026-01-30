package Quiz_12;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== 회원가입 ===\n");

        System.out.print("ID >>>");
        String id = new Scanner(System.in).nextLine();

        System.out.print("PW >>>");
        String pw = new Scanner(System.in).nextLine();

        Member member = new Member(id, pw);
        Login login = new Login(member);

        while(true){
            System.out.println("=== 로그인 ===\n");
            if(login.login_device()){
                System.out.println("로그인 성공");
                break;
            } else {
                System.out.println("다시 로그인 하세요.");
            }
        }
        System.out.println(member.getId() + "님 환영합니다.");
    }
}
