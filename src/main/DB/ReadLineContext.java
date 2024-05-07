import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineContext<T> {
    Parser<T> parser;

    public ReadLineContext(Parser<T> parser) {
        this.parser = parser;
    }

    public List<T> readByLine(String filename) throws IOException {
        List<T> result = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String str;

        while ((str = reader.readLine()) != null) {
            try {
                result.add(parser.parse(str));
            }
            catch(Exception e) {
                System.out.printf("파싱 중 문제로 이 줄은 넘어갑니다. 파일내용 :%s\n",  str.substring(0,20));
            }
        }
        reader.close();
        return result;
    }



}
