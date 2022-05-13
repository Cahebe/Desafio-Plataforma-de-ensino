package entities;

public class Task extends Lesson {

	private String description;
	private int questionCount;

	// Constructors
	public Task() {

	}

	public Task(String title, String description, int questionCount) {
		super(title);
		this.description = description;
		this.questionCount = questionCount;
	}

	// Getters and Setters
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuestionCount() {
		return questionCount;
	}

	public void setQuestionCount(int questionCount) {
		this.questionCount = questionCount;
	}

	// Methods
	@Override
	public int duration() {
		return questionCount * 300;
	}

}
