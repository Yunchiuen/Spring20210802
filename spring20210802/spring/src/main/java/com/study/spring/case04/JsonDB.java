package com.study.spring.case04;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Component
public class JsonDB {
	@Autowired
	private Gson gson;

	private static final Path PATH = Paths.get("src\\main\\java\\com\\study\\spring\\case04\\person.json");

	public List<Person> queryAll() throws IOException {
		List<String> list = Files.readAllLines(PATH);
		// list 合併成String
		String json = list.stream().collect(Collectors.joining());

		
		Type type = new TypeToken<ArrayList<Person>>() {}.getType();
		List<Person> people = gson.fromJson(json, type);
		return people;
	}

	public boolean add(Person person) throws UnsupportedEncodingException, IOException {
		List<Person> people = queryAll();
		people.add(person);

		// 將people集合回存到person.json
		String json = gson.toJson(people);
		Files.write(PATH, json.getBytes("utf-8"));
		return true;
	}

}
