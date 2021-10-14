
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Joseph Powell IV
 * @author jpowelliv
 *
 */

public class ValueComp implements Comparator<String> {

	TreeMap<String, Integer> map = new TreeMap<String, Integer>();

	public ValueComp(Map<String, Integer> swords){
		this.map.putAll(swords);
	}

	@Override
	public int compare(String s1, String s2) {
		if (map.get(s1) >= map.get(s2)) {
			return -1;
		} else {
			return 1;
		}
	}
}
