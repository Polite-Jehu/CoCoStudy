package binarySearch;

import java.util.*;

public class setStudy {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        // N(������ ��ǰ ����)
	        int n = sc.nextInt();
	        // ����(Set) ������ ó���ϱ� ���� HashSet ���̺귯��
	        HashSet<Integer> s = new HashSet<>();
	        for (int i = 0; i < n; i++) {
	            int x = sc.nextInt();
	            s.add(x);
	        }
	        
	        // M(�մ��� Ȯ�� ��û�� ��ǰ ����)
	        int m = sc.nextInt();
	        HashSet<Integer> targets = new HashSet<>();
	        for (int i = 0; i < m; i++) {
	            targets.add(sc.nextInt());
	        }
	        //containsAll ��ǻ� �ٰ��ƾ���
	            if (targets.containsAll(s)) {
	                System.out.print("yes ");
	            }
	            else {
	                System.out.print("no ");
	            }
	        
	    }

}
