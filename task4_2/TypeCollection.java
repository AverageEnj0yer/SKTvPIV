package task4_2;

import java.util.ArrayList;
import java.util.Arrays;

public class TypeCollection <T>{
    private ArrayList<T> items;

    public TypeCollection (T... items) {
        this.items = new ArrayList<T>(Arrays.asList(items));
    }
    public int size(){
        return items.size();
    }

    public void add(T item) {
        this.items.add(item);
    }

    public void remove(int index) {
        this.items.remove(index);
    }

    public void remove(T item) {
        this.items.remove(item);
    }

    public T get (int index){
        return this.items.get(index);
    }

    public void clear() {
        items.clear();
    }
}
