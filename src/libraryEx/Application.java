package libraryEx;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import libraryEx.vo.Member;

public class Application {
    static Scanner scan = new Scanner(System.in);

    private Member[] memberList = new Member[10];

    public static void main(String[] args) {
        Application app = new Application();
        int inputNum = 0;

        while (true) {
            System.out.println("========= MAIN MENU =========");
            System.out.println("환영합니다. OO도서관입니다.");
            System.out.println("1. 로그인");
            System.out.println("2. 회원가입");
            System.out.println("3. 회원탈퇴");
            System.out.println("4. 종료");
            System.out.println("-----------------------------");
            System.out.print("번호를 입력하세요 : ");
            inputNum = scan.nextInt();
            scan.nextLine();

            if (inputNum == 1) {
                System.out.println("로그인");
            } else if (inputNum == 2) {
                System.out.println("회원가입");
                app.createMember();
                continue;
            } else if (inputNum == 3) {
                System.out.println("회원탈퇴");
                app.deleteMember();
            } else if (inputNum == 4) {
                System.out.println("이용해주셔서 감사합니다.");
                break;
            } else {
                System.out.println("잘못입력하셨습니다.");
            }

        }

    }

    public void createMember() {
        String name = null;

        for (int i = 0; i < memberList.length; i++) {
            if (memberList[i] == null) {
                System.out.print("이름을 입력하세요 : ");
                name = scan.nextLine();
                memberList[i] = new Member(i, name, true);
                System.out.printf("%s님 회원등록 되었습니다. 회원번호는 %d입니다.\n", name, i);
                break;
            } else {
                continue;
            }
        }

    }

    public void deleteMember() {
        int memberNum = 0;
        String name = null, check = null;

        while (true) {
            System.out.print("회원번호를 입력하세요 : ");
            memberNum = scan.nextInt();
            scan.nextLine();
            name = memberList[memberNum].getName();
            System.out.printf("%s님 회원 탈퇴에 동의하십니까? (Y/N) : ", name);
            check = scan.nextLine();
            if (check.equalsIgnoreCase("Y")) {
                System.out.println("회원 탈퇴를 진행합니다.");
                memberList[memberNum] = new Member(memberNum, null, false);
                System.out.println("그동안 이용해주셔서 감사합니다.");
                break;
            } else if (check.equalsIgnoreCase("N")) {
                System.out.println("회원 탈퇴를 취소합니다.");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            }

        }
    }

    public Member login(int memberNo) {
        return null;
    }

}
