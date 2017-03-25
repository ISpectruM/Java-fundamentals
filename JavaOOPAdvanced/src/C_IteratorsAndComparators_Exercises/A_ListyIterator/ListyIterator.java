package C_IteratorsAndComparators_Exercises.A_ListyIterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterator<String> {
    private int index;
    private List<String> strings;

    public ListyIterator(String...strings) {
        this.index=0;
        this.setStrings(strings);
    }

    public List<String> getStrings() {
        return this.strings;
    }

    private void setStrings(String...strings) {

        this.strings = Arrays.asList(strings);
    }

    @Override
    public boolean hasNext() {
        return this.index < this.getStrings().size()-1;
    }

    @Override
    public String next() {
        return this.getStrings().get(index++);
    }

    public boolean move() {
        if(this.hasNext()){
            this.index++;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if (this.getStrings().size() != 0){
            return this.getStrings().get(index);
        }
        return "Invalid Operation!";
    }
}
