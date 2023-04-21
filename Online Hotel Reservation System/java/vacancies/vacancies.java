package vacancies;

public class vacancies {
	

	private int vacancies_id;
	private String vacancies_type;
	private String price;
	private String available;
	private String location;
	
	public vacancies(int vacancies_id, String vacancies_type, String price, String available, String location) {
		
		this.vacancies_id = vacancies_id;
		this.vacancies_type = vacancies_type;
		this.price = price;
		this.available = available;
		this.location = location;
	}

	public int getVacancies_id() {
		return vacancies_id;
	}

 

	public String getVacancies_type() {
		return vacancies_type;
	}

	 

	public String getPrice() {
		return price;
	}

 

	public String getAvailable() {
		return available;
	}

	 

	public String getLocation() {
		return location;
	}

	 
	
	
	
	
}
