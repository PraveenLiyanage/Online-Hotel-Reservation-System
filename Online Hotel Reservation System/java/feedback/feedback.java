package feedback;

public class feedback {
	
 

	private int feedback_id;
	private String feedback;
	private String email;
	private String name;
	
	public feedback(int feedback_id, String feedback, String email, String name) {
	 
		this.feedback_id = feedback_id;
		this.feedback = feedback;
		this.email = email;
		this.name = name;
	}

	public int getFeedback_id() {
		return feedback_id;
	}

	

	public String getFeedback() {
		return feedback;
	}

	

	public String getEmail() {
		return email;
	}

	

	public String getName() {
		return name;
	}

	

	
}
