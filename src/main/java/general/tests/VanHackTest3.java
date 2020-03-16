package general.tests;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Result3 {

    /*
     * Complete the 'countMeetings' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY firstDay
     *  2. INTEGER_ARRAY lastDay
     */
//    public static List<Integer> kthPerson(int k, List<Integer> p, List<Integer> q) {
//    	Integer[] query = new Integer[q.size()];
//		Arrays.fill(query, 0);
//		if (k > p.size()) 
//			return Arrays.asList(query);
//		
//    	Map<Integer,Integer> qry = new HashMap<Integer, Integer>();
//    	Map<Integer,Integer> queue = new HashMap<Integer, Integer>();
//    	IntStream.range(0, q.size()).forEach(idx -> qry.put(idx, q.get(idx)));
//    	IntStream.range(0, p.size()).forEach(idx -> queue.put(idx, p.get(idx)));
//    	Map<Integer,Integer> qSorted = qry
//				    	        .entrySet()
//				    	        .stream()
//				    	        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
//				    	        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
//				    	                				LinkedHashMap::new));
//    	Map<Integer,Integer> queueSorted = queue
//    	        .entrySet()
//    	        .stream()
//    	        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
//    	        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
//    	                				LinkedHashMap::new));
//    	AtomicInteger lastBus = new AtomicInteger(0);
//    	queueSorted.forEach((key,value) -> {
//    			for (int pos = lastBus.get(); pos <= qSorted.size();pos++) {
//    				 if (value >= queueSorted.entrySet().iterator().get(pos).intValue()) {
//    					 if (key > query[pos]) {
//    						 query[pos] = key;
//    					 }
//    				 } else {
//    					 lastBus.set(pos);
//    					 break;
//    				 }
//    			}
//    	});
//

//		qry.entrySet().stream()
//						.sorted(Map.Entry.<Integer, Integer>comparingByValue())
//						.forEach(bus -> {
//							 int pos = 0;
//							 int countPerson = 0;
//							 for (Integer patience : p) {
//								  pos++;
//								  if (patience >= bus.getValue())
//									  countPerson++;
//								  if (countPerson >= k)
//									  break;
//							 }
//				   		 query[bus.getKey()] = countPerson == k ? pos : 0;
//						});

// 		for (int bus = 0; bus < q.size();bus++)  {
//			 int pos = 0;
//			 countPerson = 0;
//			 for (Integer patience : p) {
//				  pos++;
//				  if (patience >= q.get(bus)) 
//					  countPerson++;
//				  if (countPerson >= k)
//					  break;
//			 }
//  		 query[bus] = countPerson == k ? pos : 0;
//		}
	 		
//    	IntStream.range(0, q.size()).parallel().forEach(bus -> {
//     		AtomicInteger countPerson = new AtomicInteger(0);
//    		 int person = IntStream.range(0, p.si)ze())
//				    				.filter(pos -> p.get(pos) >= q.get(bus))
//				    				.peek(pos -> countPerson.incrementAndGet())
//				    				.filter(pos -> (countPerson.get() >= k))
//				    				.findFirst()
//				    				.orElse(0);
//    		 query[bus] = countPerson.get() == k ? person+1 : 0;
//		});
    	
    	//       	q.stream().parallel().forEach(time -> {
//     		AtomicInteger countPerson = new AtomicInteger(0);
//    		 int person = IntStream.range(0, p.size())
//				    				.filter(pos -> p.get(pos) >= time)
//				    				.peek(pos -> countPerson.incrementAndGet())
//				    				.filter(pos -> (countPerson.get() >= k))
//				    				.findFirst()
//				    				.orElse(0);
//    		result.add(countPerson.get() == k ? person+1 : 0);
//    		});

//    	return Arrays.asList(query);
//    }

    public static List<Integer> kthPerson(int k, List<Integer> p, List<Integer> q) {
    	Integer[] query = new Integer[q.size()];
		Arrays.fill(query, 0);
		if (k > p.size()) 
			return Arrays.asList(query);
		System.out.println(p.stream().sorted().collect(Collectors.toList()));
    	Map<Integer,Integer> qry = new HashMap<Integer, Integer>();
    	IntStream.range(0, q.size()).forEach(idx -> qry.put(idx, q.get(idx)));
    	IntStream.range(0, q.size()).parallel()
							        .forEach(bus -> {
							        	int countPerson = 0;
							        	int pos = 0;
							        	for (int person =0; person < p.size(); person++) {
							        		pos++;
							        		if (p.get(person) >= q.get(bus))
							        			countPerson++;
							        		else {
							        			if (person > (p.size() - k + countPerson))
							                        break;
							        		}
							        		if (countPerson >= k)
							        			break;
							       }
							     query[bus] = countPerson == k ? pos : 0;
							});

// 		for (int bus = 0; bus < q.size();bus++)  {
//			 int pos = 0;
//			 countPerson = 0;
//			 for (Integer patience : p) {
//				  pos++;
//				  if (patience >= q.get(bus)) 
//					  countPerson++;
//				  if (countPerson >= k)
//					  break;
//			 }
//  		 query[bus] = countPerson == k ? pos : 0;
//		}
	 		
//    	IntStream.range(0, q.size()).parallel().forEach(bus -> {
//     		AtomicInteger countPerson = new AtomicInteger(0);
//    		 int person = IntStream.range(0, p.si)ze())
//				    				.filter(pos -> p.get(pos) >= q.get(bus))
//				    				.peek(pos -> countPerson.incrementAndGet())
//				    				.filter(pos -> (countPerson.get() >= k))
//				    				.findFirst()
//				    				.orElse(0);
//    		 query[bus] = countPerson.get() == k ? person+1 : 0;
//		});
    	
    	//       	q.stream().parallel().forEach(time -> {
//     		AtomicInteger countPerson = new AtomicInteger(0);
//    		 int person = IntStream.range(0, p.size())
//				    				.filter(pos -> p.get(pos) >= time)
//				    				.peek(pos -> countPerson.incrementAndGet())
//				    				.filter(pos -> (countPerson.get() >= k))
//				    				.findFirst()
//				    				.orElse(0);
//    		result.add(countPerson.get() == k ? person+1 : 0);
//    		});

    	return Arrays.asList(query);
    }


}

public class VanHackTest3 {
    public static void teste() throws IOException {

//    	List<Integer> p = Arrays.asList(1,4,4,3,1,2,6);
//    	List<Integer> q = Arrays.asList(1,2,3,4,5,6,7);
//    	Integer k = 2;
    	List<Integer> p = Arrays.asList(78, 26, 50, 5, 53, 72, 43, 12, 3, 44, 11, 21, 4, 90, 64, 48, 32, 57, 51, 70, 91, 14, 25, 61, 42, 54, 76, 21, 23, 95, 8, 60, 29, 70, 17, 89, 93, 63, 81, 30, 64, 11, 88, 46, 81, 22, 19, 42, 90, 89, 54, 33, 81, 13, 90, 36, 32, 91, 12, 28, 23, 65, 43, 1, 82, 36, 87, 31, 1, 17, 52, 54, 42);
    	List<Integer> q = Arrays.asList(49, 23, 70, 12, 27, 34, 25, 95, 17, 33, 22, 52, 56, 71, 41, 37, 7, 98, 26, 97, 25, 26, 70, 50);
    	Integer k = 57;

    	//    	List<Integer> p = Arrays.asList(2,5,3);
//    	List<Integer> q = Arrays.asList(1,5);
//    	Integer k = 3;

//    	List<Integer> p = Arrays.asList(1,2,3,4);
//    	List<Integer> q = Arrays.asList(1,3,4);
//    	Integer k = 2;

    	System.out.println(Result3.kthPerson(k, p, q));
    }
}