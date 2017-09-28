package desafio.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class ApplicationStartup
{
    public static void main(String[] args)
    {
        SpringApplication.run(ApplicationStartup.class, args);
    }
}
