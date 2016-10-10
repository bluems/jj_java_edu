package prac4_1;

public class Song {
	String title;
	public Song(String title)
	{
		this.title = title;
	}
	
	public String getTitle()
	{
		return this.title;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Song mySong = new Song("Let it go");
		Song yourSong = new Song("강남스타일");
		System.out.println("내 노래는 " + mySong.getTitle());
		System.out.println("네 노래는 " + yourSong.getTitle());

	}

}
