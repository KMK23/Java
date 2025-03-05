package chapter15.stream.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamDeaderTest {
    public static void main(String[] args) {

        try (InputStreamReader irs =new InputStreamReader( new FileInputStream("reader.txt"))){
            int i = 0;
            while ((i = irs.read()) != -1){
                System.out.print((char) i);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
