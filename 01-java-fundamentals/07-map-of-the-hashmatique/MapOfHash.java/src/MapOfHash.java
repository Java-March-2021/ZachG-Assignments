import java.util.HashMap;
import java.util.Set;

public class MapOfHash {

	public static void main(String[] args) {
		
		HashMap<String, String> trackList = new HashMap<String, String>();
		trackList.put("Stand Tall", "Stand Tall  it gets a little better");
		trackList.put("Gold To Me", "You're still gold to me");
		trackList.put("Sound of Change", "This is the sound of change");
		trackList.put("Dance All Night", "You wanna dance all night you wanna make it right");
		String name = trackList.get("Gold To Me");
		System.out.println(name);
		Set<String> keys = trackList.keySet();
		for (String key : keys) {
			System.out.println(key + ": " + trackList.get(key));
		}

	}

}
