package com.kodilla.stream.forumuser;



import java.util.*;

public final class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public Forum(){
        forumUsers.add(new ForumUser(1,"Maciek",'M',1991, 12,13, 23));
        forumUsers.add(new ForumUser(2,"Malwina",'F',2002, 9,03, 253));
        forumUsers.add(new ForumUser(3,"Seweryn",'M',1997, 4,14, 22));
        forumUsers.add(new ForumUser(4,"Mariusz",'M',1983, 7,26, 236));
        forumUsers.add(new ForumUser(5,"Piotr",'M',1980, 3,22, 13));
        forumUsers.add(new ForumUser(6,"Sylwia",'F',1993, 11,03, 333));
    }

    public List<ForumUser> getUserList() {
        return forumUsers;
    }

}
