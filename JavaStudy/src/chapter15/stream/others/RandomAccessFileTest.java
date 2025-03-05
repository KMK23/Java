package chapter15.stream.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile
                ("random.txt", "rw");

        rf.writeInt(100); // 4
        System.out.println(rf.getFilePointer());
        rf.writeDouble(3.14); //8
        System.out.println(rf.getFilePointer());
        rf.writeUTF("안녕하세요"); //한글 하나당 3바이트 그래서 * 5 그다음 null 이 2바이트 그래서 총 17
        System.out.println(rf.getFilePointer());


        rf.seek(0);
        int i = rf.readInt();
        double d = rf.readDouble();
        String str = rf.readUTF();

        System.out.println(i);
        System.out.println(d);
        System.out.println(str);
    }
}
