package lab1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class databaseLab1 {
    public static void main(String[] args) {
        try {
            ArrayList<objUniversity> uniList = new ArrayList<objUniversity>();
            Scanner scan = new Scanner(new File("lab1/QS World University Rankings 2017.csv"));
            scan.nextLine();
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                StringTokenizer token = new StringTokenizer(line, ";");
                objUniversity _obj = new objUniversity();
                // year,rank_display,university,score,link,country,city,region,logo
                _obj.setYear(token.nextToken());
                _obj.setRank_display(token.nextToken());
                _obj.setUniversity(token.nextToken());
                _obj.setScore(token.nextToken());
                _obj.setLink(token.nextToken());
                if(token.hasMoreTokens())_obj.setCountry(token.nextToken());
                if(token.hasMoreTokens())_obj.setCity(token.nextToken());
                if(token.hasMoreTokens())_obj.setRegion(token.nextToken());
                if(token.hasMoreTokens())_obj.setLogo(token.nextToken());
                uniList.add(_obj);
            }
            uniList.add(new objUniversity("2017"
            ,"341"
            ,"Chiang Mai University (CMU)" 
            ,"31,5"
            ,"https://www.cmu.ac.th/en/"
            ,"Thailand"
            ,"Chiang Mai"
            ,"North thailand"
            ,"https://en.wikipedia.org/wiki/Chiang_Mai_University"));

            // writing into csv

            PrintWriter writer = new PrintWriter("lab1/QS World University Rankings 2017_out.csv");
            writer.println("Year,Rank,University,Score,Link,Country,City,Region,Logo");
            for (int index = 0; index < uniList.size(); index++) {
                ((objUniversity) uniList.get(index)).ptoString();
                writer.println(uniList.get(index).getYear() + "," + uniList.get(index).getRank_display() + "," + uniList.get(index).getUniversity() + "," +
                uniList.get(index).getScore() + "," + uniList.get(index).getLink() + "," + uniList.get(index).getCountry() + "," +
                uniList.get(index).getCity() + "," + uniList.get(index).getRegion() + "," + uniList.get(index).getLogo());
            }
            writer.close();
            scan.close();
            /// program end
            System.out.println("program terminated successfully");
        } catch (FileNotFoundException err) {
            System.out.println("Error can't find file" + err);
        }

    }
}