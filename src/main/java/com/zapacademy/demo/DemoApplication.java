package com.zapacademy.demo;

import com.gembox.spreadsheet.ExcelFile;
import com.gembox.spreadsheet.SpreadsheetInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) throws IOException {
		// Set license key to use GemBox.Spreadsheet in Free mode.
		SpreadsheetInfo.setLicense("FREE-LIMITED-KEY");

		// Create a new empty Excel file.
		ExcelFile workbook = new ExcelFile();

		// Create a new worksheet and set cell A1 value to 'Hello world!'.
		workbook.addWorksheet("Sheet 1").getCell("A1").setValue("Hello world!");

		// Save to XLSX file.
		workbook.save("Spreadsheet.xlsx");
	}

}


