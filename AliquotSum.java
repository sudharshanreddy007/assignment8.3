package aliquotsum;


	public class AliquotSum {  //taken the main class
		

		// here i have taken  main method
   public static void main(String[] args) {
				
				
	int number = 25;  // here i have take an integer type of variable to check whether it is perfect number or not 
				
	long aliquotSum = findAliquotSum(number); //here declaring a long data type which is of 8bytes and inserting argument in the method
				
	System.out.println("Aliquot Sum of " + aliquotSum + " is " + aliquotSum + ".");
		  // here  we are applying if & else condition to check the condition
				
	if(aliquotSum == number){ //if aliquotSum equals to number then it prints if condition otherwise it prints else statement
					System.out.println(number + " is a perfect number.");
				}else{
					System.out.println(number + " is not a perfect number.");
				}
				
				                                                        
				System.out.println("Perfect Numbers between 1 to 100 are: ");   
				          //here we are initializing the number between 1 to 100
				
				for(int i=1; i<=100; i++){
					number = i;
					if(findAliquotSum(i) == number){ //  it checks the perfect numbers from 1 to 100
						System.out.print(number + " ");
					}
				}
			}
		    // here we are implemented the Method for finding the  aliquot sum
			public static long findAliquotSum(int n) {
				int show = 0; // here we have taken integer data type of variable show 

				for (byte i = 1; i <= (n / 2); i++) {  //here it checks the condition of a number and adds the sum of divisors   
					if (n % i == 0) {
						show += i;
					}
				}
				return show;
			}
	}
