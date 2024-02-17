package pl.edu.agh.mwo.java.crawler;

import java.util.List;

class CrawlingResult{

    protected String url;
    protected List<String> sentences;

    public CrawlingResult(String url, List<String> results) {
        this.url = url;
        this.sentences = results;
    }
    public String getUrl() {
        return url;
    }

    public List<String> getSentences() {
        return sentences;
    }
}