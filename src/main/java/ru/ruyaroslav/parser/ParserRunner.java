package ru.ruyaroslav.parser;

import ru.ruyaroslav.parser.loader.Loader;
import ru.ruyaroslav.parser.parser.HtmlParser;

import java.io.IOException;

public class ParserRunner {
public static final String HABR_DOMAIN = "https://habr.com/";
    private static final String HABR_URL = HABR_DOMAIN +"/ru/all/";

    public static   void main(String[] args) {
        Loader loader = new Loader();
        HtmlParser parser = new HtmlParser();

        String habrResponse = loader.load(HABR_URL);
        parser.parse(habrResponse);
    }
}
