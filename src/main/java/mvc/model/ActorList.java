package mvc.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ActorList {
	
	HashMap<String, List<String>> map;
	
	public ActorList() {
	 	map = new HashMap<>();
		map.put("m", Arrays.asList("장동건,장서건,장남건,북두신건".split(",")));
		map.put("f", Arrays.asList("한가인,한나인,한다인".split(",")));
		map.put("it", Arrays.asList("스티브잡스,스티븐시갈,스티븐미".split(",")));
	}
	
	public List<String> actors(String key){
		
		return map.get(key);
	}

	public HashMap<String, List<String>> getMap() {
		return map;
	}

	public void setMap(HashMap<String, List<String>> map) {
		this.map = map;
	}
	
	
	
}
