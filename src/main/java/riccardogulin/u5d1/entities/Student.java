package riccardogulin.u5d1.entities;

public abstract class Student {
	protected String name;
	protected String surname;

	public Student(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public abstract void answerQuestion();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
}
