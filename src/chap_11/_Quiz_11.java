package chap_11;
// 인기가 많은 상품이 선착순으로 판매된느 온라인 쇼핑몰에서 발생할 수 있는 문제를 처리하는 프로그램
// 조건 발생가능 문제의 2가지 조건 : 상품구매가능시간, 상품매진
// 각문제에 대한 사용자 정의 예외 클래스 작성
// 에러 코드에 따른 의도적 예외 발생 및 예외 처리
// 모든 클래스는 하나의 파일에 정의

// 힌트 예외 메시지 출력시 e.getMessage() 이용
public class _Quiz_11 {
    public static void main(String[] args) {
        int errorCode = 2;
        try {
            if (errorCode == 0){
                System.out.println("상품 구매를 완료하였습니다.");
            } else if (errorCode == 1) {
                throw new NotOnSaleException("상품 구매 가능 시간이 아닙니다.");
            } else if (errorCode == 2) {
                throw new SoldOutException("해당 상품은 매진되었습니다.");
            }
        } catch (NotOnSaleException e){
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시부터 가능합니다.");
        } catch (SoldOutException e){
            System.out.println(e.getMessage());
            System.out.println("다음 기회에 이용해주세요.");
        }
    }
}
// 사용자 정의 예외 클래스
class NotOnSaleException extends Exception{
    public NotOnSaleException(String message) {
        super(message);
    }
}

class SoldOutException extends Exception{
    public SoldOutException(String message) {
        super(message);
    }
}
