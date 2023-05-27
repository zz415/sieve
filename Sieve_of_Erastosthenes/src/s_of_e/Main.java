package s_of_e;

import java.util.*;  

public class Main {
	
	
	//function to get console input for integar
	 private static int cmd_input_store() {
	    try {
	    Scanner myInput = new Scanner( System.in );
	    System.out.println( "Hello there! , Please enter  Integar for  Sieve of Erastosthenes prime number check: " );
	    int console_input = myInput.nextInt();
	    return console_input;
	    }

	    catch(Exception e) {

	        System.out.println( "Not Valid integar, please try again" );
	        return cmd_input_store();
	    }

	  };	
	  
	  
	  
	//function to check if prime

	  private static boolean prime_check(Integer candidate) {

	   List<Integer> modulus_result =new ArrayList<Integer>();
	   
	   for (int i = 1; i <= candidate; i++) {
	       if (candidate%i == 0) {
	       modulus_result.add(candidate%i);
	       }
	   }
	   
	   if (modulus_result.size() > 2)
	   {
	       return false;
	   }
	   else {
	       return true;  
	   }
	   }; 
	   
	   
	   
	   
	 //function to run the Sieve_of_Erastosthenes
	   public static void Sieve_of_Erastosthenes() {

	   Integer input_Integer= Integer.valueOf(cmd_input_store()); //convert int to integar from cmd_input_store function

	   List<Integer> prime_list =new ArrayList<Integer>();  //empty list for prime numbers




	   if (input_Integer <= 1) {
	       System.out.println(prime_list); //if 1 or 0 empty list, no primes
	   }


	   else if (input_Integer == 2)
	   {
	       prime_list.add(input_Integer);
	       System.out.println(prime_list);  //if 2 only 1 prime, 2
	   }

	   else {


	       for (int i = 2; i <= input_Integer; i++) {  //run prime check on all other entries

	           if (prime_check(i) == true )
	           {
	           prime_list.add(i);
	     
	           }
	       }

	       System.out.println(prime_list);
	       
	   }

	   Sieve_of_Erastosthenes();  //run again after completion


	   }   
	  
	
	
	
	

	public static void main(String[] args) {


		Sieve_of_Erastosthenes(); 

	}

}
