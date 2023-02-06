package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열 순회
        String[] coffees = {"아메리카노","카페모카","라떼","카푸치노"};
        
        // for 반복문 순회
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i]+" 하나");
        }
        System.out.println("주세요");

        System.out.println("----------------------------------");

        // 배열의 길이를 이용한 순회
        // length : 배열의 크기를 알려줌
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i]+" 하나");
        }
        System.out.println("주세요");
        System.out.println("-------------------------");

        // enhanced for (for-each) 반복문
        // 배열이나 리스트에 많이 활용
        for (String coffee : coffees){ // 배열과 같은 자료형 사용
            System.out.println(coffee+" 하나");
        }
        System.out.println("주세요");
        //커밋한게 어디간거니...?
    }
}
