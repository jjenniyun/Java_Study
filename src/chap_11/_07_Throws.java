package chap_11;

import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws {
    public static void main(String[] args) {
        try {
            writerFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("메인 메소드에서 해결할게요");
        }
    }

    public static void writerFile() throws IOException {
//        try {
//            FileWriter writer = new FileWriter("text.txt");
//            throw  new IOException("파일 쓰기에 실패했습니다!!");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("writerFile 메소드 내에서 자체 해결했어요.");
//        }

        FileWriter writer = new FileWriter("text.txt");
        throw  new IOException("파일 쓰기에 실패했습니다!!");
    }
}
