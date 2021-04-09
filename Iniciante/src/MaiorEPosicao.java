import java.util.Scanner;

public class MaiorEPosicao {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] totalNum = new int[100];
		int greaterNum;
		int positionNum;
		
		for(int i = 0; i < 100; i++) {
			totalNum[i] = sc.nextInt();
		}
		
		greaterNum = totalNum[0];
		positionNum = 1;
		
		for(int i = 0; i < 100; i++) {
			if(totalNum[i] > greaterNum) {
				greaterNum = totalNum[i];
				positionNum = i+1;
			}
		}
		
		System.out.println(greaterNum);
		System.out.println(positionNum);
		
	}

}