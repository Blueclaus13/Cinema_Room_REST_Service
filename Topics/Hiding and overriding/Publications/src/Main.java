class Publication {

    private String title;

    public Publication(String title) {
        this.title = title;
    }

    public String getDetails() {
        return "title=\"" + title + "\"";
    }

}

class Newspaper extends Publication {

    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }

    @Override
    public String getDetails() {

        String publication = super.getDetails();
        return publication + ", " +"source=\"" + this.source + "\"";
    }

    // write your code here

}

class Article extends Publication {

    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public String getDetails() {
        String publication = super.getDetails();
        return publication + ", " +"author=\"" + this.author + "\"";
    }
}

class Announcement extends Publication {

    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    @Override
    public String getDetails() {
        String publication = super.getDetails();
        return publication + ", " +"daysToExpire=" + this.daysToExpire;
    }
}