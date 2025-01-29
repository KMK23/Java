package chapter5.Question09;

public class Person {
    int age;
    String name;
    boolean isMarried;
    String child;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public String getChild() {
        return child;
    }

    public void setChild(String child) {
        this.child = child;
    }

    public Person(int age, String name, boolean isMarried, String child){
        this.age = age;
        this.name = name;
        this.isMarried = isMarried;
        this.child = child;


    }


}
