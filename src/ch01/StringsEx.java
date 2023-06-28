package ch01;

public class StringsEx {
    public static void main(String[] args) {
        // 문자열 연습
        // 문자열 초기화 방법 2가지 "", new Strings("");
        // 문자열 결합
        // 제어문자(\n, \t, \", \\)

        String name = "양수열";
        String address = "마포구 염리동";
        String age = new String("(25세)");
        String career = "개발경력은 없습니다.";
        String pet = "강아지를 키웁니다";
        String color = "하얀색";

        String info = name + age + "\t주소는 " + address + " 입니다."
                + "\n" + "\"" + career + "\""
                + "\n" + "\"" + pet + "\""
                + "\n" + "\"" + color + "\""
                + "\n 이상 저의 정보입니다";
        System.out.println(info);
    }
}
