import lombok.*;


@Getter
@Setter
public class Book {
    private int stuGrade;
    private String stuDept;
    private String bookName;
    private boolean isMajor;
    private String ganre;


    public Book(int grade, String dept, String name, boolean is, String ganre) {
        this.stuGrade = grade;
        this.stuDept = dept;
        this.bookName = name;
        this.isMajor = is;
        this.ganre = ganre;
    }

}
