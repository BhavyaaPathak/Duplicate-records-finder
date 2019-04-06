package com.validity.duplicates.takeHome.controller;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.validity.duplicates.takeHome.bean.CsvBean;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

@Controller
public class CsvController {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@GetMapping("/takeHome")
	public String sayHello(Model theModel) throws IOException {

		List<CsvBean> records = new ArrayList<CsvBean>();

		try (Reader reader = Files.newBufferedReader(Paths.get("advanced.csv"));) {
			CsvToBean<CsvBean> csvToBean = new CsvToBeanBuilder(reader).withType(CsvBean.class)
					.withIgnoreLeadingWhiteSpace(true).build();

			Iterator<CsvBean> csvUserIterator = csvToBean.iterator();

			while (csvUserIterator.hasNext()) {
				CsvBean objectToCompare = csvUserIterator.next();
				records.add(objectToCompare);
			}
		}
		
		theModel.addAttribute("records", records);
		
		return "display";
	}
}
















//				System.out.println("ID : " + csvReader.getId());
//				System.out.println("First Name : " + csvReader.getFirstName());
//				System.out.println("Last Name : " + csvReader.getLastName());
//				System.out.println("Company : " + csvReader.getCompany());
//				System.out.println("Email : " + csvReader.getEmail());
//				System.out.println("Address1 : " + csvReader.getAddress1());
//				System.out.println("Address2 : " + csvReader.getAddress2());
//				System.out.println("Zip : " + csvReader.getZip());
//				System.out.println("City : " + csvReader.getCity());
//				System.out.println("StateLong : " + csvReader.getStateLong());
//				System.out.println("State : " + csvReader.getState());
//				System.out.println("Phone : " + csvReader.getPhone());
//				System.out.println("---------------------------");

//				System.out.println("==========================");

//			for (int i = 0; i < records.size(); i++) {
//				for (int j = i + 1; j < records.size(); j++) {
//					if (distance(String.valueOf(records.get(i)), String.valueOf(records.get(j)))
//					) {
//						duplicateRecords.add(records.get(i));
//						duplicateRecords.add(records.get(j));
//
//					}
//				}
//
//			}
 

//			for (int i = 0; i < nonDuplicateRecords.size(); i++) {
//				for (int j = i + 1; j < nonDuplicateRecords.size(); j++) {
//					if (encoder(String.valueOf(nonDuplicateRecords.get(i)),
//							String.valueOf(nonDuplicateRecords.get(j)))) {
//						duplicateRecords.add(nonDuplicateRecords.get(i));
//						duplicateRecords.add(nonDuplicateRecords.get(j));
//					}
//				}
//
//			}
