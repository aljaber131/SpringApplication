package noXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "noXML")
@PropertySource("application.properties")
public class AppConfig {
 @Bean
    public Mid getMidexamdate(){
     return new Mid();
 }
 @Bean
    public Final getFinalexamdate(){
     return new Final();
 }
}
