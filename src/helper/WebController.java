
package helper;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class WebController {
    //This array list to store the list of gettingLinkElement fetched form google.
     private ArrayList<String> ListOfUrls;
     // Define character set.
    String TypeChar="UTF-8";
    // Defining the search engine.
    String searchEngine="http://www.google.com/search?q=";
    // Web browers version.
    String broswerAgent="Chorme/60.0.3";
    //This method is used to get the list of gettingLinkElement for the google for a particular keyword.
    public  ArrayList<String> GetsearchEngineLinks(String keyword)throws UnsupportedEncodingException, IOException{
         ListOfUrls=new ArrayList<String>();// This list holds the list of URLs form the google.
 
    
    //Storing gettingLinkElement as Elements this a class of Jsoup library.
     Elements gettingLinkElement = Jsoup.connect(searchEngine + URLEncoder.encode(keyword, TypeChar)).userAgent(broswerAgent).get().select(".g>.r>a");

for (Element getLink : gettingLinkElement) {
   
    String link = getLink.absUrl("href"); // searchEngine returns URLs in format "http://www.google.com/link?q=<link>&sa=U&ei=<someKey>".
    link = URLDecoder.decode(link.substring(link.indexOf('=') + 1, link.indexOf('&')), "UTF-8");

    if (!link.startsWith("http")) {
        continue; // Ads/news/etc.
    }
   // URLData linkdata=new URLData(link, title);
    ListOfUrls.add(link);
    
    }
     return ListOfUrls;
    } 
    
      public boolean numberOflinks(int n){
        
        return n%2==0;
    
    }
    
     public int AreaCanBe(int n1){
         return n1*n1;
    
    }
     
      public boolean CheckingDiv(int num, int div){
        
        return (num%div)==0;
    
    }
    
    
}
