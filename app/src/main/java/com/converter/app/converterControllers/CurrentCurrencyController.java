package com.converter.app.converterControllers;

import android.os.StrictMode;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class CurrentCurrencyController {


    public static String GetCurrencyStatus(String url) throws IOException {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        Document doc = Jsoup.connect(url).get();
        Elements link = doc.select("div.dDoNo");
        return link.text().substring(0, 6);

    }
}
