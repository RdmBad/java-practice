package day53_inheritance06;

public class TestHiding {
	public static void main(String[] args) {
		City city = new City(345, "London");
		Capital cap = new Capital(433, "Paris", 53234234L);

		System.out.println(city.count);
		System.out.println(cap.count);

		System.out.println(city.toString());
		System.out.println(cap.toString());

		cap.displayCount();

		// call static methods
		city.buildARoad();
		cap.buildARoad();

		City.buildARoad();
		Capital.buildARoad();

		City city2 = new City(33344, "Faifax");
		Capital cap2 = new Capital(6533, "Richmond", 23483284L);
		
		city2.letsBuildARoad();
		cap2.letsBuildARoad();
	
	}
}
