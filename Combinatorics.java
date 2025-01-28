import java.math.BigInteger;

public class Combinatorics {

	public static BigInteger combinaciones(int n, int k) {
		return factorial(n).divide(factorial(k).multiply(factorial(n - k)));
	}

	public static BigInteger combinacionesConRepeticion(int n, int k) {
		return combinaciones(n + k - 1, k);
	}

	public static BigInteger permutaciones(int n) {
		return factorial(n);
	}

	public static BigInteger variaciones(int m, int n) {
		return factorial(m).divide(factorial(m - n));
	}

	public static BigInteger variacionesConRepeticion(int m, int n) {
		return BigInteger.valueOf(m).pow(n);
	}

	private static BigInteger factorial(int n) {
		var factorial = BigInteger.ONE;
		for (var i = 2; i <= n; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		return factorial;
	}
}