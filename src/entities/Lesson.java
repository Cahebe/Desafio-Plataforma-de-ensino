package entities;

public abstract class Lesson {
	private String title;

	// Constructors
	public Lesson() {

	}

	public Lesson(String title) {
		this.title = title;
	}

	//Getters and Setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	//Methods
	public abstract int duration();

}
