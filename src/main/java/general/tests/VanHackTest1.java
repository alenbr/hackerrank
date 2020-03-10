package general.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Optional;
import java.util.stream.Stream;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

class Result {
	private static final String urlBase = "https://jsonmock.hackerrank.com/api/transactions/search?userid=";
    /*
     * Complete the 'getExpenditure' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER userId
     *  2. INTEGER locationId
     *  3. INTEGER netStart
     *  4. INTEGER netEnd
     *
     *  https://jsonmock.hackerrank.com/api/transactions/search?userId=
     */
	
	
    public static int getExpenditure(int userId, int locationId, int netStart, int netEnd) {

    	int currentPage = 0;
    	Double totalAmount = 0.0;
    	boolean hasNext = true;
    	while (hasNext) {
    		currentPage++;
    		try (BufferedReader reader = new BufferedReader(new InputStreamReader(getUserPage(userId, currentPage)))) {
    			Stream<String> content = reader.lines();
    			Optional<JsonObject> objectPage = content.map(contentLine -> new Gson().fromJson(contentLine, JsonObject.class)).findFirst();
	            int totalPages =objectPage.map(obj -> obj.get("total_pages").getAsInt()).get();
	            Optional<JsonArray> dataObj = objectPage.map(lines -> lines.getAsJsonArray("data"));
	            for (int idx = 0; idx < dataObj.get().size();idx++) {
	            	Optional<JsonObject> userObj = Optional.ofNullable(dataObj.get().get(idx).getAsJsonObject());
	            	if (userObj.get().get("userId").getAsInt() == userId) {
					     Optional<JsonObject> locationObj = Optional.ofNullable(userObj.get().get("location").getAsJsonObject());
			             if (locationObj.get().get("id").getAsInt() == locationId) {
			            	String ip = userObj.get().get("ip").getAsString();
			            	int net = Integer.parseInt(ip.substring(0,ip.indexOf(".")));
			            	if (net >= netStart && net <= netEnd) {
		    	            	totalAmount += Double.parseDouble(userObj.get().get("amount").getAsString().replace("$", "").replaceAll(",",""));
			            	}
		        		}
	            	}
	            }
	            reader.close();
	            if (currentPage >= totalPages)
	            	hasNext = false;
	         } catch (Exception ex) {
	    		ex.printStackTrace();
	         }
    	};
    	System.out.println("totalAmount: " + Math.round(totalAmount));
    	return (int)Math.round(totalAmount);
    }
    public static InputStream getUserPage(int userId, int pageNumber) throws Exception {
    	URL url = new URL(urlBase + userId + "&page=" + pageNumber);
    	HttpURLConnection request = (HttpURLConnection) url.openConnection();
    	request.setRequestMethod("GET");
    	request.setRequestProperty("Content-Type", "application/json");
    	return request.getInputStream();
    }
    

}

public class VanHackTest1 {
    public static void teste() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int userId = Integer.parseInt(bufferedReader.readLine().trim());

        int locationId = Integer.parseInt(bufferedReader.readLine().trim());

        int netStart = Integer.parseInt(bufferedReader.readLine().trim());

        int netEnd = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.getExpenditure(userId, locationId, netStart, netEnd);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }

}
