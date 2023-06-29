package lab1;

import java.util.StringTokenizer;

// year,rank_display,university,score,link,country,city,region,logo
public class objUniversity {
    private String year;
    private String rank_display;
    private String university;
    private String score;
    private String link;
    private String country;
    private String city;
    private String region;
    private String logo;
    // constructor
    objUniversity(){
        year = "";
        rank_display = "";
        university = "";
        score = "";
        link = "";
        country = "";
        city = "";
        region = "";
        logo = "";
    }
    objUniversity(String year, String rank_display, String university, String score, String link, String country, String city, String region, String logo){
        this.year = year;
        this.rank_display = rank_display;
        this.university = university;
        this.score = score;
        this.link = link;
        this.country = country;
        this.city = city;
        this.region = region;
        this.logo = logo;
    }
    //getter / setter
    
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getRank_display() {
        return rank_display;
    }
    public void setRank_display(String rank_display) {
        this.rank_display = rank_display;
    }
    public String getUniversity() {
        return university;
    }
    public void setUniversity(String university) {
        this.university = university;
    }
    public String getScore() {
        return score;
    }
    public void setScore(String score) {
        this.score = score;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }
    
    // sysout /
    public void ptoString(){
        StringTokenizer scoretok = new StringTokenizer(getScore(), ",");
        String _score = scoretok.nextToken();
        if(scoretok.hasMoreTokens())_score += "." + scoretok.nextToken();

        System.out.println("Year : " + getYear() + " | # " + getRank_display() + " | ");
        System.out.println("University name : " + getUniversity() + " } score { " + _score + " }");
        System.out.println("link : " + getLink());
        System.out.println("country {"+ getCountry() +"} ; city {"+getCity()+"} ; region {"+getRegion()+"}");
        System.out.println("logo : " + getLogo());
    }
}
