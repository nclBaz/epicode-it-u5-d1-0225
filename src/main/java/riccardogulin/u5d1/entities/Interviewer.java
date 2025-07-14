package riccardogulin.u5d1.entities;

public class Interviewer {
	private Student student;

	public Interviewer(Student student) {
		this.student = student;
	}

	public void askQuestion() {
		System.out.println("Ciao " + this.student.getName() + ", per favore rispondimi alla seguente domanda...blablabla");
		this.student.answerQuestion();

	}
}
