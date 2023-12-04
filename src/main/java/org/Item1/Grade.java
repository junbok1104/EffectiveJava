package org.Item1;

public interface Grade {
    String toText();

    public static Grade of(int score) { // 반환타입 == Grade
        if(score >= 90) { // Grade를 구현하는 A,B,C를 선택적으로 다양한 객체로 반환할 수 있다.
            return new A();
        }else if(score >= 80) {
            return new B();
        }else {
            return new C();
        }
    }
}
