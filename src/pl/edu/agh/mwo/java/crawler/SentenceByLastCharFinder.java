package pl.edu.agh.mwo.java.crawler;

import java.util.ArrayList;
import java.util.List;

public class SentenceByLastCharFinder implements SentenceFinder {
	
	protected String lastChar;
	
	public SentenceByLastCharFinder(String lastChar) {
		super();
		this.lastChar = lastChar;
	}

	public List<String> findSentences(List<String> sentences) 
	{
		ArrayList<String> foundSentences = new ArrayList<>();
		for (String sentence : sentences)
		{
		    if (sentence.endsWith(this.lastChar))
				foundSentences.add(sentence);
		}
		return foundSentences;
	}

}
