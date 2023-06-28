package ch02;

public class Ex1 {
    public static void main(String[] args) {
        int price = 187000;
        int oman = (price / 50000);
        int ilmanC = (price - oman * 50000);
        int ilman = ilmanC / 10000;
        int ochunC = (ilmanC - ilman * 10000);
        int ochun = ochunC / 5000;
        int ilchunC = (ochunC - ochun * 5000);
        int ilchun = ilchunC / 1000;

        System.out.println("5만원권 : "+oman+"장");
        System.out.println("1만원권 : "+ilman+"장");
        System.out.println("5천원권 : "+ochun+"장");
        System.out.println("1천원권 : "+ilchun+"장");

/*
       int price = 187000;
       int oman = price / 50000;
       int ilman = price % 50000 / 10000;
       int ochun = price % 10000 / 5000;
       int ilchun = price % 5000 / 1000;

        System.out.println("5만원권 : "+oman+"장");
        System.out.println("1만원권 : "+ilman+"장");
        System.out.println("5천원권 : "+ochun+"장");
        System.out.println("1천원권 : "+ilchun+"장");
*/
    }
}
