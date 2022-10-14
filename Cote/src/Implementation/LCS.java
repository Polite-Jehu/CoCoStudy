package Implementation;

import java.util.Scanner;

public class LCS {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a ="0"+scan.nextLine();
		String b ="0"+scan.nextLine();
		/**
		 * LCS 각 변에 0넣고 
		 * 걔네들은 다 0으로 채우고
		 * 똑같으면 대각선왼쪾위 값 +1
		 * eu? 계속 맞다는 뜻이므로
		 * 다르면 왼쪽 or 오른쪽에서 값 +1
		 * eu? 다른거 빼와야 하니까
		 */
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
