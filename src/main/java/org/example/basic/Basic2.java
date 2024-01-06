package org.example.basic;

public class Basic2 {
    public static void main(String[] args) {
        // Person 생성자에 String 형태로 값을 생성 가능.
        Person p1 = new Person("String", 1);
        System.out.println(p1.info);
        System.out.println(p1.id);

        System.out.println();

        // Person 생성자에 int 형태로도 값을 생성 가능.
        Person p2 = new Person(1, "String");
        System.out.println(p2.info);
        System.out.println(p2.id);

        p2.printInfo(0.0);
    }

    // 클래스 변수 타입을 각 다른 것으로 지정하고 싶다면,
    // , 로 구분하여 다른 제네릭 와일드카드를 추가하면 된다.
    private static class Person<T, S> {
        T info;
        S id;

        Person(T info, S id) {
            this.info = info;
            this.id = id;
        }

        // 클래스 뿐만 아니라 메소드에서도 제네릭을 사용할 수 있다.
        // info 매개변수의 타입을 따로 지정하지 않는다.
        // 반드시 접근제어자와 리턴 타입 사이에 동일한 제네릭을 붙여야 한다. (문법임)
        public <U> void printInfo(U info) {
            System.out.println(info);
        }
    }
}
