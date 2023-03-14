package week3.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="Archana";
		//String name = new String ("Archana");
		
        char []nameChar = name.toCharArray();
        
        String rev="";
        
        for (int i = nameChar.length-1 ; i >=0; i--) {
        	
        	rev+=nameChar[i];
			
		}
        System.out.println(rev);
		

	}

}
