package com.practice.string;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FindIfAnagram {
	static Map<Character, Integer> map;

	public static void main(String[] args) {
		if (isAnagram("sarcocarcinomata", "carcinosarcomata","comatacarcinosar")) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}

	}

	private static boolean isAnagram(String... s) {
		int len = s[0].length();
		for (int i = 1; i < s.length; i++) {
			if (len != s[i].length())
				return false;
		}
		int score = getScore(s[0]);
		for (int i = 1; i < s.length; i++) {
			if (score != getScore(s[i]))
				return false;
		}
		return true;
	}

	private static int getScore(String string) {
		string = string.toUpperCase();
		if (map == null) {
			initializeMap();
		}
		char[] charArray = string.toCharArray();
		int score = 0;
		for (char c : charArray) {
			score = score + map.get(c);
		}
		return score;
	}

	private static void initializeMap() {
		map = new ConcurrentHashMap<Character, Integer>();
		// Start with prime number 7
		map.put('A', 7);
		map.put('B', getNextPrime(map.get('A')));
		map.put('C', getNextPrime(map.get('B')));
		map.put('D', getNextPrime(map.get('C')));
		map.put('E', getNextPrime(map.get('D')));
		map.put('F', getNextPrime(map.get('E')));
		map.put('G', getNextPrime(map.get('F')));
		map.put('H', getNextPrime(map.get('G')));
		map.put('I', getNextPrime(map.get('H')));
		map.put('J', getNextPrime(map.get('I')));
		map.put('K', getNextPrime(map.get('J')));
		map.put('L', getNextPrime(map.get('K')));
		map.put('M', getNextPrime(map.get('L')));
		map.put('N', getNextPrime(map.get('M')));
		map.put('O', getNextPrime(map.get('N')));
		map.put('P', getNextPrime(map.get('O')));
		map.put('Q', getNextPrime(map.get('P')));
		map.put('R', getNextPrime(map.get('Q')));
		map.put('S', getNextPrime(map.get('R')));
		map.put('T', getNextPrime(map.get('S')));
		map.put('U', getNextPrime(map.get('T')));
		map.put('V', getNextPrime(map.get('U')));
		map.put('W', getNextPrime(map.get('V')));
		map.put('X', getNextPrime(map.get('W')));
		map.put('Y', getNextPrime(map.get('X')));
		map.put('Z', getNextPrime(map.get('Y')));

	}

	private static Integer getNextPrime(Integer integer) {
		int n = integer + 7;
		while (true) {
			if (isPrime(n))
				return n;
			n++;
		}
	}

	private static boolean isPrime(int n) {
//		int sqrt = (int) Math.sqrt(n);
		for (int i = 2; i < n/2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
