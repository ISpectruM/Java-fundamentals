package Exam_Retake_August_2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class A_Second_Nature {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> secondNature = new ArrayList<>();

        ArrayDeque<Integer> flowers = new ArrayDeque<>();
        ArrayDeque<Integer> buckets = new ArrayDeque<>();

        flowers = getFlowers(flowers,reader);
        buckets = getBuckets(buckets,reader);

        while (true){
            if (buckets.isEmpty() || flowers.isEmpty()){
                break;
            }

            int currFlower = flowers.pollFirst();
            int currBucket = buckets.pop();

            if (currBucket > currFlower){
                int restBucket = currBucket-currFlower;
                if (!buckets.isEmpty()){
                    int nextBucket = buckets.pop();
                    buckets.push(nextBucket+restBucket);
                }else {
                    buckets.push(restBucket);
                }
            } else if (currFlower > currBucket){
                currFlower -= currBucket;
                flowers.push(currFlower);
            } else {
                secondNature.add(currFlower);
            }
        }

        if (buckets.isEmpty()){
            for (Integer flower : flowers) {
                System.out.printf("%d ",flower);
            }
            System.out.println();
        }else {
            for (Integer bucket : buckets) {
                System.out.printf("%d ", bucket);
            }
            System.out.println();
        }
        if (!secondNature.isEmpty()){
            for (Integer flower : secondNature) {
                System.out.printf("%d ", flower);
            }
            System.out.println();
        } else {
            System.out.println("None");
        }
    }

    private static ArrayDeque<Integer> getBuckets(ArrayDeque<Integer> buckets, BufferedReader reader) throws IOException {
        String[] bucketValues = reader.readLine().split(" ");
        for (String bucketValue : bucketValues) {
            int currValue = Integer.parseInt(bucketValue);
            buckets.push(currValue);
        }

        return buckets;
    }

    private static ArrayDeque<Integer> getFlowers(ArrayDeque<Integer> flowers, BufferedReader reader) throws IOException {

        String[] flowerValues = reader.readLine().split(" ");
        for (String flowerValue : flowerValues) {
            int currValue = Integer.parseInt(flowerValue);
            flowers.offer(currValue);
        }
        return flowers;
    }
}
