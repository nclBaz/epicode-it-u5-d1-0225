package riccardogulin.u5d1.entities;

import lombok.ToString;

@ToString
public class FrontendStudent extends Student {
	public FrontendStudent(String name, String surname) {
		super(name, surname);
	}

	@Override
	public void answerQuestion() {

		System.out.println("Ciao sono lo studente frontend la risposta è blablabla");
	}
	
}
