package com.nelioalves.cursomc.resources.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class URL {

	public static List<Integer> decodeIntList(String s) {
		/*
		String[] vet = s.split(",");
		List<Integer> list = new ArrayList<>();
		
		for(String v : vet) {
			list.add(Integer.parseInt(v));
		}
		
		return list;
		*/
		
		return Arrays.asList(s.split(","))
				.stream().map(x -> Integer.parseInt(x))
				.collect(Collectors.toList());
	}
}
