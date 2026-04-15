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

  /** Compare this record to another record */
  public int compareTo(Record other) {
    int genreCompare = this.genre.compareTo(other.genre);
    // If genres are different, return the comparison result
    if (genreCompare != 0) {
      return genreCompare;
    }

    // Compare years as integers to ensure correct ordering
    int yearCompare = Integer.compare(Integer.parseInt(this.year), Integer.parseInt(other.year));
    if (yearCompare != 0) {
      return yearCompare;
    }

    int artistCompare = this.artist.compareTo(other.artist);
    if (artistCompare != 0) {
      return artistCompare;
    }

    return this.title.compareTo(other.title);
  }
}
