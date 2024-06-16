import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        
        int sum = 0; // 여긴 분수의 총 개수 합
        int cross = 0; // 여긴 대각선의 합
        
        while(sum<x) {
        	cross++; 
        	sum+=cross; 
        }
        
        int bunja;
        int bunmo;
        
        int index = sum-x; // 대각선의 인덱스 값을 구하는 변수 
        
        if(cross%2==0) { 
        	//대각선이 짝수번째일 경우에는 위에서 아래로 이동함 임의수로 2를 대입하겠음.
        	//정답은 1/2, 분자값은 1이 나와야 함.
        	bunja = cross-index; // cross는 2 , index = 3-2 = 1;
        	bunmo = index+1; // 분모는 index 1 +1 = 2; 
        }
        	else { //x = 6으로 가정 크로스값은 3이고 sum은 6 인덱스는 0       		
        		bunja = index + 1; //=1
        		bunmo = cross - index;//=3  정답= 1/3 
        	}
        System.out.println(bunja+"/"+bunmo);
        }
  
    }
