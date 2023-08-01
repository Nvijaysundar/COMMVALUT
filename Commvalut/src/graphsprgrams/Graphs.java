package graphsprgrams;
import java.util.*;
public class Graphs {
	Map<String,List<String>> graphdict;
	public Graphs(List<String[]> routes) {
		this.graphdict = new HashMap<>();
		for(String[] edge:routes)
		{
			String start = edge[0];
			String end = edge[1];
			if(graphdict.containsKey(start))
			{
				graphdict.get(start).add(end);
			}
			else
			{
				List<String> dest = new ArrayList<>();
				dest.add(end);
				graphdict.put(start, dest);
			}
		}
	}

	public static void main(String[] args) {
		List<String[]> routes = List.of(
				new String[] {"Mumbai","Paris"},
				new String[] {"Mumbai","Dubai"},
				new String[] {"Paris","Dubai"},
				new String[] {"Paris","NewYork"},
				new String[] {"NewYork","Toronto"}
				);
		Graphs ob = new Graphs(routes);
		System.out.println(ob.graphdict.toString());
		
		String Start = "Mumbai";
		String end = "Toronto";
		System.out.println(ob.getpath(Start,end));
	}

	private List<List<String>> getpath(String start, String end) {
			return getpathhelper(start,end,new ArrayList<>());
	}
		
	private List<List<String>> getpathhelper(String start, String end, List<String> path) {
		List<List<String>> paths = new ArrayList<>();
		path.add(start);
		
		if (start.equals(end))
		{
			paths.add(new ArrayList<>(path));
			return paths;
		}
		
		if(!graphdict.containsKey(start))
		{
			return paths;
		}
		
		for(String node : graphdict.get(start))
		{
			if(!path.contains(node)) {
				List<List<String>> newPaths = getpathhelper(node,end,path);
				paths.addAll(newPaths);
			}
		}
		path.remove(path.size()-1);
	 	return paths;
	}
}
