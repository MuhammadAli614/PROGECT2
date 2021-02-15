package AccessSpacifaier;

import classAndObject.House;

public class TestOffice {

	public static void main(String[] args) {
      Calculator cal = new Calculator();
      int additionResult = cal.addition(10, 100);
      System.out.println("additionResults");
      
      cal.task(10, 1000);
      
      Oficce office = new Oficce("Amazon");
      System.out.println("office.officeName");
      
      Oficce yourOffice = new Oficce();
      yourOffice.setOfficeName("Google");
      System.out.println(yourOffice.officeName);
      
      
	}

}
