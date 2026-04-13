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

  // Override toString method to return a string representation of the record
  @Override
  public String toString() {
    return String.format("%s, %s, %s, %s", genre, year, artist, title);
  }

  public String compareTo(Record other) {
    if (this.genre.equals(other.genre)
        && this.year.equals(other.year)
        && this.artist.equals(other.artist)
        && this.title.equals(other.title)) {
      return "after";
    } else if (this.genre.equals(other.genre)
        && this.year.equals(other.year)
        && this.artist.equals(other.artist)) {
      return "before";
    } else {
      return "before";
    }
  }
}
