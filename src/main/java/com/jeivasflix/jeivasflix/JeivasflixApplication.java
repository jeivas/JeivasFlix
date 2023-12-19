package com.jeivasflix.jeivasflix;

import com.jeivasflix.jeivasflix.model.SeriesData;
import com.jeivasflix.jeivasflix.service.ConsumeApi;
import com.jeivasflix.jeivasflix.service.ConvertData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JeivasflixApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JeivasflixApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var api = new ConsumeApi();
		var json = api.getData("https://www.omdbapi.com/?t=breaking+bad&apikey=f00ecf00");
		System.out.println(json);
		ConvertData converter = new ConvertData();
		SeriesData data = converter.getData(json, SeriesData.class);
		System.out.println(data);
	}
}
