package riccardogulin.u5d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import riccardogulin.u5d1.entities.FullstackStudent;

@SpringBootApplication
public class U5d1Application {

	public static void main(String[] args) {

		SpringApplication.run(U5d1Application.class, args);

		// --------------------------------------- METODO TRADIZIONALE -------------------------------------------------
		/*FrontendStudent aldo = new FrontendStudent("Aldo", "Baglio");
		Interviewer interviewer = new Interviewer(aldo);

		interviewer.askQuestion(); */

		// ------------------------------------------ METODO CON I BEANS ------------------------------------------------
		// Per poter leggere i Bean dallo "scatolone", come prima cosa devo ottenere un riferimento all'Application Context
		// Poi tramite tale riferimento posso leggere i vari Bean uno per uno tramite metodo getBean

		// 1. Ottengo un riferimento all'Application Context
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U5d1Application.class);

		// 2. Leggo i Bean dal context tramite .getBean(), principalmente con 2 modalità di lettura, o tramite nome del Bean
		// oppure tramite tipo (classe) del Bean
		/*FrontendStudent fes = context.getBean(FrontendStudent.class); // Tramite tipo
		System.out.println(fes);

		BackendStudent bes = context.getBean("getBEStudent", BackendStudent.class); // Tramite nome. Il nome del Bean è il nome
		// del metodo nella classe di configurazione se non specificato diversamente
		System.out.println(bes);

		FullstackStudent fss = context.getBean("aldo", FullstackStudent.class);
		System.out.println(fss);

		Interviewer interviewer = context.getBean(Interviewer.class);
		interviewer.askQuestion();*/

		// ------------------------------------------------------------------ SCOPES ---------------------------------------------------------
		// Se il Bean ha SCOPE SINGLETON, significa che l'oggetto è uno unico per tutta l'applicazione
		// Di default tutti i Bean sono SINGLETON
		// Quindi se cambio ad es il valore di un attributo di un Bean Singleton, ogni volta che leggerò tramite getBean otterrò quel valore
		// già cambiato

		FullstackStudent fss = context.getBean("aldo", FullstackStudent.class);
		System.out.println(fss);
		fss.setName("Giorgio");
		System.out.println(fss);
		FullstackStudent fss2 = context.getBean("aldo", FullstackStudent.class);
		System.out.println(fss2.getName());


		// 3. Chiudo il riferimento al Context
		context.close();
	}

}
