import java.io.*;

import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String inputFile = "test_cases/input.txt";
        FileWriter file = new FileWriter(inputFile + "-ast");
        BufferedWriter writer = new BufferedWriter(file);
        FileInputStream inputStream = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(inputStream);
        COOLLexer lexicalAnalyzer = new COOLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexicalAnalyzer);
        P_COOLParser parser = new P_COOLParser(tokens);
        parser.setBuildParseTree(true);
        parser.removeErrorListeners();
        parser.addErrorListener(new ErrorHandle());
        P_COOLParser.ProgramContext tree = parser.program();
        writer.write(tree.toStringTree());

        writer.close();
        System.out.println(tree.toStringTree(parser));
        Trees.inspect(tree, parser);
    }
}

