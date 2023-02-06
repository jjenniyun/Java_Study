package chap_05;
// 배열 활용하여 쇼핑몰에서 구매가능한 신발사이즈 옵션 출력하는 프로그램

// 신발 사이즈는 250부터 295까지 5단위로 증가
// 신발 사이즈 수는 총 10가지

// 사이즈 250(재고 있음)
// 사이즈 255(재고 있음)
// ...
public class _Quiz_05 {
    public static void main(String[] args) {
        int[] size = new int[10];
        for (int i = 0; i < size.length; i++) {
            size[i] = 250 + (5 * i); // 250 기본으로 두고
        }
        for (int sizeArray : size) {
            System.out.println("사이즈 "+ sizeArray+" (재고 있음)");
        }
        //커밋한게 어디간거니...?
    }
}
