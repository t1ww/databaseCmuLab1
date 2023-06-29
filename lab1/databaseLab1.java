package lab1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.File;
import java.io.FileNotFoundException;

public class databaseLab1 {
    public static void main(String[] args) {
        try {
            ArrayList uniList = new ArrayList<objUniversity>();
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
            for (int index = 0; index < uniList.size(); index++) {
                ((objUniversity) uniList.get(index)).ptoString();
            }
        } catch (FileNotFoundException err) {
            System.out.println("Error can't find file" + err);
        }

    }
}