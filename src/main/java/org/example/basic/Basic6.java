package org.example.basic;

/**
 * 제네릭 인터페이스
 */
public class Basic6 {
    public static void main(String[] args) {
        IAdd<Integer> o1 = (x, y) -> x + y;

        int result = o1.add(10, 10);
        System.out.println(result);
    }

    private interface IAdd<T> {
        public T add(T x, T y);
    }

}
