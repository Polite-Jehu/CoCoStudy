package Implementation;

import java.util.Scanner;

public class LCS {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a ="0"+scan.nextLine();
		String b ="0"+scan.nextLine();
		int[][] answer = new int[a.length()][b.length()];
		
		for(int i=0;i<a.length();i++)
		{
			answer[i][0]=0;
		}
		for(int j=0;j<b.length();j++)
		{
			answer[0][j]=0;
		}
		
		
		
		for(int i=1;i<a.length();i++)
		{
			for(int j=1;j<b.length();j++)
			{
				if(a.charAt(i)==b.charAt(j))
				{
					answer[i][j] = answer[i-1][j-1]+1;
				}
				else
				{
					answer[i][j] = Math.max(answer[i-1][j], answer[i][j-1]);
				}
			}
		}
		
		System.out.println(answer[a.length()-1][b.length()-1]);
	}
	

}
