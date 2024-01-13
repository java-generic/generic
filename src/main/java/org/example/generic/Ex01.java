package org.example.generic;

import java.util.ArrayList;
import java.util.List;

// 제네릭
// 제네릭은 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시에 미리 지정하는 방법입니다.
// 꺽쇠 <> 안에 사용할 타입을 지정하여 해당 타입만 받을 수 있게 하는 것으로,
// 컴파일 시에 미리 타입 검사(type check)를 수행하면 다음과 같은 장점을 가집니다.

// 장점1. 제네릭을 사용하면 잘못된 타입이 들어올 수 있는 것을 컴파일 단계에서 방지할 수 있다.
// 장점2. 클래스 외부에서 타입을 지정해주기 때문에 따로 타입을 체크하고 변환해줄 필요가 없다. 즉, 관리하기가 편하다.
// 장점3. 비슷한 기능을 지원하는 경우 코드의 재사용성이 높아진다.

// 제네릭 선언 위치
//public class 클래스명<제네릭> {...}
//public interface 인터페이스명<제네릭> {...}

/* 지정된 기본타입이나 참조타입 이외의 문구를 써서, 모든 타입을 받을 수도 있는데, 주로 쓰는 문구는 다음과 같다.
<T>	Type
<E>	Element
<K>	Key
<V>	Value
<N>	Number
 */

class Tool<String> {
    private List<String> tools = new ArrayList<>(); // Strign형식으로 만 받기
    Tool() {};
    public void add(String tool){
        tools.add(tool);
    }
    public void getAll(){
        System.out.println(tools.toString());
    }

}
class Box<T> {
    // 제네릭으로 쓰는 문구는 T D O 같이 참조형이 아닌 문구를 쓰게되면, 제한되지 않은 여러 형식을 받을 수 있다.
    List<T> boxL = new ArrayList<>(); // T라는 제제릭으로 기본형 타입, 참조형 타입 모두 받기 가능

    public void add(T fruit) {
        boxL.add(fruit);
    }
    public void getAll(){
        System.out.println(boxL.toString());
    }
}
public class Ex01 {
    public static void main(String[] args) {
        Tool t = new Tool(); // 내부 List에서 String만 받음
        t.add("툴1");
        t.add("도구2");
        t.add("드라이버3");
        t.getAll();

        // 클래스를 T나 V 같은걸로 잡더라도, 실제구현에선 어떤타입쓸지 지정해주는데, 이걸 외부에서 지정한다고 함.
        Box<String> box1 = new Box();// Box 형식으로 외부에서 String만 받도록 제네릭 설정
        Box<Integer> box2 = new Box();// Box 형식으로 외부에서 int만 받도록 제네릭 설정
        Box<Tool> box3 = new Box();// Box 형식으로 외부에서 Tool 형식만 받도록 제네릭 설정
        box1.add("귤");
//        box1.add(22); // int라서 에러
//        box2.add("딸기"); // String 이라서 에러
        box2.add(12);
//        box3.add("포도"); // 에러, String이라서
//        box3.add(30); // 에러, int라서
        box3.add(t);
        box3.add(new Tool()); // 객체를 바로 넣어버려도 가능 box3참조된 객체안의 ArrayList에 저장된다.
        box1.getAll();
        box2.getAll();
        box3.getAll();

    }
}
