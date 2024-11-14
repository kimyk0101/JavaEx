//11.14
package com.javaex.io.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//	byte 통째로 복사
public class BufferedStreamEx {
	//	프로젝트 내의 files 디렉터리 위치
	static final String rootPath = System.getProperty("user.dir") + "\\files\\files\\";
	static final String source = rootPath + "img.jpg";	//	복사할 소스
	static final String target = rootPath + "img_buffered_copy.jpg";	//	복사할 대상
	public static void main(String[] args) {
		try (	//	닫지 않아도 됨
			//	주스트림	
			InputStream fis = new FileInputStream(source);
			OutputStream fos =new FileOutputStream(target);
				
			//	보조 스트림
			BufferedInputStream bis = new BufferedInputStream(fis);	
			BufferedOutputStream bos = new BufferedOutputStream(fos);
		) {
			byte[] data = new byte[10240];	//	10kilobyte
			int size = 0;
			
			while ((size = bis.read(data)) != -1) {
				bos.write(data);
				System.out.println(size + "바이트 복사했습니다.");
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 열지 못했어요.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
