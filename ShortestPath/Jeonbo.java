package ShortestPath;

import java.util.*;

class Nos implements Comparable<Nos>{
	int index;
	int distance;
	
	public Nos(int i,int d)
	{
		index = i;
		distance = d;
	}
	int getIndex() {
		return index;
	}
	int getDistance() {
		return distance;
	}
	@Override
	public int compareTo(Nos o) {
		if(this.distance<o.distance)
			return -1;
		else 
			return 1;
	}
}
public class Jeonbo {
	public static ArrayList<ArrayList<Nos>> graph = new ArrayList<ArrayList<Nos>>();
	public static int[] d=new int[100001];
	public static final int INF = (int)1e9;
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int N = scan.nextInt(); 
		int M = scan.nextInt();
		int C = scan.nextInt();
		
		for(int i=0;i<=N;i++)
		{
			graph.add(new ArrayList<Nos>());
		}
		
		for(int i=0;i<M;i++)
		{
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			graph.get(a).add(new Nos(b,c));
		}
		Arrays.fill(d,INF);
	
		dijkstra(C);
		
		int countCity=0;
		int countDis=0;
		for(int i=0;i<N;i++)
		{
			if(d[i]!=INF)
			{
				countCity++;
				countDis+=d[i];
			}
		}
		System.out.println(countCity+" "+countDis);
		
	}
	public static void dijkstra(int start)
	{
		PriorityQueue<Nos> pq = new PriorityQueue<>();
		pq.offer(new Nos(start,0));
		d[start] =0;
		while(!pq.isEmpty())
		{
			Nos node = pq.poll();
			int dist = node.getDistance();
			int now = node.getIndex();
			if(d[now]<dist) continue;
			
			for(int i=0;i<graph.get(now).size();i++)
			{
				int cost = d[now]+graph.get(now).get(i).getDistance();
				if(cost<d[graph.get(now).get(i).getIndex()])
				{
					d[graph.get(now).get(i).getIndex()] =cost;
					pq.offer(new Nos(graph.get(now).get(i).getIndex(),cost));
				}
			}
			
		}
	}
}
