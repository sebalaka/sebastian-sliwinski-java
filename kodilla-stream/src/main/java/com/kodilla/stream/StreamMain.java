
package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {

        Forum theForumUser = new Forum();
        theForumUser.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> Period.between(forumUser.getBirthdate(), LocalDate.now()).getYears() >= 20)
                .filter(forumUser -> forumUser.getPostPublicated() >= 1)
                .forEach(System.out::println);


        Map<Integer, ForumUser> par = theForumUser.getUserList().stream()
                .collect(Collectors.toMap(ForumUser::getUserID, fu -> fu));

        System.out.println("# elements: " + par.size());
        par.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}