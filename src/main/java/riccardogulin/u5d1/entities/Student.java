package riccardogulin.u5d1.entities;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Student {
	/*
	@Setter(AccessLevel.NONE) // <-- Posso escludere il campo id dall'elenco dei Setter
	protected long id;
	*/
	@Getter(AccessLevel.NONE) // <-- Non farmi il Getter per il name che me lo faccio io customizzato
	protected String name;
	protected String surname;

	public String getName() {
		return name;
	}

	public abstract void answerQuestion();

}
