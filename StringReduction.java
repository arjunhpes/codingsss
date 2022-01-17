import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine().trim());
		for (int k = 0; k < t; k++) {
			String s = sc.nextLine();

			int[] a = new int[3];
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'a') a[0]++;
				if (s.charAt(i) == 'b') a[1]++;
				if (s.charAt(i) == 'c') a[2]++;
			}
			
			while (true) {
				int c = a[0] + a[1] + a[2];
				if (a[0] == c || a[1] == c || a[2] ==c) 
					break;
				
				if (a[0] <= a[1] && a[0] <= a[2]) {
					a[0]++;
					a[1]--;
					a[2]--;
				} else 
					if (a[1] <= a[0] && a[1] <= a[2]) {
						a[1]++;
						a[0]--;
						a[2]--;
					} else
						if (a[2] <= a[0] && a[2] <= a[1]) {
							a[2]++;
							a[0]--;
							a[1]--;
						};
				
				
			}
			
			System.out.println(a[0] + a[1] + a[2]);
			
		}
		sc.close();
	}
}

{"mode":"full","isActive":false}
