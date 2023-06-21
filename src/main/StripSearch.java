package main;
import java.io.IOException;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class StripSearch {
	
	
    //get info from web----------------------------------------------------------------------------------------------------------------------------------------
	public static String GetPAge (String a) throws  IOException {
		
	Connection conn = Jsoup.connect(a);	
	Document doc;
	
	doc = conn.get();

	String Result = doc.body().text();
	return Result;
	}
	
	
	//cut off trash-----------------------------------------------------------------------------------------------------------------------------------------
	public static String Strip (String FirstDraft) {
		
		String Stripped = FirstDraft.substring(FirstDraft.indexOf("Once"), FirstDraft.indexOf("nevermore") + 9);
		 
		String StrippedNaked = Stripped.replaceAll("[^\\w ]", ""); // hitting spacebar after ^\\w keeps the spaces
	
		return StrippedNaked;
	}
	
	
	
	
}
