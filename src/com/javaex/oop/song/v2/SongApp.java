//11.07-practice
package com.javaex.oop.song.v2;

//	v2. 기본 생성자와 초기화 생성자
class Song {
	//	필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//	기본 생성자
	public Song() {
		
	}
	
	//	모든 필드 초기화
	public Song(String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	//	Getters/Setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;	
	}	
	
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;	
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;	
	}
	
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;	
	}
	
	//	메서드
	public void showInfo() {
		System.out.printf("%s, %s ( %s, %d, %d번 track, %s 작곡 )%n", artist, title, album, year, track, composer);
	}
}
public class SongApp {

	public static void main(String[] args) {
		Song song1 = new Song();
		song1.setTitle("좋은날");
		song1.setArtist("아이유");
		song1.setAlbum("Real");
		song1.setComposer("이민수");
		song1.setYear(2010);
		song1.setTrack(3);
		song1.showInfo();
		
		Song song2 = new Song();
		song2.setTitle("거짓말");
		song2.setArtist("BIGBANG");
		song2.setAlbum("Always");
		song2.setComposer("G-DRAGON");
		song2.setYear(2007);
		song2.setTrack(2);
		song2.showInfo();

		Song song3 = new Song();
		song3.setTitle("벚꽃엔딩");
		song3.setArtist("버스커버스커");
		song3.setAlbum("버스커버스커1집");
		song3.setComposer("장범준");
		song3.setYear(2012);
		song3.setTrack(4);
		song3.showInfo();

	}

}
