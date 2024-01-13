package org.example.generic;

import java.util.Optional;

public class Optionals2 {
    public static void main(String[] args) {
        String str = "abcd efgh"; // null이 아닌 값을 가지는 문자열 변수
        int i = 234;
//        Optional<Integer> optional = Optional.of(str); // Optional 객체 생성, 값이 null이 아니므로 of() 메서드 사용
        Optional<Integer> optional = Optional.of(234); // Optional 객체 생성, 값이 null이 아니므로 of() 메서드 사용
        System.out.println(optional); // 출력: Optional[abcd efgh]
        System.out.println(optional.toString()); // 출력: Optional[abcd efgh]
        System.out.println(optional.get()); // 출력: abcd efgh
        System.out.println("-----------------------------");


    }
}
