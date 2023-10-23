package net.flix;

public class Movie {
    // fields or instance variables ("properties" or "attributes")
    private String title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre;

    // constructors - these get called when clients say "new"
    public Movie(String title) {
        setTitle(title);  // delegate to setter for any validation/conversion it might be doine
    }

    public Movie(String title, Genre genre) {
        this(title);
        setGenre(genre);
    }

    public Movie(String title, Integer releaseYear) {
        this(title);                  // delegate to 1-arg String ctor for title
        setReleaseYear(releaseYear);  // handle releaseYear myself, by delegating to its setter
    }

    public Movie(String title, Integer releaseYear, Double revenue) {
        this(title, releaseYear);  // delegate to ctor above me for title, releaseYear
        setRevenue(revenue);       // handle revenue myself, by delegating to its setter
    }

    public Movie(String title, Integer releaseYear, Double revenue, Rating rating, Genre genre) {
        this(title, releaseYear, revenue);
        setRating(rating);
        setGenre(genre);
    }

    // business or "action" methods - not shown
    // pause(), play(), rewind(), fastForward(), skipTo()

    // accessor methods - provide "controlled access" to the object's fields
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String toString() {
        // if revenue is null, you use %s, and if not, go with %,.2f
        String revenueFormat = (getRevenue() == null) ? "%s" : "%,.2f";

        return String.format("Movie: title=%s, releaseYear=%s, revenue=" + revenueFormat + ", rating=%s, genre=%s",
                getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());
    }
}