package graphsprgrams;
import java.util.*;
public class Shortestpath {

	public static void main(String[] args) {
		int[][] graph = {
				{0,4,2,0,0},
				{4,0,5,10,0},
				{2,5,0,3,6},
				{0,10,3,0,2},
				{0,0,6,2,0}};
		
		int source = 0,destination = 4;
		List<Integer> shortroute = findShortPath(graph,source,destination);
		System.out.println(shortroute.toString());
	}

	private static List<Integer> findShortPath(int[][] graph, int source, int destination) {
		int n = graph.length;
		boolean[] visited = new boolean[n];
		int[] distance = new int[n];
		Arrays.fill(distance,-1); //
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		distance[source]=0;
		pq.offer(source);
		//1,2
		while(!pq.isEmpty())
		{
			int currvertex = pq.poll();
			if(visited[currvertex]) //skipp the visited node
				continue;
			visited[currvertex]  = true; // this will update as visited
			//[0,4,2,-1,-1]
			//currver = 2
			//visited [t,f,t,f,f]
			//neigh = 0
			for(int neighbour = 0;neighbour<n;neighbour++)
			{
				//graph[1][2] =
				if(graph[neighbour][currvertex]>0)
				{
					//newdis =4
					int newdistance = distance[currvertex] + graph[currvertex][neighbour];
					if (distance[neighbour]== -1 || newdistance <distance[neighbour]) {
						distance[neighbour] = newdistance;
						pq.offer(neighbour);
					}
				}
			}
		}
		for(int temp : distance)
			System.out.print(temp +" ");
		
		List<Integer> ShortestPath = new ArrayList<Integer>();
		int currver = destination;
		ShortestPath.add(currver);
		while(currver!=source)
		{
			for(int neigh=0;neigh<n;neigh++)
			{
				if(graph[neigh][currver]>0&&
						graph[neigh][currver]+distance[neigh] ==distance[currver]) {
					currver = neigh;
					ShortestPath.add(currver);
					break;
				}
			}
		}
		Collections.reverse(ShortestPath);
		return ShortestPath;
	}

}
