package cs.utec.edu.pe;
import java.util.logging.Logger;
public class LabRefactoring {

    //resource: https://www.ge.infn.it/geant4/training/APC2017/exercise.html
    //https://home.cs.colorado.edu/~kena/classes/6448/s05/lectures/lecture19.pdf

    static final Logger logger = Logger.getLogger(LabRefactoring.class.getName());
    public static void main(String[] args){
        Customer customer = new Customer("Juan Perez");
        customer.addRental(new Rental(new Movie("Jojo Rabbit", Movie.REGULAR), 2));
        customer.addRental(new Rental(new Movie("Bad Boys for Life", Movie.REGULAR), 3));
        customer.addRental(new Rental(new Movie("Sonic, la película", Movie.NEW_RELEASE), 1));
        customer.addRental(new Rental(new Movie("Bloodshot", Movie.NEW_RELEASE), 2));
        customer.addRental(new Rental(new Movie("El hombre invisible", Movie.CHILDRENS), 3));
        customer.addRental(new Rental(new Movie("Mulan", Movie.CHILDRENS), 4));
        logger.info(customer.statement());
    }
}
