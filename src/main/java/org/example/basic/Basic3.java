package org.example.basic;

/**
 * 제네릭 제한
 */
public class Basic3 {
    public static void main(String[] args) {

        // 첫번째 인자는 Person<T extends Info> 이다.
        // extends 키워드가 붙은 경우에는 Info 이거나 Info 를 상속/구현한 클래스만 사용할 수 있다.

        // 참고.) super 키워드도 있다. <T super Info>
        // super 키워드는 Info 클래스 이거나 Info 를 상속/구현한 클래스는 사용할 수 없다고 지정하는것이다. (많이 사용하지는 않음.)
        Person p1 = new Person(new PersonInfo(2), 1);

        // 만약 <T extends Info> 에서 extends Info 를 붙이지 않으면 .getLevel() 메소드 사용 시 컴파일 오류가 난다.
        // 단순히 <T> 는 <T extends Object> 와 같기 때문에, PersonInfo 클래스의 getLevel() 을 알 수가 없다.
        System.out.println(p1.info.getLevel());
        System.out.println(p1.id);

    }

    private interface Info {
        int getLevel();
    }

    private static class PersonInfo implements Info {
        int level;

        PersonInfo(int level) {
            this.level = level;
        }

        @Override
        public int getLevel() {
            return this.level;
        }
    }

    private static class Person<T extends Info, S> {
        T info;
        S id;

        Person(T info, S id) {
            this.info = info;
            this.id = id;
        }

        public <U> void printInfo(U info) {
            System.out.println(info);
        }
    }
}
