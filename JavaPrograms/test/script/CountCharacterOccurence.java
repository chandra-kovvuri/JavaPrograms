package script;

public class CountCharacterOccurence {
	
	public static void main(String[] args)
    {
        String s = "Java is java again java again";
        System.out.println(s.length());
        char c = 'a';
        int count = s.length() - s.replace("a", "").length();
        //int count = s.replace("a", "").length();
        System.out.println("Number of occurances of 'a' in "+s+" = "+count);
    }

}
