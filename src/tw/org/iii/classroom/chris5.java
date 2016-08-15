package tw.org.iii.classroom;

public class chris5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int y = (int) (Math.random() * 2017);
		int y = 2000;
		System.out.println(y);
		
		
		
		
		if(y % 4 != 0){
			System.out.println("1平年");
			
		}else if(y % 400 == 0){
			System.out.println("2閏年");
			
		}else if(y % 100 == 0){
			System.out.println("3平年");
			
		}else{
			System.out.println("閏年");
		}
		

	 
		

	}

}
