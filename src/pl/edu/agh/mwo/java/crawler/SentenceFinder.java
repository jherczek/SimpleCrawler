package pl.edu.agh.mwo.java.crawler;

import java.util.List;

public interface SentenceFinder {
	List<String> findSentences(List<String> sentences);
}