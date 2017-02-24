package script;

public class String_Manipulations {
	
	public static void main(String args[]){
		try{
			String[] str = new String[]{"0.1020", "1234", "12.invalid"};
            
            for(int i=0 ; i < str.length ; i ++)
            {
            	System.out.println("The value of str[i] is  "+ str[i]);
                   
                    if(str[i].indexOf(".") >= 0 )
                    { 
                   
                            try
                            {
                                    /*
                                     * To check if the number is valid decimal number, use
                                     * double parseDouble(String str) method of
                                     * Double wrapper class.
                                     *
                                     * This method throws NumberFormatException if the
                                     * argument string is not a valid decimal number.
                                     */
                            	System.out.println("The value of index is"+str[i].indexOf("."));
                            	
                                    Double.parseDouble(str[i]);
                                    System.out.println(str[i] + " is a valid decimal number");
                            }
                            catch(NumberFormatException nme)
                            {
                                    System.out.println(str[i] + " is not a valid decimal number");
                            }
                           
                    }
                    else
                    {
                            try
                            {
                                    /*
                                     * To check if the number is valid integer number, use
                                     * int parseInt(String str) method of
                                     * Integer wrapper class.
                                     *
                                     * This method throws NumberFormatException if the
                                     * argument string is not a valid integer number.
                                     */

                                    Integer.parseInt(str[i]);
                                    System.out.println(str[i] + " is valid integer number");
                            }
                            catch(NumberFormatException nme)
                            {
                                    System.out.println(str[i] + " is not a valid integer number");
                            }
                    }
            }
                     		
            char[] charArray = {'J', 'A', 'V', 'A' };
            String text = new String(charArray);
            System.out.println(text);
            }catch(Exception e){
			
		}
	}

}
