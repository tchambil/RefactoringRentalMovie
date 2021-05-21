package cs.utec.edu.pe;

public class Rental {
    private Movie rentedMovie;
    private int nDaysRented;

    public Rental(Movie rentedMovie, int nDaysRented) {
        this.rentedMovie = rentedMovie;
        this.nDaysRented = nDaysRented;
    }

    public Movie getMovie() {
        return rentedMovie;
    }

    public int getDaysRented() {
        return nDaysRented;
    }
}
