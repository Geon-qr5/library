package libraryEx.vo;

public class Member {
    private int memberNo;
    private String name;
    private boolean isAdmin;

    public Member() {

    }

    public Member(int memberNo, String name, boolean isAdmin) {
        this.memberNo = memberNo;
        this.name = name;
        isAdmin = false;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemberNo() {
        return memberNo;
    }

    public String getName() {
        return name;
    }
}
