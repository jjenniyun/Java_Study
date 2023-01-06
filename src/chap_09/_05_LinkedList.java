package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트
        LinkedList<String> list = new LinkedList<>();

        // 데이터 추가
        list.add("이재욱");
        list.add("황민현");
        list.add("유승호");
        list.add("여진구");
        list.add("이도현");

        // 데이터 조회( 인덱스)
        System.out.println(list.get(0));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("-----------------------------");

        // 추가
        list.addFirst("김석우"); // 데이터 맨처음으로 넣음
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("----------------------------");

        list.addLast("안효섭");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------------------------");

        System.out.println("학생 추가 전 : "+list.get(1));
        list.add(1,"차은우");
        System.out.println("학생 추가 후 : "+list.get(1));
        System.out.println("학생 추가 후 : "+list.get(2));

        System.out.println("-----------------------------");

        // 삭제
        System.out.println("남은 학생 수 (제외 전) : "+list.size());
        list.remove(list.size()-1);
        System.out.println("남은 학생 수 (제외 후) : "+list.size());

        System.out.println("-----------------------------");

        // 처음 학생과 마지막 학생이 전학
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("남은 학생 수 (전학 전) : "+list.size());
        list.removeFirst(); // 처음 데이터
        list.removeLast(); // 마지막 데이터
        System.out.println("남은 학생 수 (전학 후) : "+list.size());
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------------------------");

        // 변경
        list.set(0,"이도현");
        System.out.println(list.get(0));
        System.out.println("-----------------------------");

        // 확인
        System.out.println(list.indexOf("황민현"));
        if (list.contains("황민현")){
            System.out.println("수강 신청 성공");
        }else {
            System.out.println("수강 신청 실패");
        }
        System.out.println("-----------------------------");

        // 전체 삭제
        list.clear();
        if (list.isEmpty()){
            System.out.println("학생 수 : "+list.size());
            System.out.println("리스트가 비었습니다.");
        }
        System.out.println("-----------------------------");

        // 새로운 데이터 추가
        list.add("이재욱");
        list.add("황민현");
        list.add("유승호");
        list.add("여진구");
        list.add("이도현");

        Collections.sort(list); // 정렬
        for (String s : list) {
            System.out.println(s);
        }

    }
}
