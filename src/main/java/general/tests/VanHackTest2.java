package general.tests;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.IntStream;

class Result2 {

    /*
     * Complete the 'countMeetings' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY firstDay
     *  2. INTEGER_ARRAY lastDay
     */

    public static int countMeetings(List<Integer> firstDay, List<Integer> lastDay) {
    // Write your code here
    		Set<Integer> meetings = new HashSet<Integer>();
    		IntStream.range(0, firstDay.size()).forEach(investor ->  {
					OptionalInt dayFree = IntStream.rangeClosed(firstDay.get(investor), lastDay.get(investor))
									    				.filter(day -> !meetings.contains(day))
									    				.findFirst();
					if (dayFree.isPresent())
						meetings.add(dayFree.getAsInt());
    		});
//    		IntStream.range(0, firstDay.size()).forEach(investor ->  {
//				OptionalInt dayFree = IntStream.rangeClosed(firstDay.get(investor), lastDay.get(investor))
//								    				.filter(day -> (meetings.size() < day || meetings.get(day) == null))
//								    				.findFirst();
//				if (dayFree.isPresent())
//					meetings.add(dayFree.getAsInt());
//				
//});
//    		IntStream.range(0, lastDay.size()).filter(investor -> !meetings.contains(lastDay.get(investor)))
//    										.forEach(investor -> meetings.add(lastDay.get(investor)));

    		System.out.println(meetings.toString());
    		return (int)meetings.stream().count();
    }

}

public class VanHackTest2 {
    public static void teste() throws IOException {
        List<Integer> firstDay = Arrays.asList(1, 10, 11);
        List<Integer> lastDay = Arrays.asList(11, 10, 11);

        int result = Result2.countMeetings(firstDay, lastDay);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedWriter.close();
    }
}