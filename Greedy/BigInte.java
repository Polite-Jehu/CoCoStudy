package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BigInte  {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] input = new int[N];
		int[] output = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++)
		{
			input[i] = Integer.parseInt(st.nextToken());
		}
		int useCounter=1;
		boolean su = false;
		
		for(int j=0;j<output.length;j++)
		{
			if(useCounter>K)
			{
				useCounter=1;
				su=true;
			}
			if(su==false)
			{
				output[j]=input[N-1];
				
			}
			else if(su)
			{
				output[j]=input[N-2];
				su=false;
			}			
			useCounter++;
		}
		int result=0;
		for(int i:output)
		{
			result+=i;
		}
		System.out.println(result);
	}
	

}
