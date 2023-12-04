package org.Item1;

public class Main {
    public static void main(String[] args) {
        String str1 = String.valueOf("정적 팩토리를 통한 생성");
        String str2 = new String("new를 통한 생성");

        System.out.println(str1);
        System.out.println(str2);
    }
}