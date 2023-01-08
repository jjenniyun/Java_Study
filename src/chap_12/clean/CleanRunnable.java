package chap_12.clean;

public class CleanRunnable implements Runnable{ // 인터페이스: 여러개를 한꺼번에 구현가능(다중상속 가능), 부모 클래스도 상속가능
    @Override
    public void run() {
        System.out.println("-- 직원 청소 시작 (Runnable)--");
        for (int i = 2; i <= 10; i+=2) {
            System.out.println("(직원) "+i+"번방 청소 중 (Runnable)");

            try {
                Thread.sleep(1000); // 1초
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("-- 직원 청소 끝 (Runnable)--");
    }
}
