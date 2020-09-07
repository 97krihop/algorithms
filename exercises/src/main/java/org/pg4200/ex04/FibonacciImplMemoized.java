package org.pg4200.ex04;

public class FibonacciImplMemoized implements Fibonacci{


	int[] x = new int[100];

	@Override
	public int compute(int n) throws IllegalArgumentException {
		if(n < 0){
			throw new IllegalArgumentException("Negative input: " + n);
		}
		if(n == 0){
			return 0;}
		if(n == 1){
			return 1;}
		if(0 != x[n-1]){
			return x[n-1];
		}
		int comp = compute(n-2) + compute(n-1);
		if(0 == x[n-1]){
			x[n-1] = comp;
		}
		return comp;
	}
}
