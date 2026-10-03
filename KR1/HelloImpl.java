import java.io.PrintStream;

public class HelloImpl extends Hello {
    @Override
    public void printHelloWorld(PrintStream out) {
        out.print("Hello, World!\n");
    }
}
