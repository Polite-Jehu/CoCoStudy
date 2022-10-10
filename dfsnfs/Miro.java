package dfsnfs;

import java.util.*;

class Node{
	private int x;
	private int y;
	public Node(int x ,int y)
	{
		this.x = x;
		this.y = y;	
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
}

public class Miro {
	public static int dx[] = {-1,1,0,0};
	public static int dy[] = {0,0,-1,1};
	public static int N,M;
	public static int[][] graph = new int[201][201];
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		N=scan.nextInt();
		M=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<N;i++)
		{
			String st = scan.nextLine();
			for(int j=0;j<M;j++)
			{
				graph[i][j] = st.charAt(j) -'0';
			}
		}
		
		System.out.println(BFS(0,0));
		
	}
	public static int BFS(int x,int y)
	{
		Queue<Node> q = new LinkedList<>();
		q.offer(new Node(x,y));
		while(q.isEmpty())
		{
			Node node = q.poll();
			x=node.getX();
			y=node.getY();
			
			//»óÇÏÁÂ¿ì·Î ¹«ºùÄ¡¼¼¿ä ¹«ºù 
			for(int i=0;i<4;i++)
			{
				int nx=x+dx[i];
				int ny=y+dy[i];
				
				if(nx<0||nx>=N||ny<0||ny>=M)
					continue;
				
				if(graph[nx][ny]==0) continue;
				if(graph[nx][ny]==1)
				{
					graph[nx][ny]= graph[x][y]+1;
					q.offer(new Node(nx,ny));
				}
			}
			
			
				
		}
		return graph[N-1][M-1];
	}
}
