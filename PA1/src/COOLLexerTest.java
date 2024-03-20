import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class COOLLexerTest {
    public static void main(String[] args) {
        // Sample COOL language inputs
        String[] inputs = {
                "while (condition) loop endloop",
                "if condition then else fi",
                "loop"
        };

        for (String input : inputs) {
            System.out.println("Tokenizing input: " + input);
            tokenize(input);
            System.out.println();
        }
    }

    private static void tokenize(String input) {
        // Create a CharStream from the input string
        COOLLexer lexer = new COOLLexer(CharStreams.fromString(input));

        // Create a lexer token stream
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Print out token types and texts
        tokens.fill();
        tokens.getTokens().forEach(token -> {
            System.out.printf("<%s> '%s'%n", COOLLexer.VOCABULARY.getSymbolicName(token.getType()), token.getText());
        });
    }
}
