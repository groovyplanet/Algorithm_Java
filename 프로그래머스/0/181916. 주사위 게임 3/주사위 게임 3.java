class Solution {
	public int solution(int a, int b, int c, int d) {
		int answer = 0;
		int [] arr = new int [4];

		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		arr[3]=d;

		int p = 0;
		int q = 0;
		int z = 0;

		for(int i=0; i<arr.length; i++) {
			int cnt =0;
			for(int j=0; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					p = arr[j];
					cnt++;
				}else {
					q=arr[j];
				}
			}
			if(cnt==4) {
				return 1111*a;
			}else if(cnt==3) {
				return (10*p+q)*(10*p+q);
			}else if(cnt==2) {
				z++;
			}


		}
		if(z==4) {
			return (p+q)*Math.abs(p-q); 

		}else if(z==2) {
			int r = 0;
			int s = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != p && r == 0) {
					r = arr[i];
				} else if (arr[i] != p) {
					s = arr[i];
				}



			}
		}
		return Math.min(Math.min(a, b),Math.min(c, d));
	}
}
