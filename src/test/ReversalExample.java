package test;

public class ReversalExample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
				String str1 = "I am feeling lucky";
				
				// rev the string and show in the output
				byte[] strAsByteArray = str1.getBytes();

		        byte[] resultoutput = new byte[strAsByteArray.length];

		       
		        for (int i = 0; i < strAsByteArray.length; i++)

		        resultoutput[i] = strAsByteArray[strAsByteArray.length - i - 1];

		        System.out.println( "Reversed String  : " +new String(resultoutput));
		        
		        System.out.println("Using for 2nd *************************");
				
				int num11 = 10282023;
				
				// find the sum of all the digits in num2
				int sum1 = 0; 
				
				//executes until the condition becomes false  
				while (num11 != 0)  
				{  
				//finds the last digit from the number and add it to the variable sum      
				sum1 = sum1 + num11 % 10;  
				//removes the last digit  
				num11 = num11/10;  
				}  
				 System.out.println( "sum of  num1 : " + sum1);
				 
				 System.out.println("Using for 3rd *************************");
				 
				 int num111 = 10282023;
				 int reve =0;
				 
				// find out the rev num of num1
				 while(num111 != 0)   
				 {  
				 int remainder = num111 % 10;  
				 reve = reve * 10 + remainder;  
				 num111 = num111/10;  
				 
				 }  
				 System.out.println("The reverse of the given number is: " + reve);  
				 
				 //System.out.println("Using for 4th *************************");
				 
				// do not convert this num into string
	}

}
