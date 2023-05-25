package sec03.LoginSystem;
import java.security.PublicKey;
public class Movie {

	private String title;
	private String author;
	private int runningTime;
	
	public Movie() {
	}
	
	public Movie(String title, String author, int runningTime) {
		this.title = title;
		this.author = author;
		this.runningTime = runningTime;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getRunningTime() {
		return runningTime;
	}
	
	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", author=" + author + ", runningTime=" + runningTime + "]";
	}
}
