package ShortestPath;

import java.util.*;
import java.lang.Math;

public class Main {
	public static final int INF = (int)1e9;
	public static int[][] graph;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//노드
		int n = sc.nextInt();
		//간선
		int m = sc.nextInt();
		
		//그래프 생성 각 A -> B
		graph=new int[n+1][n+1];
		
		//모두 일단 무한 초기화
		for(int i=1;i<n+1;i++ )
		{
			for(int j=1;j<n+1;j++)
			{
				graph[i][j]=INF;
			}
		}
		
		//지에서 지는 0이니까 0
		for(int i=1;i<n+1;i++)
		{
			graph[i][i]=0;
		}
		
		
		//각 간선 1이라고 했으니까 1로 초기화
		for(int i=1;i<=m;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			graph[a][b]=1;
			graph[b][a]=1;
		}
//		System.out.println("\n======Previous======");
//		for(int a=1;a<n+1;a++)
//		{
//			for(int b=1;b<n+1;b++)
//			{
//				System.out.print(graph[a][b]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println("=====================");
		for(int k=1;k<n+1;k++)
		{
			for(int a=1;a<n+1;a++)
			{
				for(int b=1;b<n+1;b++)
				{
					graph[a][b] = Math.min(graph[a][b],graph[a][k]+graph[b][k]);
				}
			}
		}
//		System.out.println("\n======AFTER======");
//		for(int a=1;a<n+1;a++)
//		{
//			for(int b=1;b<n+1;b++)
//			{
//				System.out.print(graph[a][b]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println("=====================");
		
		int x= sc.nextInt();
		int k=sc.nextInt();
		int distance=graph[1][k]+graph[k][x];
		if(distance>=INF)
			System.out.println(-1);
		else
			System.out.println(distance);
		
		
		
	}

}


