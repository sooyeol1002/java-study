package ch04;

public class EnhancedEx1 {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        int sum = 0;
//
//        for(int number : numbers){
//            sum += number;
//        }
//
//        System.out.println("배열의 합:" + sum);
        int[] numbers = {7, 14, 3, 8, 21, 5};
        int max = numbers[0];
        for(int number : numbers){
            if(number > max){
                max = number;
            }
        }
        System.out.println("최댓값: " + max);
    }
}
