package com.citi.java8qa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapFlatMap {
    public static void main(String[] args) {
        List<User> userList = Stream.of(
                new User("shorav", Arrays.asList("abc123@gmail.com", "def456@gmail.com")),
                new User("sharma", Arrays.asList("abc1@gmail.com", "def4@gmail.com")),
                new User("shaily", Arrays.asList("abc12@gmail.com", "def45@gmail.com")),
                new User("sk", Arrays.asList("abc123@gmail.com", "def456@gmail.com"))
        ).collect(Collectors.toList());

        List<String> nameList = userList.stream().map(User::getName).collect(Collectors.toList());
        System.out.println(nameList);

        List<List<String>> mailIDs = userList.stream().map(User::getMailId).collect(Collectors.toList());
        System.out.println(mailIDs);

        List<String> mailIdList = userList.stream().flatMap(user -> user.getMailId().stream()).collect(Collectors.toList());
        System.out.println(mailIdList);

    }
}
