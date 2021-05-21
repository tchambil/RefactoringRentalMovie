package cs.utec.edu.pe;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CustomerTest {
    @Test
    public void getPriceCode(){
     Movie movie = new Movie( "Title", Movie.REGULAR);
     int pc = movie.getPriceCode();
     Assert.assertEquals(pc,Movie.REGULAR);
    }
    @Test
    public void setPriceCode(){
        Movie movie = new Movie( "Title", Movie.REGULAR);
        movie.setMoviePriceCode(Movie.CHILDRENS);
        int pc = movie.getPriceCode();
        Assert.assertEquals(pc,Movie.CHILDRENS);
    }
    @Test
    public void getTitle(){
        Movie movie = new Movie( "Title", Movie.REGULAR);
        String title = movie.getTitle();
        Assert.assertEquals(title,"Title");
    }
    @Test
    public void getDaysRented(){
        Movie movie = new Movie( "Title", Movie.REGULAR);
        Rental rental = new Rental(movie,3);
        int gdr = rental.getDaysRented();
        Assert.assertEquals(gdr,3);
    }
    @Test
    public void testCustomer() {

        Customer customer = new Customer("Juan Perez");
        customer.addRental(new Rental(new Movie("Jojo Rabbit", Movie.REGULAR), 2));
        customer.addRental(new Rental(new Movie("Bad Boys for Life", Movie.REGULAR), 3));
        customer.addRental(new Rental(new Movie("Sonic, la película", Movie.NEW_RELEASE), 1));
        customer.addRental(new Rental(new Movie("Bloodshot", Movie.NEW_RELEASE), 2));
        customer.addRental(new Rental(new Movie("El hombre invisible", Movie.CHILDRENS), 3));
        customer.addRental(new Rental(new Movie("Mulan", Movie.CHILDRENS), 4));

        Assert.assertEquals("Registro de alquiler para Juan Perez\n" +
                "\tJojo Rabbit\t2.0\n" +
                "\tBad Boys for Life\t3.5\n" +
                "\tSonic, la película\t3.0\n" +
                "\tBloodshot\t6.0\n" +
                "\tEl hombre invisible\t1.5\n" +
                "\tMulan\t3.0\n" +
                "Total deuda : 19.0\n" +
                "Tiene 7 puntos por cliente frecuente", customer.statement());
    }
}
