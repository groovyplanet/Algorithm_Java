import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number= Integer.parseInt(br.readLine());
		int cnt =0;
		for(int i=0; i<number; i++) {
			String k =br.readLine();
			boolean[]alpha = new boolean[26];
			boolean tf = true;
			char first = k.charAt(0);
			alpha[first-'a']=true;
		

			for(int j=1; j<k.length(); j++) {
				char f = k.charAt(j);
				if(f!=first) {
				if(alpha[f-'a']) {
					tf= false;
					break;
				}else {
					alpha[f-'a']=true;
				}
				}
				first = f;

			}
			if(tf) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}