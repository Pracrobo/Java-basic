package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstructor member1 = new MemberConstructor("user1", 16, 90);
        MemberConstructor member2 = new MemberConstructor("user2", 15); // 기본으로 오버로딩해서 50


        MemberConstructor[] members = {member1, member2};
        for(MemberConstructor s: members) {
            System.out.println("이름= " + s.name + " 나이="+s.age + " 성적=" + s.grade);
        }
    }
}
