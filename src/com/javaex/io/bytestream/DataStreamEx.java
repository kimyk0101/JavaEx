//11.14
package com.javaex.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//	byte 타입의 데이터를 기본타입 데이터로 변환
public class DataStreamEx {
	//	프로젝트 내의 files 디렉터리 위치
	static final String rootPath = System.getProperty("user.dir") + "\\files\\files\\";
	static final String filename = rootPath + "primitives.txt";
	
	public static void main(String[] args) {
		writePrimitives();
		readPrimitives();

	}

	private static void writePrimitives() {
		try (
			//	주스트림
			OutputStream fos = new FileOutputStream(filename);
			//	보조 스트림
			DataOutputStream dos = new DataOutputStream(fos);
		) {
			dos.writeUTF("홍길동");
			dos.writeBoolean(true);
			dos.writeInt(28);
			dos.writeFloat(80.9f);
			
			dos.writeUTF("고길동");
			dos.writeBoolean(false);
			dos.writeInt(45);
			dos.writeFloat(99.9f);
			
			dos.writeUTF("전우치");
			dos.writeBoolean(true);
			dos.writeInt(32);
			dos.writeFloat(68);
			
			System.out.println("파일이 저장되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	private static void readPrimitives() {
		try (
			//	주스트림
			InputStream fis = new FileInputStream(filename);
			//	보조 스트림
			DataInputStream dis = new DataInputStream(fis);
		) {
			//	주의: 출력된 순서대로 읽어와야 한다
			for (int i = 0; i < 3; ++i) {
				String s = dis.readUTF();
				boolean b = dis.readBoolean();
				int val = dis.readInt();
				float f = dis.readFloat();
				
				System.out.printf("%s:%b:%d:%f%n", s, b, val, f);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
