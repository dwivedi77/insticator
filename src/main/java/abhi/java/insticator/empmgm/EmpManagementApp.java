package abhi.java.insticator.empmgm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ResourceLoader;

/**
 * Created by Abhishek on 9/16/2016.
 */
@SpringBootApplication
@ImportResource(value = "application-context.xml")
public class EmpManagementApp {

    public static void main(String[] args) {
        SpringApplication.run(EmpManagementApp.class);

    }
}
