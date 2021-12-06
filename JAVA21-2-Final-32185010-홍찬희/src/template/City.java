package template;

// Java21-2 Final (2021/12/06 Kyoung Shin Park)
public class City extends CityComponent {
	private String city;
	private String country;
	
	public City(String city, String country) {
		this.city = city;
		this.country = country;
	}


	@Override // City의 정보를 출력한다.
	public void print() {
		System.out.println("City [city=" + city + ", country=" + country + "]");
	}
}
