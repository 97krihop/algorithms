package org.pg4200.ex04;

public class FibonacciImpl implements Fibonacci {

	@Override
	public int compute(int n) throws IllegalArgumentException {
		if(n == 0){
			return 0;}
		if(n == 1){
			return 1;}
		return compute(n-2) + compute(n-1);
	}
}