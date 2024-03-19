package MandN;

import java.util.*;
import java.io.*;

/*자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열*/

public class MandN {
	
	static int arr[];
	static boolean bool[];
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		
		arr = new int[n2];
		bool = new boolean[n1];
		
		dps(n1, n2, 0);
	}
	
	public static void dps(int n1, int n2, int deep) {
		
		if(n2 == deep) {
			for(int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i < n1; i++) {
			if(!bool[i]) {
				arr[deep] = i + 1;
				dps(n1, n2, deep + 1);
				bool[i] = false;
				
				
			}
		}
	}

}
