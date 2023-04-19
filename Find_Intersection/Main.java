package Find_Intersection;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static String FindIntersection(String[] strArr) {
		String[] firstIndex = strArr[0].split(",");		
		String[] secondIndex = strArr[1].split(",");
		
		List<String> result = new ArrayList<>(); 
		
		
		for(int i=0; i<firstIndex.length; i++) {
			for(int j=0; j<secondIndex.length; j++) {
				if(firstIndex[i].equals(secondIndex[j])) {
					result.add(firstIndex[i]);
				}
			}
		}
		
		String response = String.join(",", result);
		
		return response;
	}

	public static void main(String[] args) {
		System.out.print(FindIntersection(new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}));
	}

}
