package org.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

public class Proj {
           private static final String STRING = null;

		static WebDriver driver;
           
           static ArrayList<String>ar=new ArrayList<String>();
           static void excelfile() 
           {
        	   
           try {
        	   File file= new File("C:\\Users\\Anuj\\eclipse\\java project\\MiniProj\\Excel\\Project.xlsx");
			  FileInputStream inputStream = new FileInputStream(file);
			  Workbook wb = new XSSFWorkbook(inputStream);
			  Sheet s = wb.getSheet("Mobiles");
			  
			  
			Iterator<Row> itr = s.iterator();
			
			While (itr.hasNext());
			{
				Row r = itr.next();
				
			Iterator<Cell> cellIterator = r.cellIterator();	
			while(cellIterator.hasNext()) {
			Cell cell = cellIterator.next();
			
			switch (cell.getCellType()) {
			case STRING:
			
				String get = cell.getStringCellValue();
				ar.add(get);
				break;
				
				default:
		
			}
		
			}
			

				}
			    
		} catch (Exception e) {
			// TODO: handle exception
		}
           
           System.out.println(ar);
           {
        	   System.out.println("=======================================================");
           }
           
           static void login() throws IOException
           {
        	   System.setProperty("webdriver.chromedriver.driver", 
        			   "C:\\Users\\Anuj\\eclipse\\java project\\MiniProj\\driver\\chromedriver.exe");
          
           driver = new ChromeDriver();
           driver.get("https://www.amazon.in/");
           driver.manage().window().maximize();
           
           driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
           driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("8208542657");
           driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
           driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Vgadewar27");
           driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
           
           
           for(int i=0; i<ar.size();i++)
           {
        	   driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).click();
        	   driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(ar.get(i));
        	   driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        	   
        	 List<WebElement> result = driver.findElement(By.xpath(//*[@id="CardInstance-wfeRM1co5CxqcYxGygGWw"]/a"));
        			 
        			 
        		List<WebElement> links;	 	   
        	   
           }
           }
           
           System.out.println("\n"+ar.get(i)+"-\n");
           int counter=0;
           File file = new File("C:\\Users\\Anuj\\Documents");
           BufferedWriter wr= new BufferedWriter(f1);
           wr.newLine();
           wr.append("\n"+ar.get(i)+"\n");
           FileWriter f1= new FileWriter(file,true);
           for(WebElement element:results) 
           {
        	   links= element.findElement(By.tagName("a"));
        	   for(int j=0; j<links.size();j++) {
        		   if(links.get(j).getText.length()>20) 
        		   {
        			   counter++;
        			   System.out.println("result"+counter+"-"+links.get(j).getText());
        			   wr.append("result"+counter+"-"+links.get(j).getText()+"\n");
        			   
        			   
        			 
        	   }
        	   
        	   if(counter>=5)
        		   break;
        	   }
        	   
           }
           wr.close();   
}
     }
		public static void main(String[]args) {
			
			excelfile();
			login();
			
			
			
			
			
			
			
			
			
			
		}
		}