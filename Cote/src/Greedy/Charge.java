package Greedy;

public class Charge {
	public static void main(String[] args) {
		int n=1260;
		int nowCoin = 500;
		int count =0;
		boolean Type = false;
		for(int i=0;i<=3;i++)
		{
			count += n/nowCoin;
			n=n%nowCoin;
			if(!Type)
			{
				nowCoin=nowCoin/5;
				Type=true;
			}
			else
			{
				nowCoin=nowCoin/2;
				Type=false;
			}		
		}
		System.out.println(count);
	}

}
