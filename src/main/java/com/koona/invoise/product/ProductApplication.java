package com.koona.invoise.product;

import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EntityScan("com.koona.invoise.core.entity.product")
public class ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}

	@Bean
	public Hibernate5Module dataTypeHibernateModule() {
		Hibernate5Module module = new Hibernate5Module();
		module.disable(Hibernate5Module.Feature.USE_TRANSIENT_ANNOTATION);

		return module;
	}
}
