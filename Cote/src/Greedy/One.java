package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class One {

	public static void main(String[] args) throws IOException  {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int count=0;
		while(N>=2)
		{
			if(N%K==0)
			{
				N=N/K;
			}
			else
			{
				N=N-1;
			}
			count++;
		}
		System.out.println(count);
	}

}
