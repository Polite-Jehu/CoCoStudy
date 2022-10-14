package ShortestPath;

import java.util.*;


import java.lang.Math;

class Kan implements Comparable<Kan>
{
	Kan(int x,int y,int value)
	{
		this.x=x;
		this.y=y;
		this.value=value;
	}
	int x;
	int y;
	int value;

	public int compareTo(Kan other)
	{
		if(this.value<other.value) return -1;
		else return 1;
	}
	
}

public class Main {
	public static StringBuilder st = new StringBuilder();
	public static int INF = (int)1e9;
	public static int[][] arr = new int[126][126];
	public static int[][] answer = new int[126][126];
	public static Scanner sc = new Scanner(System.in);
	
	public static int[] goX = {-1,1,0,0};
	public static int[] goY = {0,0,1,-1};
	
	public static void Dikstra(int N)
	{
		
		for(int i=1;i<=N;i++)
		{
			sc.nextLine();
			for(int j=1;j<=N;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=1;i<=N;i++)
		{
			
			for(int j=1;j<=N;j++)
			{
				Arrays.fill(answer[i], INF);		
			}
		}
		
		PriorityQueue<Kan> pq = new PriorityQueue<>();
		answer[1][1] = arr[1][1];
		pq.add(new Kan(1,1,arr[1][1]));
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
	
		
		while(!pq.isEmpty()) {
			Kan now = pq.poll();
			int x = now.x;
			int y= now.y;
			for(int i=0;i<4;i++) {
				int nowx = x+dx[i];
				int nowy = y+dy[i];
			if(1>nowx||1>nowy||N<nowx||N<nowy) continue;
				if(answer[x][y]+arr[nowx][nowy]<answer[nowx][nowy]) {
					answer[nowx][nowy] = answer[x][y]+arr[nowx][nowy];
					pq.add(new Kan(nowx, nowy, answer[nowx][nowy]));
				}
			}
		}
		
//		PriorityQueue<Kan> pq = new PriorityQueue<>();
//		pq.add(new Kan(1,1,arr[1][1]));
//		while(!pq.isEmpty())
//		{
//			Kan kan=pq.poll();
//			int kanx=kan.x;
//			int kany=kan.y;
//			for(int i=0;i<goX.length;i++)
//			{
//				int mX=kanx;
//				int mY=kany;
//				int nowX = mX+goX[i];
//				int nowY = mY+goY[i];
//				if(nowX<1||nowX>125||nowY<1||nowY>125)
//				{
//		
//					continue;
//				}
//				else
//				{
//					if(answer[nowX][nowY]>answer[mX][mY]+arr[nowX][nowY])
//					{
//						answer[nowX][nowY] = answer[mX][mY]+arr[nowX][nowY];
//						pq.add(new Kan(nowX,nowY,answer[nowX][nowY]));
//					}
//						
//					
//					
//				}
//				System.out.println("=================");
//				for(int k=1;k<=5;k++)
//				{
//					for(int j=1;j<=5;j++)
//					{
//						System.out.print(answer[k][j]+" ");
//					}
//					System.out.println();
//				}
//				System.out.println("=================");
//				
//				
//			}
//			
//		}
		st.append(answer[N][N]+"  \n");
	}
	public static void main(String args[])
	{
		
		int N=sc.nextInt();
		while(N!=0)
		{
			Dikstra(N);
			N=sc.nextInt();
		}
		
		System.out.println(st.toString());
		
	}

}


