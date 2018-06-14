public class ScrapeRunner {

    public static void main(String[] args) throws Exception{

        ScrapeHelper helper = new ScrapeHelper();
        //helper.populateCrime();
        helper.populatePolitics();
        helper.populateReligion();
    }
}
