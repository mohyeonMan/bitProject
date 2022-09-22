package multi;

public class MultiArray04 {
	public static void main(String[] args) {
		//가변길이 다차원배열에서 각 행의 길이가 다를수 있다.
		int[][]ar =new int[3][];
		int a=1;
		for(int i =0;i<3;i++) {
			ar[i]=new int[i+2];
		}
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length-1;i++) {
				System.out.print(ar[j][i]+"\t");
			}
			System.out.println();
		}
		
		
	}
}

//int a = 1;
//for (int i = 0; i < ar.length; i++) {
//	for (int j = 0; j < ar[i].length; j++, a++) {
//		ar[i][j] = a * 10;
//		System.out.println("ar[" + i + "][" + j + "] = " + ar[i][j]);
//	}
//}