package riccardogulin.u5d1.entities;

import lombok.ToString;

@ToString
public class FullstackStudent extends Student {
	public FullstackStudent(String name, String surname) {
		super(name, surname);
	}

	@Override
	public void answerQuestion() {

		System.out.println("Ciao sono lo studente fullstack la risposta è blablabla");
	}

}
