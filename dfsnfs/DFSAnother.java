package dfsnfs;

import java.util.*;


/*
 * 
 * DFS
 * �ϴ� �迭�� graph�� �����.
 * �׸��� visited�� ������� �ƴϸ� ǥ�� �����ϰ� ��ġ�� �д�. 
 * 0�̸� �̹� ���Ŷ�簡..
 * �״��� ����!
 * 
 * ���� ������ ���� ��ͷ� ���� ���ϱ�
 * */

public class DFSAnother {
	public static Integer[][] graph = new Integer[51][51];
	public static int w,h;
	//��ȭ�¿� ���������Ʒ��޾Ʒ���
	public static int[] dx = {0,0,-1,1,-1,1,-1,1};
	public static int[] dy = {-1,1,0,0,-1,-1,1,1};
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder st = new StringBuilder();
		
		while(true)
		{
			w = scan.nextInt();
			h = scan.nextInt();
			if(w==0&&h==0)
			{
				break;
			}
			for(int i=0;i<h;i++)
			{
				for(int j=0;j<w;j++)
				{
					graph[i][j]=scan.nextInt();
				}
			}
			int count=0;
			for(int i=0;i<h;i++)
			{
				for(int j=0;j<w;j++)
				{
					if(graph[i][j]!=-1&&graph[i][j]==1)
					{
						dfs(i,j);
						count++;
					}
				}
			}
			st.append(count+"\n");
		}
		System.out.println(st.toString());
	}
	public static void dfs(int x,int y){
		if(x<0||x>=h||y<0||y>=w)
			return;
		if(graph[x][y]==0)
			return;
		else
		{
			graph[x][y]=0;
			for(int i=0;i<dx.length;i++)
			{
				for(int j=0;j<dy.length;j++)
				{
					dfs(x+dx[i],y+dy[j]);
				}
			}	
		}
		
	}
}
