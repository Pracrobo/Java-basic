package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
        //이름 겹치면 하나는 이렇게 해야 한다
    }
}
