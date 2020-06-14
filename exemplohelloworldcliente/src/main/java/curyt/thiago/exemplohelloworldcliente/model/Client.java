package curyt.thiago.exemplohelloworldcliente.model;

/**
 * @author Thiago Cury
 * @since 09/06/2020 - 11:01
 * @version 1.0
 */
public class Client {

    private String name;
    private String lastName;
    private double income;

    public Client() {
        this.income = 0.0;
    }

    /**
     *
     *
     * @param name
     * @param lastName
     */
    public Client(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.income = 0.0;
    }

    /**
     *
     * @param name
     * @param lastName
     * @param income
     */
    public Client(String name, String lastName, double income) {
        this.name = name;
        this.lastName = lastName;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    /**
     *
     * @return
     */
    public double calculateIncome() {
        return this.income * 1.10;
    }

    @Override
    public String toString() {
        return  "\nname = " + this.name +
                "\nlastName = " + this.lastName +
                "\nincome = " + this.income +
                "\n10% = " + this.calculateIncome();
    }
}
