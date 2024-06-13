package groupnamea.Projectnamep;

public class new1 {

	public static void main(String[] args) {
		 String inp="karnataka";
		 String output=transformString(inp);
		 System.out.println(output);
	}
 public static String transformString(String inp) {
	 StringBuilder output = new StringBuilder();
	 int count =1;
	 for(int i=0;i<inp.length();i++) {
		 char currentChar=inp.charAt(i);
		 if(currentChar=='a') {
			 output.append(count);
			 count++;
		 }else {
			 output.append(currentChar);
		 }
	 }
 return output.toString();
}
}

