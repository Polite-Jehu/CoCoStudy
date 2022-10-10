package dfsnfs;

import java.util.*;

public class BFSAnother {
	
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	public static ArrayList<Boolean> visited = new ArrayList<>();
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		for(int i=0;i<=n;i++)
		{
			graph.add(new ArrayList<Integer>());
			visited.add(false);
		}
		for(int j=0;j<m;j++)
		{
			int tempA = scan.nextInt();
			int tempB = scan.nextInt();
			graph.get(tempA).add(tempB);
			graph.get(tempB).add(tempA);
		}
		System.out.println(BFS(1)-1);
	}
	public static int BFS(int x) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(x);
		int count=0;
		while(!q.isEmpty())
		{
			
			int temp = q.poll();
			
			if(visited.get(temp))
				continue;
			count++;
			visited.set(temp, true);
			for(int i=0;i<graph.get(temp).size();i++)
			{
				if(!(visited.get(graph.get(temp).get(i))))
				{
					q.offer(graph.get(temp).get(i));
				}
			}
		}
		return count;
	}
}
