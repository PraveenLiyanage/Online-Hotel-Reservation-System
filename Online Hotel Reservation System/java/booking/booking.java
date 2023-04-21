package booking;

public class booking {
	
	
	private int id;
	private String name;
	private String nic;
	private String booking_type;
	private String booking_date;
	private String vacant_id_number;
	
	
	public booking(int id, String name, String nic, String booking_type, String booking_date, String vacant_id_number) {
		
		this.id = id;
		this.name = name;
		this.nic = nic;
		this.booking_type = booking_type;
		this.booking_date = booking_date;
		this.vacant_id_number = vacant_id_number;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getNic() {
		return nic;
	}


	public String getBooking_type() {
		return booking_type;
	}



	public String getBooking_date() {
		return booking_date;
	}


	public String getVacant_id_number() {
		return vacant_id_number;
	}

	

}
