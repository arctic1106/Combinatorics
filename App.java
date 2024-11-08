public class App {
	public static void main(String[] args) {
		System.out.printf("C(15,5)  = %d%n", Combinatorics.combinaciones(15, 5));
		System.out.printf("CR(5,15) = %d%n", Combinatorics.combinacionesConRepeticion(5, 15));
		System.out.printf("P(15)    = %d%n", Combinatorics.permutaciones(15));
		System.out.printf("V(15,5)  = %d%n", Combinatorics.variaciones(15, 5));
		System.out.printf("VR(5,10) = %d%n", Combinatorics.variacionesConRepeticion(5, 10));	}
}