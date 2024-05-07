public class BookParser implements Parser<Book>{
    @Override
    public Book parse(String str) {
        String[] splitted = str.split("\",\"");
        Book book = new Book();








        return book;
    }
    
}
