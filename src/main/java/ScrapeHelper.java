import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.PrintWriter;
import java.util.Set;
import java.util.TreeSet;

public class ScrapeHelper {

    public static final String USER_AGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_4) AppleWebKit/537.36 " +
            "(KHTML, like Gecko) Chrome/50.0.2661.94 Safari/537.36";

    //Bizarre
    void populateCreepy() throws Exception{

        String seed = "http://listverse.com/bizarre/creepy/page/";
        Set<String> urls = new TreeSet<>();
        final PrintWriter out = new PrintWriter("creepy.csv");

        for(int i = 23; i > 0 ; i--) {
            if(i > 1) {
                seed += ""+i+"/";
            } else {
                seed = "http://listverse.com/bizarre/creepy/";
            }
            System.out.printf("seeds = "+seed);
            final Document page = Jsoup.connect(seed).userAgent(USER_AGENT).get();

            for (Element searchResult : page.select("section.new article a")) {

                final String url = searchResult.attr("href");
                if(!(url.contains("bizarre"))) {
                    if(!url.contains("lvauthor")) {
                        urls.add(url);
                    }
                }
            }
            seed = "http://listverse.com/bizarre/creepy/page/";
        }

        System.out.printf("size = "+urls.size());

        for(String st : urls) {
            out.write(st + "\n");
        }
        out.close();
    }

    void populateMysteries() throws Exception{

        String seed = "http://listverse.com/bizarre/mysteries/page/";
        Set<String> urls = new TreeSet<>();
        final PrintWriter out = new PrintWriter("mysteries.csv");

        for(int i = 32; i > 0 ; i--) {
            if(i > 1) {
                seed += ""+i+"/";
            } else {
                seed = "http://listverse.com/bizarre/mysteries/";
            }
            System.out.printf("seeds = "+seed);
            final Document page = Jsoup.connect(seed).userAgent(USER_AGENT).get();

            for (Element searchResult : page.select("section.new article a")) {

                final String url = searchResult.attr("href");
                if(!(url.contains("bizarre"))) {
                    if(!url.contains("lvauthor")) {
                        urls.add(url);
                    }
                }
            }
            seed = "http://listverse.com/bizarre/mysteries/page/";
        }

        System.out.printf("size = "+urls.size());

        for(String st : urls) {
            out.write(st + "\n");
        }
        out.close();
    }

    void populateWeird() throws Exception{

        String seed = "http://listverse.com/bizarre/weird-stuff/page/";
        Set<String> urls = new TreeSet<>();
        final PrintWriter out = new PrintWriter("weird.csv");

        for(int i = 64; i > 0 ; i--) {
            if(i > 1) {
                seed += ""+i+"/";
            } else {
                seed = "http://listverse.com/bizarre/weird-stuff/";
            }
            System.out.printf("seeds = "+seed);
            final Document page = Jsoup.connect(seed).userAgent(USER_AGENT).get();

            for (Element searchResult : page.select("section.new article a")) {

                final String url = searchResult.attr("href");
                if(!(url.contains("bizarre"))) {
                    if(!url.contains("lvauthor")) {
                        urls.add(url);
                    }
                }
            }
            seed = "http://listverse.com/bizarre/weird-stuff/page/";
        }

        System.out.printf("size = "+urls.size());

        for(String st : urls) {
            out.write(st + "\n");
        }
        out.close();
    }

    //Entertainment
    void populateGaming() throws Exception{

        String seed = "http://listverse.com/entertainment/gaming/page/";
        Set<String> urls = new TreeSet<>();
        final PrintWriter out = new PrintWriter("gaming.csv");

        for(int i = 6; i > 0 ; i--) {
            if(i > 1) {
                seed += ""+i+"/";
            } else {
                seed = "http://listverse.com/entertainment/gaming/";
            }
            System.out.printf("seeds = "+seed);
            final Document page = Jsoup.connect(seed).userAgent(USER_AGENT).get();

            for (Element searchResult : page.select("section.new article a")) {

                final String url = searchResult.attr("href");
                if(!(url.contains("bizarre"))) {
                    if(!url.contains("lvauthor")) {
                        urls.add(url);
                    }
                }
            }
            seed = "http://listverse.com/entertainment/gaming/page/";
        }

        System.out.printf("size = "+urls.size());

        for(String st : urls) {
            out.write(st + "\n");
        }
        out.close();
    }

    void populateMovieTv() throws Exception{

        String seed = "http://listverse.com/entertainment/movies-and-tv/page/";
        Set<String> urls = new TreeSet<>();
        final PrintWriter out = new PrintWriter("movietv.csv");

        for(int i = 53; i > 0 ; i--) {
            if(i > 1) {
                seed += ""+i+"/";
            } else {
                seed = "http://listverse.com/entertainment/movies-and-tv/";
            }
            System.out.printf("seeds = "+seed);
            final Document page = Jsoup.connect(seed).userAgent(USER_AGENT).get();

            for (Element searchResult : page.select("section.new article a")) {

                final String url = searchResult.attr("href");
                if(!(url.contains("bizarre"))) {
                    if(!url.contains("lvauthor")) {
                        urls.add(url);
                    }
                }
            }
            seed = "http://listverse.com/entertainment/movies-and-tv/page/";
        }

        System.out.printf("size = "+urls.size());

        for(String st : urls) {
            out.write(st + "\n");
        }
        out.close();
    }

    void populateMusic() throws Exception{

        String seed = "http://listverse.com/entertainment/music-entertainment/page/";
        Set<String> urls = new TreeSet<>();
        final PrintWriter out = new PrintWriter("music.csv");

        for(int i = 16; i > 0 ; i--) {
            if(i > 1) {
                seed += ""+i+"/";
            } else {
                seed = "http://listverse.com/entertainment/music-entertainment/";
            }
            System.out.printf("seeds = "+seed);
            final Document page = Jsoup.connect(seed).userAgent(USER_AGENT).get();

            for (Element searchResult : page.select("section.new article a")) {

                final String url = searchResult.attr("href");
                if(!(url.contains("bizarre"))) {
                    if(!url.contains("lvauthor")) {
                        urls.add(url);
                    }
                }
            }
            seed = "http://listverse.com/entertainment/music-entertainment/page/";
        }

        System.out.printf("size = "+urls.size());

        for(String st : urls) {
            out.write(st + "\n");
        }
        out.close();
    }

    void populatePop() throws Exception{

        String seed = "http://listverse.com/entertainment/pop-culture/page/";
        Set<String> urls = new TreeSet<>();
        final PrintWriter out = new PrintWriter("popculture.csv");

        for(int i = 25; i > 0 ; i--) {
            if(i > 1) {
                seed += ""+i+"/";
            } else {
                seed = "http://listverse.com/entertainment/pop-culture/";
            }
            System.out.printf("seeds = "+seed);
            final Document page = Jsoup.connect(seed).userAgent(USER_AGENT).get();

            for (Element searchResult : page.select("section.new article a")) {

                final String url = searchResult.attr("href");
                if(!(url.contains("bizarre"))) {
                    if(!url.contains("lvauthor")) {
                        urls.add(url);
                    }
                }
            }
            seed = "http://listverse.com/entertainment/pop-culture/page/";
        }

        System.out.printf("size = "+urls.size());

        for(String st : urls) {
            out.write(st + "\n");
        }
        out.close();
    }

    void populateArts() throws Exception{

        String seed = "http://listverse.com/entertainment/the-arts/page/";
        Set<String> urls = new TreeSet<>();
        final PrintWriter out = new PrintWriter("arts.csv");

        for(int i = 15; i > 0 ; i--) {
            if(i > 1) {
                seed += ""+i+"/";
            } else {
                seed = "http://listverse.com/entertainment/the-arts/";
            }
            System.out.printf("seeds = "+seed);
            final Document page = Jsoup.connect(seed).userAgent(USER_AGENT).get();

            for (Element searchResult : page.select("section.new article a")) {

                final String url = searchResult.attr("href");
                if(!(url.contains("bizarre"))) {
                    if(!url.contains("lvauthor")) {
                        urls.add(url);
                    }
                }
            }
            seed = "http://listverse.com/entertainment/the-arts/page/";
        }

        System.out.printf("size = "+urls.size());

        for(String st : urls) {
            out.write(st + "\n");
        }
        out.close();
    }

    //General Knowledge
    void populateBooks() throws Exception{

        String seed = "http://listverse.com/fact-fiction/books/page/";
        Set<String> urls = new TreeSet<>();
        final PrintWriter out = new PrintWriter("books.csv");

        for(int i = 18; i > 0 ; i--) {
            if(i > 1) {
                seed += ""+i+"/";
            } else {
                seed = "http://listverse.com/fact-fiction/books/";
            }
            System.out.printf("seeds = "+seed);
            final Document page = Jsoup.connect(seed).userAgent(USER_AGENT).get();

            for (Element searchResult : page.select("section.new article a")) {

                final String url = searchResult.attr("href");
                if(!(url.contains("bizarre"))) {
                    if(!url.contains("lvauthor")) {
                        urls.add(url);
                    }
                }
            }
            seed = "http://listverse.com/fact-fiction/books/page/";
        }

        System.out.printf("size = "+urls.size());

        for(String st : urls) {
            out.write(st + "\n");
        }
        out.close();
    }

    void populateFacts() throws Exception{

        String seed = "http://listverse.com/fact-fiction/facts/page/";
        Set<String> urls = new TreeSet<>();
        final PrintWriter out = new PrintWriter("facts.csv");

        for(int i = 36; i > 0 ; i--) {
            if(i > 1) {
                seed += ""+i+"/";
            } else {
                seed = "http://listverse.com/fact-fiction/facts/";
            }
            System.out.printf("seeds = "+seed);
            final Document page = Jsoup.connect(seed).userAgent(USER_AGENT).get();

            for (Element searchResult : page.select("section.new article a")) {

                final String url = searchResult.attr("href");
                if(!(url.contains("bizarre"))) {
                    if(!url.contains("lvauthor")) {
                        urls.add(url);
                    }
                }
            }
            seed = "http://listverse.com/fact-fiction/facts/page/";
        }

        System.out.printf("size = "+urls.size());

        for(String st : urls) {
            out.write(st + "\n");
        }
        out.close();
    }

    void populateHistory() throws Exception{

        String seed = "http://listverse.com/fact-fiction/history-fact-fiction/page/";
        Set<String> urls = new TreeSet<>();
        final PrintWriter out = new PrintWriter("history.csv");

        for(int i = 99; i > 0 ; i--) {
            if(i > 1) {
                seed += ""+i+"/";
            } else {
                seed = "http://listverse.com/fact-fiction/history-fact-fiction/";
            }
            System.out.printf("seeds = "+seed);
            final Document page = Jsoup.connect(seed).userAgent(USER_AGENT).get();

            for (Element searchResult : page.select("section.new article a")) {

                final String url = searchResult.attr("href");
                if(!(url.contains("bizarre"))) {
                    if(!url.contains("lvauthor")) {
                        urls.add(url);
                    }
                }
            }
            seed = "http://listverse.com/fact-fiction/history-fact-fiction/page/";
        }

        System.out.printf("size = "+urls.size());

        for(String st : urls) {
            out.write(st + "\n");
        }
        out.close();
    }

    void populateMiscellaneous() throws Exception{

        String seed = "http://listverse.com/fact-fiction/miscellaneous-fact-fiction/page/";
        Set<String> urls = new TreeSet<>();
        final PrintWriter out = new PrintWriter("miscellaneous.csv");

        for(int i = 15; i > 0 ; i--) {
            if(i > 1) {
                seed += ""+i+"/";
            } else {
                seed = "http://listverse.com/fact-fiction/miscellaneous-fact-fiction/";
            }
            System.out.printf("seeds = "+seed);
            final Document page = Jsoup.connect(seed).userAgent(USER_AGENT).get();

            for (Element searchResult : page.select("section.new article a")) {

                final String url = searchResult.attr("href");
                if(!(url.contains("bizarre"))) {
                    if(!url.contains("lvauthor")) {
                        urls.add(url);
                    }
                }
            }
            seed = "http://listverse.com/fact-fiction/miscellaneous-fact-fiction/page/";
        }

        System.out.printf("size = "+urls.size());

        for(String st : urls) {
            out.write(st + "\n");
        }
        out.close();
    }

    void populateMisconceptions() throws Exception{

        String seed = "http://listverse.com/fact-fiction/misconceptions/page/";
        Set<String> urls = new TreeSet<>();
        final PrintWriter out = new PrintWriter("misconceptions.csv");

        for(int i = 13; i > 0 ; i--) {
            if(i > 1) {
                seed += ""+i+"/";
            } else {
                seed = "http://listverse.com/fact-fiction/misconceptions/";
            }
            System.out.printf("seeds = "+seed);
            final Document page = Jsoup.connect(seed).userAgent(USER_AGENT).get();

            for (Element searchResult : page.select("section.new article a")) {

                final String url = searchResult.attr("href");
                if(!(url.contains("bizarre"))) {
                    if(!url.contains("lvauthor")) {
                        urls.add(url);
                    }
                }
            }
            seed = "http://listverse.com/fact-fiction/misconceptions/page/";
        }

        System.out.printf("size = "+urls.size());

        for(String st : urls) {
            out.write(st + "\n");
        }
        out.close();
    }

    //Lifestyle
    void populateFood() {

    }

    void populateHealth() {

    }

    void populateSport() {

    }

    void populateTravel() {

    }

    //Science
    void populateAnimals() {

    }

    void populateHumans() {

    }

    void populateWorld() {

    }

    void populateSpace() {

    }

    void populateTechnology() {

    }

    //Society
    void populateCrime() {

    }

    void populatePolitics() {

    }

    void populateReligion() {

    }
}
