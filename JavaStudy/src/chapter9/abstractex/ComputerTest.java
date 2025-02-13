package chapter9.abstractex;

public class ComputerTest {
    public static void main(String[] args) {
        // Computer c1 = new Computer();  // ❌ 오류 (추상 클래스는 객체 생성 불가)
        Computer c2 = new DeskTop();   // ✅ 가능 (구체적인 클래스)
        // Computer c3 = new NoteBook(); // ❌ 오류 (추상 클래스는 객체 생성 불가)
        Computer c4 = new MyNoteBook(); // ✅ 가능 (NoteBook을 상속한 구체적인 클래스)

        c2.display();
        c4.display();
    }
}
