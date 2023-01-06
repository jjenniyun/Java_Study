package chap_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크(list, set, map)
        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("이재욱");
        list.add("황민현");
        list.add("유승호");
        list.add("여진구");
        list.add("이도현");

        // 데이터 조회 (인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("----------------------------");

        // 삭제(여진구 이사)
        System.out.println("신청 학생 수 (이사 전) : "+list.size()); // 5
        list.remove("여진구");
        System.out.println("신청 학생 수 (이사 후) : "+list.size()); // 4
        System.out.println(list.get(3));

        System.out.println("----------------------------");

        System.out.println("남은 학생 수 (제외 전) : "+ list.size()); // 4
        list.remove(list.size() - 1);
        System.out.println("남은 학생 수 (제외 후) : "+list.size()); // 3

        System.out.println("----------------------------");

        // 순회
        for (String s:list) {
            System.out.println(s);
        }
        System.out.println("----------------------------");

        // 변경
        System.out.println("데이터 변경 전 : "+list.get(0));
        list.set(0,"김석우");
        System.out.println("데이터 변경 후 : "+list.get(0));

        System.out.println("----------------------------");
        
        // 확인
        System.out.println(list.indexOf("황민현"));
        // 선착순 5명내 포함되었는지?
        if (list.contains("황민현")){
            System.out.println("수강 신청 성공");
        }else {
            System.out.println("수강 신청 실패");
        }

        System.out.println("----------------------------");

        // 전체 삭제
        list.clear();
        if (list.isEmpty()){
            System.out.println("학생 수 : "+list.size());
            System.out.println("리스트가 비었습니다.");
        }

        System.out.println("------------------------------");

        // 새로 데이터 다시 추가
        list.add("이재욱");
        list.add("황민현");
        list.add("유승호");
        list.add("여진구");
        list.add("이도현");

        // 정렬
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }

    }
}
