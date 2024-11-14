//11.14
package com.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

//	마지막 잎새 텍스트 받아와서 그 중 leaf or leaves 가 들어간 문장만 출력하기
public class BufferedCharStreamEx {
	//	프로젝트 내의 files 디렉터리 위치
	static final String rootPath = System.getProperty("user.dir") + "\\files\\files\\";
	static final String source = rootPath + "last-leaf.txt";
	static final String target = rootPath + "last-leaf-filtered.txt";
	
	public static void main(String[] args) {
		try(
			//	주스트림
			Reader fr = new FileReader(source);
			Writer fw = new FileWriter(target);
			
			//	보조 스트림(버퍼)
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
		) {
			//	문장 단위로 입출력
			String line = "";
			while ((line = br.readLine()) != null) {	//	빈 문자열이라 없으면 null을 반환
				if (line.toLowerCase().contains("leaf") ||	//	모두 소문자로 바꿔서 단어찾기
					line.toLowerCase().contains("leaves"))	{
					bw.write(line);
					bw.newLine();
				}
			}
			System.out.println("문서를 저장했습니다");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	//	last-leaf.txt 그대로 복사
	}

}
