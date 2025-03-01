package chapter12.collection.arrayList;

import java.util.ArrayList;

class MyStack{
    private ArrayList<String> arrayStack = new ArrayList<>();

    public void push(String data){
        arrayStack.add(data);
    }

    public String pop(){

        int length = arrayStack.size();
        if(length == 0){
            System.out.println("스택이 비었습니다.");
            return null;
        }
        return arrayStack.remove(length - 1);
    }

    //    맨위에 있는거 하나 꺼내보는것
    public String peek(){
        int length = arrayStack.size();
        if(length == 0){
            System.out.println("스택이 비었습니다.");
            return null;
        }
        return arrayStack.get(length - 1);
    }
}


public class StackTest {
    public static void main(String[] args) {

        MyStack stack = new MyStack();

        stack.push("a");
        stack.push("b");
        stack.push("c");

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.pop());

    }
}
