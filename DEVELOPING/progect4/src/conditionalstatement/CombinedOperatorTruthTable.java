package conditionalstatement;

public class CombinedOperatorTruthTable {

	public static void main(String[] args) {
		int num1 = 300;
		int num2 = 200;
		
		if((num1 % 2==0) || num1<num2){
			System.out.println("Num1 is even and it is less then num2");
		}else {
			System.out.println("did't succeed the logic");
			
		}

	}

}
