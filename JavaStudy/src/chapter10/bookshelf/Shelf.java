package chapter10.bookshelf;

import java.util.ArrayList;

public class Shelf {

    protected ArrayList<String> shelf;

    public Shelf(){
        shelf = new ArrayList<String>();
    }

    public ArrayList<String> getShelf(){
        return shelf;
    }

    public int getCount(){
        return shelf.size();
//      여기 size 는 ArrayList 주요 메서드중 하나임
//      add, remove, get, size 이것들
        
    }
}
