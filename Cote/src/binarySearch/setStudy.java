package binarySearch;

import java.util.*;

public class setStudy {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        // N(가게의 부품 개수)
	        int n = sc.nextInt();
	        // 집합(Set) 정보를 처리하기 위한 HashSet 라이브러리
	        HashSet<Integer> s = new HashSet<>();
	        for (int i = 0; i < n; i++) {
	            int x = sc.nextInt();
	            s.add(x);
	        }
	        
	        // M(손님이 확인 요청한 부품 개수)
	        int m = sc.nextInt();
	        HashSet<Integer> targets = new HashSet<>();
	        for (int i = 0; i < m; i++) {
	            targets.add(sc.nextInt());
	        }
	        //containsAll 사실상 다같아야함
	            if (targets.containsAll(s)) {
	                System.out.print("yes ");
	            }
	            else {
	                System.out.print("no ");
	            }
	        
	    }

}
