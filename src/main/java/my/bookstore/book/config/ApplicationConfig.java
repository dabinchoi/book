package my.bookstore.book.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = { "my.bookstore.book.dao","my.bookstore.book.service" })
@Import({DataSourceConfig.class})
public class ApplicationConfig {
}