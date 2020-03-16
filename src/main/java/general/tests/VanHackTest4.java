package general.tests;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

class Result4 {

	  public static List<Integer> predictAnswer(List<Integer> stockData, List<Integer> queries) {
	    	Integer[] query = new Integer[queries.size()];
	    	System.out.println(queries);
	    	int stockMin = stockData.stream().min(Comparator.comparing(Integer::valueOf)).get();
   			System.out.println("Qtde min: " + stockData.stream().filter(stock -> stock == stockMin).count());
	    	
	    	for (int dayQuery = 0; dayQuery < queries.size(); dayQuery++) {
	    				int daySmaller = 0;
	    				boolean found = false;
	    				int previousDay = queries.get(dayQuery)-2;
	    				int nextDay = queries.get(dayQuery);
		    				while (!found) {
			    					if (previousDay >= 0) {
		    							System.out.println(stockData.get(previousDay) + " - " + stockData.get(queries.get(dayQuery)));
			    						if (stockData.get(previousDay) < stockData.get(queries.get(dayQuery)-1) || stockData.get(previousDay) == stockMin) {
											daySmaller = previousDay+1;
					    					found = true;
			    						}
			    						else { 
			    							previousDay--;
			    						}
			    					}
			    					if (!found && nextDay < stockData.size()) {
		    							System.out.println(stockData.get(nextDay) + " - " + stockData.get(queries.get(dayQuery)));
			    						if (stockData.get(nextDay) < stockData.get(queries.get(dayQuery)-1) || stockData.get(nextDay) == stockMin) {	
											daySmaller = nextDay+1;
					    					found = true;
			    						} else {
			    							nextDay++;
			    							}
			    					}
			    					if (previousDay < 0 && nextDay >= stockData.size()) {
			    						daySmaller = -1;
			    						found = true;
			    					}
			    				}
	    				query[dayQuery] = daySmaller;
	    	};
	    	
	    	return Arrays.asList(query);
	  }
}

public class VanHackTest4 {
    public static void teste() throws IOException {

    	List<Integer> stockData = Arrays.asList(50001,50001,50001,50001,50001,50001,50001,50001,50001,50001,50001,50001,50001,50001,50001,50001,50001,50001,50001,50001,50001);

    	List<Integer> queries = Arrays.asList(3,1,8);

    	System.out.println(Result4.predictAnswer(stockData, queries));
    }
}