package graph;

import java.util.Scanner;
import java.util.*;
class Edges implements Comparable<Edges>{
	public Edges(int a,int b,int d)
	{
		nodeA=a;
		nodeB=b;
		distance = d;
	}
	
	int nodeA;
	int nodeB;
	int distance;
	
	
	
	public int getA()
	{
		return nodeA;
	}
	public int getB()
	{
		return nodeB;
	}
	public int getDistance()
	{
		return distance;
	}
	@Override
	public int compareTo(Edges o) {
		if(this.distance<o.distance) return -1;
		return 1;
	}
	
	
}

public class Main {
	
	

	public static int[] mother = new int[10001];
	public static ArrayList<Edges> graph = new ArrayList<>();
	public static int V,E;
	public static int findParent(int x) {
	        // 루트 노드가 아니라면, 루트 노드를 찾을 때까지 재귀적으로 호출
	        if (x == mother[x]) return x;
	        return mother[x] = findParent(mother[x]);
	}
	
	public static void unionParents(int a,int b)
	{
		a = findParent(a);
        b = findParent(b);
        if (a < b) mother[b] = a;
        else mother[a] = b;

	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		V=scan.nextInt();
		E=scan.nextInt();
		for(int i=0;i<=V;i++)
		{
			mother[i]=i;
		}
		for(int i=0;i<E;i++)
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=scan.nextInt();
			graph.add(new Edges(a,b,c));
		}
		Collections.sort(graph);
		int cost=0;
		for(Edges e:graph)
		{
			if(findParent(e.getA())!=findParent(e.getB()))
			{
				cost+=e.getDistance();
				unionParents(e.getA(),e.getB());
			}
		}
		System.out.println(cost);
		

	}

}
