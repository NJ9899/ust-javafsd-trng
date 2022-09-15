package sba;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

//import java.io.File;
//import java.io.FileOutputStream;

public class sba2_json {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub	
		//XSSFWorkbook wb = new XSSFWorkbook();
		//FileOuputStream fo = new FileOutputStream(new File("C:\\Users\\ustjavafsdb209\\Downloads\\Data.xls"));
		
		JSONParser p = new JSONParser();
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet st = wb.createSheet();
		OutputStream fo = new FileOutputStream(new File("C:\\Users\\ustjavafsdb209\\Downloads\\Data.xls"));
		
		HSSFRow r = st.createRow(0);
		r.createCell(0).setCellValue("id");
		r.createCell(1).setCellValue("name");
		r.createCell(2).setCellValue("email");
		r.createCell(3).setCellValue("password");
		r.createCell(4).setCellValue("about");
		r.createCell(5).setCellValue("token");
		r.createCell(6).setCellValue("country");
		r.createCell(7).setCellValue("location");
		r.createCell(8).setCellValue("lng");
		r.createCell(9).setCellValue("lat");
		r.createCell(10).setCellValue("dob");
		r.createCell(11).setCellValue("gender");
		
		
		
		try {
			JSONArray o = (JSONArray)p.parse(new FileReader("C:\\Users\\ustjavafsdb209\\Downloads\\EmployeeData.json"));
			
			
			for(int i=1;i<=(o.size()+1);i++) {
				for(int j=0;j<o.size();j++) {
					JSONObject obj= (JSONObject)o.get(j);
					long id = (long)obj.get("id");
					String name = (String)obj.get("name");
					String email = (String)obj.get("email");
					String password = (String)obj.get("password");
					String about = (String)obj.get("about");
					String token = (String)obj.get("token");
					String country = (String)obj.get("country");
					String location = (String)obj.get("location");
					long lng = (long)obj.get("lng");
					long lat = (long)obj.get("lat");
					String dob = (String)obj.get("dob");
					long gender = (long)obj.get("gender");
					
					HSSFRow r1 = st.createRow(i+1);
					
					r.createCell(0).setCellValue("id");
					r.createCell(1).setCellValue("name");
					r.createCell(2).setCellValue("email");
					r.createCell(3).setCellValue("password");
					r.createCell(4).setCellValue("about");
					r.createCell(5).setCellValue("token");
					r.createCell(6).setCellValue("country");
					r.createCell(7).setCellValue("location");
					r.createCell(8).setCellValue("lng");
					r.createCell(9).setCellValue("lat");
					r.createCell(10).setCellValue("dob");
					r.createCell(11).setCellValue("gender");
					
				}
				
				wb.write(fo);
			}
			
			System.out.println("Data written successfully!!!\nOpen the xls file to see the data");
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
