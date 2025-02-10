package taks_8_feb_2025;

public class NonRepeating_character {
	public static void main(String[] args) {
		String input = "AABCDE";
		for(int i = 0;i<input.length();i++){
			Boolean unique = true;
			
			
			for (int j=0;j<input.length();j++){
				if(i!=j&&input.charAt(i)==input.charAt(j))
				unique = false;
				
			}
			 if(unique){
					System.out.println(input.charAt(i));
					break;
				}
		}

	 
	
	}

}
