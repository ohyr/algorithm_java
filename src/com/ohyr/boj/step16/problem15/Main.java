package com.ohyr.boj.step16.problem15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String a = in.readLine();
		String b = in.readLine();
		
		int[][] dp = new int[a.length()+1][b.length()+1];
		
		for(int i=1;i<=a.length();i++) {
			for(int j=1;j<=b.length();j++) {
				if(a.charAt(i-1) == b.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1] + 1;
				}else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		System.out.println(dp[a.length()][b.length()]);
	}

}
