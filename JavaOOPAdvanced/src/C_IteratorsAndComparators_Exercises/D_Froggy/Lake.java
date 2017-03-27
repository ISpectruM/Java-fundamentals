package C_IteratorsAndComparators_Exercises.D_Froggy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer>{
    private List<Integer> lake;
    private int index;
    private int lenghtCounter;


    public Lake(Integer... nums) {
        this.lake = Arrays.asList(nums);
        this.index = 0;
        this.lenghtCounter = 0;
    }

    public int getLenghtCounter() {
        return this.lenghtCounter;
    }

    public int getIndex() {
        return this.index;
    }

    public void increaseIndex(int num){
        this.setIndex(num);
    }

    private void setIndex(int index) {
        this.index += index;
    }

    public List<Integer> getLake() {
        return this.lake;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new frog();
    }

    public final class frog implements Iterator<Integer>{

        @Override
        public boolean hasNext() {
            return lenghtCounter < getLake().size();
        }

        @Override
        public Integer next() {
            if (index % 2 == 0 && index >= getLake().size()){
                index = 1;
            }
            lenghtCounter++;

            return lake.get(index);
        }
    }
}
