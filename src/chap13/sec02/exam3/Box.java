package chap13.sec02.exam3;

public class Box<T> {
    public T content;

    public boolean compare(Box<?> other){
        boolean result = content.equals(other.content);
        return result;
    }
}
