package riccardogulin.u5d1.entities;

import lombok.ToString;

@ToString
public class BackendStudent extends Student {
	public BackendStudent(String name, String surname) {
		super(name, surname);
	}

	@Override
	public void answerQuestion() {
		System.out.println("Ciao sono lo studente backend la risposta è blablabla");
	}
}
