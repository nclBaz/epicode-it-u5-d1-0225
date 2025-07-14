package riccardogulin.u5d1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import riccardogulin.u5d1.entities.*;

@Configuration // Annotazione OBBLIGATORIA se vogliamo che questa classe venga presa in considerazione all'avvio dell'applicazione
public class ConfigClass {
	// In pratica questa classe sarà un elenco di tutti gli oggetti di cui avrò bisogno all'avvio dell'applicazione (BEANS). Quindi in questa
	// classe scriverò un elenco di "istruzioni" su come crearli. Ogni Bean è un oggetto gestito non da noi ma da Spring.
	// Per poter creare un singolo Bean avrò bisogno di un metodo in questa classe, questi metodi dovranno essere annotati con @Bean

	@Bean // Annotazione OBBLIGATORIA se voglio che il seguente metodo crei un Bean
	// Questi elementi faranno parte dell'APPLICATION CONTEXT ("Lo scatolone"/"La cassetta degli attrezzi") fin dall'avvio dell'applicazione
	// (se non ci sono errori). Nella pratica quando Spring si avvia, fa una scansione di tutte le classi di configurazione come questa e, per
	// ogni metodo @Bean, cercherà di aggiungere tale Bean allo scatolone
	// All'interno di ognuno di questi metodi inseriremo le "istruzioni" su come debbano essere creati/configurati questi elementi.
	// Quindi se tutto è stato fatto in maniera corretta, all'avvio mi ritroverò uno scatolone già contenente una serie di oggetti pronti all'uso
	// Spring oltre a ciò sarà in grado anche di creare degli oggetti a RUNTIME, cioè durante l'esecuzione dell'applicazione, ma questo lo
	// approfondiremo in seguito
	public int getAge() {
		return 30;
	}

	@Bean
	public String getName() {
		return "Ajeje";
	}

	@Bean(name = "aldo") // Opzionalmente posso specificare il nome personalizzato per il Bean. Se non lo faccio
	// verrà utilizzato il nome del metodo come riferimento (getFSStudent)
	public FullstackStudent getFSStudent() {
		return new FullstackStudent("Aldo", "Baglio");
	}

	@Bean
	//@Primary
	public BackendStudent getBEStudent() {
		return new BackendStudent("Giovanni", "Storti");
	}

	@Bean
	@Primary // Annotazione serve per risolvere le ambiguità. Ogni qualvolta ci sia un dubbio
	// su quale Student scegliere, verrà scelto questo (una sorta di DEFAULT)
	public FrontendStudent getFEStudent(String name) {
		return new FrontendStudent(name, "Poretti");
	}

	@Bean
	public Interviewer getInterviewer(Student fullstackStudent) {
		return new Interviewer(fullstackStudent);
	}
}
