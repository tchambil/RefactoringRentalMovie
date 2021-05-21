package cs.utec.edu.pe;

public class Movie {
    public static final int CHILDRENS   = 2;
    public static final int REGULAR     = 0;
    public static final int NEW_RELEASE = 1;

    private String movieTitle;
    private int moviePriceCode =REGULAR;

    public Movie(String movieTitle, int moviePriceCode ) {
        this.movieTitle = movieTitle;
        this.moviePriceCode = moviePriceCode;
    }

    public String getTitle() {
        return movieTitle;
    }

    public int getPriceCode() {
        return moviePriceCode;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public void setMoviePriceCode(int moviePriceCode) {
        this.moviePriceCode = moviePriceCode;
    }
}
