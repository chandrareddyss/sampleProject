package chandra_mpj.chandra;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Hashma {
	@Test
	public static void chandra() throws IOException {
		
				String str = "tc_03";
				
				FileInputStream fis=new FileInputStream("E:\\Book2.xlsx");
				XSSFWorkbook wb=new XSSFWorkbook(fis);
				XSSFSheet s=wb.getSheetAt(0);
		        XSSFRow r = get_row(s,str)  ;
		        Data.hm=cell_value(s,r);  
		        System.out.println(Data.hm);
				 
				
				
	}
	static  XSSFRow get_row(XSSFSheet sh,String Testcaseid) {
		XSSFRow row=null;
		for(int i=1;i<sh.getPhysicalNumberOfRows();i++) {
			if(sh.getRow(i).getCell(0).getStringCellValue().equalsIgnoreCase(Testcaseid))  {
				row=sh.getRow(i);
			}
		}
		return row;
		
	}
	static HashMap<String, String> cell_value(XSSFSheet sh,XSSFRow row){
		HashMap<String,String> h=new HashMap<String, String>();
		for(int i=0;i<row.getLastCellNum();i++) {
		h.put(sh.getRow(0).getCell(i).getStringCellValue(),row.getCell(i).getStringCellValue());
		}
		return h;
		
	}
	
				
				
				/*XSSFWorkbook wb = new XSSFWorkbook(fis);
				XSSFSheet s = wb.getSheetAt(0);
				XSSFRow r = get_row(s,str);
				Data.hm=cell_value(s,r);
				System.out.println(Data.hm);
				}
	
			static XSSFRow get_row(XSSFSheet sh,String TestcaseID) {
				XSSFRow row = null;
				for(int i = 1; i<sh.getPhysicalNumberOfRows();i++) {
					if(sh.getRow(i).getCell(0).getStringCellValue().equalsIgnoreCase(TestcaseID)) {
						 row = sh.getRow(i);
					}
				}
				return row;
			}
			
			static HashMap<String, String> cell_value(XSSFSheet sh,XSSFRow row) {
				HashMap<String , String> h = new HashMap<String, String>();
						for(int i =0 ; i<row.getLastCellNum();i++) {
					h.put(sh.getRow(0).getCell(i).getStringCellValue(), row.getCell(i).getStringCellValue());
				}return h;
			}*/
}