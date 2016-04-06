/*
Description:
A 3x3 magic square is a 3x3 grid of the numbers 1-9 such that each row, column, and major diagonal adds up to 15. Here's an example:
8 1 6
3 5 7
4 9 2
The major diagonals in this example are 8 + 5 + 2 and 6 + 5 + 4. (Magic squares have appeared here on r/dailyprogrammer before, in 
#65 [Difficult] in 2012.)
Write a function that, given a grid containing the numbers 1-9, determines whether it's a magic square. Use whatever format you want 
for the grid, such as a 2-dimensional array, or a 1-dimensional array of length 9, or a function that takes 9 arguments. You do not 
need to parse the grid from the program's input, but you can if you want to. You don't need to check that each of the 9 numbers appears 
in the grid: assume this to be true.
*/


class MagicSquares{

	boolean calculate ( int[] array ){

		System.out.print("[") ; 
		for( int i = 0; i<9 ;i++){
			System.out.print(array[i] + " ") ;
		}
		System.out.print("]\n") ; 


		//Row check
		for ( int i = 0 ; i < 9 ; i+=3 ){
			
			int sum = 0 ;

			for( int j = i ; j <= i + 3 ; j++ ){

				if ( j = i + 3){
					if ( sum != 15)
						return false ; 
				}else{
					sum += array[j] ;
				}

			}
		}

		//Column check
		for ( int i = 0; i < 3 ; i++){

			int sum = 0 ;

			for( int j = i + 3; j <= i + 6 ; j+= 3){

				if ( j == i + 6){
					if ( sum != 15)
						return false ; 
				}else{
					sum += array[i] ;
				}	
			}
		}

		//Diagonal check



	}


	public static void main(String [ ] args){
 
		MagicSquares square = new MagicSquares() ; 

		//Test inputs.
		int[] input1 = {8, 1, 6, 3, 5, 7, 4, 9, 2} ; 
		int[] input2 = {2, 7, 6, 9, 5, 1, 4, 3, 8} ;
		int[] input3 = {3, 5, 7, 8, 1, 6, 4, 9, 2} ;
		int[] input4 = {8, 1, 6, 7, 5, 3, 4, 9, 2} ; 

		//Run algorithm
		System.out.println("> " + square.calculate(input1)) ;
		System.out.println("> " + square.calculate(input2)) ;
		System.out.println("> " + square.calculate(input3)) ;
		System.out.println("> " + square.calculate(input4)) ;


	}
}