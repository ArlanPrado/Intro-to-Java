package hw16B;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//@author arlan
public class Sieve {
	int upper;
	public Sieve(int upperLimit) {
		upper = upperLimit;
	}
	public Set<Integer> getPrimes() {
		Set<Integer> primes = new TreeSet<>();
		for(int i = 2; i <= upper; i++) {
			boolean primeFlag = true;
			boolean upperRootFlag = false;
			int upperRoot = (int)Math.sqrt(upper);
			Iterator<Integer> iter = primes.iterator();
				while(iter.hasNext()&& !upperRootFlag) {
					int prime = iter.next();
						if(i % prime == 0)
							primeFlag = false;
						if(prime >= upperRoot)
							upperRootFlag = true;
				}
			if(primeFlag) {
				primes.add(i);
			}
		}
		return primes;
	}
	public void setUpperLimit(int newLimit) {
		upper = newLimit;
	}
	public int primeCount() {
		Set<Integer> primes = getPrimes();
		return primes.size();
	}
}
