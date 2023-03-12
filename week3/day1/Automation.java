package week3.day1;

public class Automation extends MultipleLangauge implements Language, TestTool{
	
	public void java() {
		// TODO Auto-generated method stub
		
		System.out.println("Inside Automation class implementing Java method");
		
	}
	
	public void selenium() {
		// TODO Auto-generated method stub
		
		System.out.println("Inside Automation class implementing Selenium method");
	}
	
	
	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		
		System.out.println("Inside Automation class overiding Ruby");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Automation automation = new Automation();
		
		automation.java();
		automation.selenium();
		automation.python();
		automation.ruby();
		
		

	}

}
