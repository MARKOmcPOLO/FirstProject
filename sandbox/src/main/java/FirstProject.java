public class FirstProject {
	public static void main(String[] args) {

		Hexagon hex = new Hexagon(3);

		System.out.println("Площадь 6угольника со стороной " + hex.a + " = " + hex.square());
	}

//	public static double square(Hexagon hex){
//		return (3 * Math.sqrt(3 * (hex.a * hex.a))) / 2;
//	}
}
