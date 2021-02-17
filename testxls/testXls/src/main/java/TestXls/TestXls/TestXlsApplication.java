package TestXls.TestXls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TestXlsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		SpringApplication.run(TestXlsApplication.class, args);
		System.out.println("Hello qwerty");
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TestXlsApplication.class);
	}
}
