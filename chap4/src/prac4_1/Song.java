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
		Song yourSong = new Song("������Ÿ��");
		System.out.println("�� �뷡�� " + mySong.getTitle());
		System.out.println("�� �뷡�� " + yourSong.getTitle());

	}

}
