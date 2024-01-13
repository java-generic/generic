package org.example.basic;

public class Basic4 {
    public static void main(String[] args) {

        Sample<String> sample = new Sample<>();
        sample.addElement("test", 0);
        System.out.println(sample.getElement(0));
    }

    private interface ISample<T> {
        public void addElement(T t, int index);
        public T getElement(int index);
    }

    static class Sample<T> implements ISample<T> {
        private T[] array;

        public Sample() {
            array = (T[]) new Object[10];
        }

        @Override
        public void addElement(T o, int index) {
            array[index] = o;
        }

        @Override
        public T getElement(int index) {
            return array[index];
        }
    }
}
