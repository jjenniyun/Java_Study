package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 ElseIf

        // 한라봉 에이드가 있으면 +1
        // 또는 망고주스가 있으면 +1
        // 또는 아이스 아메리카노 +1
        boolean halla = true; // 한라봉 에이드
        boolean mango = true; // 망고주스

        if (halla){
            System.out.println("한라봉 에이드 +1");
        } else if (mango) {
            System.out.println("망고 주스 +1");
        }else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #1");

        // else if는 여러번 사용 가능
        halla = false;
        mango = false;
        boolean orange = true;

        if (halla){
            System.out.println("한라봉 에이드 +1");
        } else if (mango) {
            System.out.println("망고 주스 +1");
        } else if (orange) {
            System.out.println("오렌지 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");
        //else는 굳이 안써도 됨
    }
}
