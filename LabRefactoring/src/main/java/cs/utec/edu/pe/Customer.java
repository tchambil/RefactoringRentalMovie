package cs.utec.edu.pe;
import java.util.Vector;
import java.util.Enumeration;

public class Customer {
    private String customerName;
    private Vector customerRentals = new Vector();

    public Customer(String name) {
        this.customerName = name;
    }

    public void addRental(Rental rental) {
        customerRentals.addElement(rental);
    }
    public String getName() {
        return customerName;
    }
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = customerRentals.elements();
        String result = "Registro de alquiler para " + getName() + "\n";

        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();

            // determines the amount for each line
            switch (each.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (each.getDaysRented() > 2)
                        thisAmount += (each.getDaysRented() - 2) * 1.5;
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.getDaysRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if (each.getDaysRented() > 3)
                        thisAmount += (each.getDaysRented() - 3) * 1.5;
                    break;
            }
            // add frequent renter points
            frequentRenterPoints++;

            // add bonus for a two day new release rental
            if (each.getMovie().getPriceCode() == Movie.NEW_RELEASE && each.getDaysRented() > 1)
                frequentRenterPoints++;

            // show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }

        // add footer lines
        result += "Total deuda : " + String.valueOf(totalAmount) + "\n";
        result += "Tiene " + String.valueOf(frequentRenterPoints) + " puntos por cliente frecuente";

        return result;
    }
}
