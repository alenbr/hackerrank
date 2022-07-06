package general.tests;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Result5 {

	  public boolean  checkValue(List<Integer> values, Integer k) {
		  Boolean result = false;
		  
		  Set<Integer> list = new HashSet<Integer>();
		  Integer lookupValue = 0;
		  values.stream().forEach(v -> list.add(v));
		  for (Integer val : values) {
			  lookupValue = k - val;
			  if (list.contains(lookupValue)) {
			      result = true;
			  	  break;
			  	}
		  }
		  return result;
	  }
}
