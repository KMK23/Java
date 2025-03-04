package chapter13.lambda;

public class TestStringConcat {
    public static void main(String[] args) {
        StringConcatImpl sImpl = new StringConcatImpl();
        sImpl.makeString("hello", "java");

        StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2);
        concat.makeString("hi", "자바");

        StringConcat concat2 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + " " + s2);
            }
        };

        concat2.makeString("hello", "java");
    }
}
