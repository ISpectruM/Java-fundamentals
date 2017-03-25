package C_IteratorsAndComparators_Exercises.B_Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<String> {
    private int index;
    private List<String> strings;

    public ListyIterator(String...strings) {
        this.index=0;
        this.setStrings(strings);
    }

    private List<String> getStrings() {
        return this.strings;
    }

    private void setStrings(String...strings) {

        this.strings = Arrays.asList(strings);
    }

    public boolean hasNext() {
        return index < getStrings().size()-1;
    }

    public String next() {
        return getStrings().get(index++);
    }


    public boolean move() {
        if(this.hasNext()){
            this.index++;
            return true;
        }
        return false;
    }

    public void printAll(){
        System.out.print(String.join(" ", strings));
    }

    @Override
    public String toString() {
        if (this.getStrings().size() != 0){
            return this.getStrings().get(index);
        }
        return "Invalid Operation!";
    }

    @Override
    public Iterator<String> iterator() {
        return this.getStrings().iterator();
    }
}
