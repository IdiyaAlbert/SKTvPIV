import java.util.*;


public class Lab42 {
    public static void main(String[] args) {
        Col<String> stringCol = new Col<String>();
        stringCol.add("Albert");
        stringCol.add("Kirill");
        stringCol.add("Valentin");
        stringCol.add("Nikita");

        System.out.println(stringCol.size());


        stringCol.remove(3);
        stringCol.remove("Albert");
        System.out.println(stringCol.get(1));
        stringCol.clear();

        stringCol.size();
    }
}
class Col<E> {
    LinkedList<E> linkedList = new LinkedList<>();

    int size(){
        return (linkedList.size());
    }
    void add(E item){
        linkedList.add(item);
    }

    void remove(int index){
        linkedList.remove(index);
    }
    void remove(E item){
        linkedList.remove(item);
    }
    E get(int index){
        return(linkedList.get(index));
    }
    void clear(){
        linkedList.clear();
    }

}