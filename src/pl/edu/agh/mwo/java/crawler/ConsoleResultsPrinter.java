package pl.edu.agh.mwo.java.crawler;

public class ConsoleResultsPrinter
{
	public void print(CrawlingResult crawlingResult)
	{
		System.out.println("===================================================================");
		System.out.println("SOURCE: "+crawlingResult.getUrl());
		System.out.println("TOTAL RESULTS: "+crawlingResult.getSentences().size());
		if (crawlingResult.getSentences().size() == 0)
			return;
		int counter = 1;
		for (String sentence : crawlingResult.getSentences())
		{
			System.out.println(counter++ +": " +sentence);
		}
	}
}
