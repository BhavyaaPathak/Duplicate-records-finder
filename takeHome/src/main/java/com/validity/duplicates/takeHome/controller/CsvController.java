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

		List<CsvBean> duplicateRecords = new ArrayList<CsvBean>();
		List<CsvBean> nonDuplicateRecords = new ArrayList<CsvBean>();
		boolean isDuplicate = false;

		// read advanced.csv using opencsv
		// put normal.csv if you want to read duplicate data from normal.csv
		try (Reader reader = Files.newBufferedReader(Paths.get("advanced.csv"));) {
			CsvToBean<CsvBean> csvToBean = new CsvToBeanBuilder(reader).withType(CsvBean.class)
					.withIgnoreLeadingWhiteSpace(true).build();

			Iterator<CsvBean> csvUserIterator = csvToBean.iterator();

			while (csvUserIterator.hasNext()) {
				CsvBean objectToCompare = csvUserIterator.next();
				isDuplicate = false;

				// compare the current csv row with the previous rows before adding it to
				// duplicate or non-duplicate set
				if (nonDuplicateRecords.isEmpty()) {
					nonDuplicateRecords.add(objectToCompare);
				} else {
					for (CsvBean csvObject : nonDuplicateRecords) {
						if (objectToCompare.compareTo(csvObject) > 0) {
							isDuplicate = true;
							break;
						}
					}
					if (isDuplicate) {
						duplicateRecords.add(objectToCompare);
					} else {
						nonDuplicateRecords.add(objectToCompare);
					}

				}
			}
		}
		nonDuplicateRecords.remove(0);
		
		// add the output to model
		theModel.addAttribute("duplicateRecord", duplicateRecords);
		theModel.addAttribute("nonDuplicateRecord", nonDuplicateRecords);
		
		// return the model to display view page
		return "display";
	}
}
