	
/**
 * Jospeh Powell IV
 * @author jpowelliv
 *
 */
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map.Entry;
import java.util.*;
	
public class Shakespeare {
	
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
			new InputStreamReader(
					new FileInputStream("shakespeare.txt")))) {
//				List<String> swords = new ArrayList<>();
//				
//				while (br.ready()) {
//					String line = br.readLine().toLowerCase();
//					//System.out.println(line);
//					String[] words = line.split("\\r");
//					for (String word : words) {
//						//System.out.println(word);
//						swords.add(word);
//					}
//				}
//				System.out.println(swords.size());
//				
//				Set<String> swords1 = new HashSet<>();
//				
//				while (br.ready()) {
//					String line = br.readLine().toLowerCase();
//					//System.out.println(line);
//					String[] words = line.split("\\w");
//					for (String word : words) {
//						if (word.equals("")) {
//							continue;
//						}
//						//System.out.println(word);
//						swords1.add(word);
//					}
//				}
				//System.out.println(swords.size());
				
		Map<String,Integer> swords = new HashMap<>();
				
		while (br.ready()) {
			String line = br.readLine();
					//System.out.println(line);
			String[] words = line.toLowerCase().split("\\w");
			for (String word : words) {
				if (word.equals("")) {
					continue;
			}
						//System.out.println(word);
				if (!swords.containsKey(word)) {
					swords.put(word, 1);
				}else {
					int count = swords.get(word);
					count++;
					swords.put(word, count);
				}
			}
		}
				//System.out.println(swords.size());
				
		Set<Map.Entry<String, Integer>> entrySet = swords.entrySet();
		System.out.println("# of unique words: " + entrySet.size());
				
//				for (Map.Entry<String, Integer> entry: entrySet) {
//					System.out.println(entry.getValue() + "\t" + entry.getKey());
//				}
				
		int listSize = entrySet.size();
		List<String> keyList = new ArrayList<String>(listSize);
		for (Entry<String, Integer> word : entrySet) {
			keyList.add(word.getKey());
					
		System.out.println("\nAphabetically the last five: ");
				
		for (int i = 1; i < 6; i++) {
			System.out.println(keyList.get(listSize - i));
		}
				
		System.out.println("\nTop five words w/ occurance: ");
				
		TreeMap<String, Integer> valSortedMap = sortMapByValue(swords);
		Set<Map.Entry<String, Integer>> entrySetVal = valSortedMap.entrySet();
		for (int i = 0; i < 5; i++) {
			for (Map.Entry<String, Integer> entry : entrySetVal) {
				i++;
				if (i >5) {
					break;
		}else
			System.out.println(entry.getValue() + "\t" + entry.getKey());
		}
		}
	}
	}
}

	private static TreeMap<String, Integer> sortMapByValue(Map<String, Integer> swords) {
		// TODO Auto-generated method stub
		Comparator<String> comparator = new ValueComp(swords);
		TreeMap<String, Integer> result = new TreeMap<String, Integer>(comparator);
		result.putAll(swords);
		return result;
		}
}


//import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.HashMap;
//import java.util.Map;
//
//public class Shakespeare {
//
//    public static void main(String[] args) throws IOException {
//        int count  = 0;
//
//        BufferedReader br = new BufferedReader(
//                new InputStreamReader(
//                        new FileInputStream("shakespeare.txt")));
//
//        Map<String, Integer> sWords = new HashMap<>();
//
//        /**
//         * Answers : 
//         * How many unique words did Shakespeare use.
//         * Transform all words to lowercase.
//         * Do not include punctuation in your words.
//         */
//        while (br.ready()) {
//            String line = br.readLine();
//            //System.out.println(line);
//            String[] words = line.toLowerCase().split("\t");
//            for (String word : words) {
//                if (word.equals("")) {
//                    continue;
//                }
//                if (sWords.containsKey(word)) {
//                    // look it up and add one
//                    count ++;
//
//
//                } else {
//                    sWords.put(word, 1);
//                }
//            }
//        }
//
//        System.out.println(sWords.size());
//    }
//}
//
