package by.shelude.parser;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.util.HashMap;

public class URLHandler {

    private static URLHandler instance;

    private Connection connection;

    private URLHandler() {
    }

    public URLHandler getInstance () {
        if (instance == null) {
            instance = new URLHandler();
        }
        return instance;
    }

    public void useGET(String url) {
        Connection connection = Jsoup.connect(url);
    }

}
