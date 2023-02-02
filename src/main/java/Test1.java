import java.io.PrintWriter;
import java.io.StringWriter;

public class Test1 {
    public static void main(String[] args) {
        StringWriter out    = new StringWriter();
        PrintWriter writer = new PrintWriter(out);

        // use writer, e.g.:
        writer.print("ABC");
        writer.print("DEF");

        writer.flush(); // flush is really optional here, as Writer calls the empty StringWriter.flush

        String result = out.toString();
        System.out.println("result: " + result);
    }
}
