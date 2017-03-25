package C_IteratorsAndComparators_Exercises.C_StackIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StackImpl implements Stack<Integer> {
    private List<Integer> customStack;

    public StackImpl() {
        this.customStack = new ArrayList<>();
    }

    public List<Integer> getCustomStack() {
        return this.customStack;
    }


    @Override
    public void push(int...elements) {
        for (int element : elements) {
            this.customStack.add(element);
        }
    }

    @Override
    public void pop() {

        if (this.getCustomStack().size()>0){
            this.customStack.remove(this.getCustomStack().size()-1);
        } else {
            throw new IndexOutOfBoundsException("No elements");
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new StackIterator();
    }

    public final class StackIterator implements Iterator<Integer>{
        private int index;

        public StackIterator() {
            this.index = customStack.size()-1;
        }

        @Override
        public boolean hasNext() {
            return this.index >= 0;
        }

        @Override
        public Integer next() {
            return customStack.get(this.index--);
        }
    }
}
