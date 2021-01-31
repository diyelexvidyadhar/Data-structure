class Fibonacci
{
	public static void main(String[] args) 
	{
	System.out.println(fib(10));
	}
	public static int fib(int input){
		if(input == 0){
		    return 1;
		}
		if(input == 1){
			return 1;
		}
		int smallOutput1 = fib(input-1);
		int smallOutput2 = fib(input-2);
		return smallOutput1+smallOutput2;
	}
}
