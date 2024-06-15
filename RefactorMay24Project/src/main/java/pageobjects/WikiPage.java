package pageobjects;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WikiPage {

    WebDriver driver;

    public WikiPage(WebDriver driver){
        this.driver = driver;

    }

    public List<String> getColumnOneValues(){

        int columnOneSize = driver.findElements(By.xpath("//table[@Class='infobox vcard']/descendant::tr/child::th")).size();
        List<String> columnOneValues = new ArrayList<String>(); //empty list
        for(int i=0; i < columnOneSize; i++){
            String val = driver.findElements(By.xpath("//table[@Class='infobox vcard']/descendant::tr/child::th")).get(i).getText();
            columnOneValues.add(val);
        }
        return columnOneValues;

    }

    public List<String> getColumnTwoValues(){

        int columnTwoSize = driver.findElements(By.xpath("//table[@Class='infobox vcard']/descendant::tr/child::td")).size();
        List<String> columnTwoValues = new ArrayList<String>(); //empty list
        for(int i=2; i < columnTwoSize; i++){
            String val = driver.findElements(By.xpath("//table[@Class='infobox vcard']/descendant::tr/child::td")).get(i).getText();
            columnTwoValues.add(val);
        }
        return columnTwoValues;

    }

    public Map<String, String> getShareholdingAndStakeholdersValues(){

        Map<String, String> m = new HashMap<String, String>();
        int count =  driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).size();
        for(int i = 0; i < count; i++){

            String key = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).get(i).getText();
            String value = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]")).get(i).getText();
            m.put(key, value);
        }

       return m;


    }
}
