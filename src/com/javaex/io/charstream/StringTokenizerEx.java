//11.14
package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	//	프로젝트 내의 files 디렉터리 위치
	static final String rootPath = System.getProperty("user.dir") + "\\files\\files\\";
	static final String filename = rootPath + "thieves.txt";
	
	public static void main(String[] args) {
		try (
			//	주스트림
			Reader freader = new FileReader(filename);
			//	보조 스트림
			BufferedReader br = new BufferedReader(freader);
		) {
			String thief;
			
			while ((thief = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(thief, " ");	//	토큰 기준으로 잘라내기
//				System.out.println(thief);
				while (st.hasMoreTokens()) {
					String token = st.nextToken();
					System.out.print(token + " ");
				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
