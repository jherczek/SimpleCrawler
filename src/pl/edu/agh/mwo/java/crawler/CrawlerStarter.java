package pl.edu.agh.mwo.java.crawler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CrawlerStarter {

	public static void main(String[] args) throws IOException {

		Crawler c = new Crawler("http://www.wp.pl", new TextExtractor(), new ConsoleResultsPrinter());


		c.addSentenceFinder(new SentenceByWordFinder("ale") {
			@Override
			public List<String> findSentences(List<String> sentences) {
				List<String> foundSentences = new ArrayList<>();
				for (String sentence : sentences) {

					if (sentence.split("ale").length >= 3) {
						foundSentences.add(sentence);
					}
				}
				return foundSentences;
			}
		});


		c.addSentenceFinder(sentences -> {
			List<String> foundSentences = new ArrayList<>();
			for (String sentence : sentences) {

				if (sentence.contains("A") && sentence.contains("B")) {
					foundSentences.add(sentence);
				}
			}
			return foundSentences;
		});

		c.run();

	}
}

