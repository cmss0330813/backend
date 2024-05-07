import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ParserFactory {
    @Bean
    public ReadLineContext<Book> bookReadLineContext() {
        return new ReadLineContext<Book>(new BookParser());
    }
}
