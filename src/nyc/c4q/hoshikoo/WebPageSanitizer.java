package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 4/1/15.
 */

import java.net.URL;
import java.util.Scanner;

public class WebPageSanitizer {
    public static String sanitize(String html){
        //loop through until it does not find any more script tag

        while(true){
            if(html.indexOf("<script>")<=-1 && html.indexOf("</script>")<=-1){
                break;
            }else{
                int beginning =html.indexOf("<script");
                int ending = html.indexOf("</script>");//add the length of </script> 9
                int actualEnding =ending + 9;

                // new string = string without <script>...</script>
                html = html.substring(0,beginning) + html.substring(actualEnding, (html.length()-1));
            }
        }
        return html; //return the html without <Script>...</script>
    }

//    public static final String
//            URL = "http://alexsamuel.net/AliceInWonderland.txt";

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //String input = scanner.nextLine();
        //URL url = HTTP.stringToURL(input);
        URL url = HTTP.stringToURL("http://www.google.com");
        String html = HTTP.get(url);
         System.out.println(sanitize(html));
    }

}
