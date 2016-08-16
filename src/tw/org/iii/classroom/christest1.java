package tw.org.iii.classroom;

public class christest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ball = new int[9];
		int count = 0 , i , j , no;
		
		for(i = 1 ; i <= 8 ; i++ ){
			ball[i] = i;
			//System.out.println(ball[i]);
		};
		
		for (j = 1 ; j <= 8 ; j++) {
			no = (int)(Math.random()*8+1);
			i = ball[j];
			ball[j] = ball[no];
			ball[no] = i;
		}
		
		for(j = 1 ; j <= 8 ; j++){
			
			System.out.println(ball[j]);
		}
	}

}
