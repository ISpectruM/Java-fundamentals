package Exam_February_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class B_Earthquake {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int wavesCount = Integer.parseInt(reader.readLine());
        ArrayDeque<ArrayDeque<Integer>> activities = getTheActivities(wavesCount, reader);
        ArrayList<Integer> seismicities = new ArrayList<>();

        while (activities.size()!=0){
            ArrayDeque<Integer> currActivity = activities.pollFirst();
            int seismicity = currActivity.pollFirst();
            seismicities.add(seismicity);

            while (currActivity.size() !=0){
                int wave = currActivity.peek();
                if (seismicity >= wave){
                    currActivity.poll();
                }else {
                    break;
                }
            }

            if (currActivity.size()!= 0){
                activities.offer(currActivity);
            }
        }

        System.out.println(seismicities.size());
        StringBuilder result = new StringBuilder();
        for (Integer seismicity : seismicities) {
            result.append(seismicity)
                    .append(" ");
        }
        System.out.print(result.deleteCharAt(result.length()-1));
    }

    private static ArrayDeque<ArrayDeque<Integer>> getTheActivities(int wavesCount, BufferedReader reader) throws IOException {
        ArrayDeque<ArrayDeque<Integer>> activities = new ArrayDeque<>();
        for (int waves = 0; waves < wavesCount; waves++) {
            String[] activity = reader.readLine().split(" ");

            ArrayDeque<Integer> currActivity = new ArrayDeque<>();

            for (int i = 0; i < activity.length; i++) {
                currActivity.offer(Integer.parseInt(activity[i]));
            }
            activities.offer(currActivity);
        }
        return activities;
    }
}
