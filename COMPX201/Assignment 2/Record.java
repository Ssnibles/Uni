/** Record class to represent a music record with genre, year, artist, and title. */
public class Record {
  private String genre;
  private String year;
  private String artist;
  private String title;

  /** Constructor for Record */
  public Record(String genre, int year, String artist, String title) {
    this.genre = genre;
    this.year = Integer.toString(year);
    this.artist = artist;
    this.title = title;
  }

  // Getter for genre
  public String getGenre() {
    return genre;
  }

  // Getter for year
  public String getYear() {
    return year;
  }

  // Getter for artist
  public String getArtist() {
    return artist;
  }

  // Getter for title
  public String getTitle() {
    return title;
  }
}
