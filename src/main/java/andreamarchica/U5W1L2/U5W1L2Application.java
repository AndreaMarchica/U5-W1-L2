

package andreamarchica.U5W1L2;


		import andreamarchica.U5W1L2.entities.*;
		import org.slf4j.Logger;
		import org.slf4j.LoggerFactory;
		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
		import org.springframework.context.annotation.AnnotationConfigApplicationContext;

		import java.time.LocalDate;
		import java.util.List;

@SpringBootApplication
public class U5W1L2Application {
	private static final Logger log = LoggerFactory.getLogger(U5W1L2Application.class);

	public U5W1L2Application() {
	}

	public static void main(String[] args) {
		SpringApplication.run(U5W1L2Application.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(new Class[]{U5W1L2Application.class});
		Menu m = (Menu)ctx.getBean("menu");
		m.printMenu();
		Order order1 = new Order(12, OrderStatus.SERVED, 1, LocalDate.now(), List<Item>[Pizza pizzaMargheritaBean, Drink lemonade]);
		ctx.close();
	}
}
