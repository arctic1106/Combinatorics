public class App {
	public static void main(String[] args) {
		System.out.println("C(15,5)  = " + Combinatorics.combinaciones(15, 5));
		System.out.println("CR(5,15) = " + Combinatorics.combinacionesConRepeticion(5, 15));
		System.out.println("P(15)    = " + Combinatorics.permutaciones(15));
		System.out.println("V(15,5)  = " + Combinatorics.variaciones(15, 5));
		System.out.println("VR(5,10) = " + Combinatorics.variacionesConRepeticion(5, 10));
	}
}