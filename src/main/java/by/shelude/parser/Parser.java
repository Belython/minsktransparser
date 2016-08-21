package by.shelude.parser;

import by.shelude.constants.ParserParameters;
import by.shelude.constants.Transport;
import by.shelude.util.ConnectionUtil;
import org.jsoup.nodes.Document;

public class Parser {

    private Document mainDoc;

    private static Parser instance;

    private Parser() {
    }

    public Parser getInstance () {
        if (instance == null) {
            instance = new Parser();
        }
        return instance;
    }

    public void parse() {
        mainDoc = ConnectionUtil.get(ParserParameters.PAGE);
    }

    public static void main(String[] args) {
        System.out.println(Transport.valueOf("autobus".toUpperCase()));
    }

}
