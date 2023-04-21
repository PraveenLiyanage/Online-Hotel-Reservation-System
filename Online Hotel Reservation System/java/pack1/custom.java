package pack1;

public class custom {
	
	
	private int id;
	private String name;
	private String password;
	private String phone;
	private String email;
	
	public custom(int id, String name, String password, String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}
	
	
}
