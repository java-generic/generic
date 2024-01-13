package org.example.basic;

public class Basic1 {
    public static void main(String[] args) {
        // Person 생성자에 String 형태로 값을 생성 가능.
        Person p1 = new Person("String");
        System.out.println(p1.info);

        // Person 생성자에 int 형태로도 값을 생성 가능.
        Person p2 = new Person(1);
        System.out.println(p2.info);
    }

    // 꺽쇠 뒤에 T 는 변수의 타입을 컴파일 시점이 아닌 런타임 시점에 결정한다.
    // 컴파일 시점에 타입을 결정하지 않기 때문에 Person 클래스는 어떤 타입이든 가질 수 있다.
    private static class Person<T> {
        T info;

        Person(T info) {
            this.info = info;
        }
    }
}
