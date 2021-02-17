package readXLSFile.readXLSFile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ReadXlsFileApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {


		SpringApplication.run(ReadXlsFileApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ReadXlsFileApplication.class);
	}
}

