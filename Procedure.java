/*
 * Class: CMSC203
 * Instructor: Huseyin Aygun
 * Description: Obtain information about user and three procedures, compute total cost
 * Due: 09/28/2025
 * Platform/compiler: Java SE, Windows 11
 * 
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * 
 * Print your Name here: Kaden Shrestha
 */

public class Procedure {
    // Fields
    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double charges;

    // No-arg constructor
    public Procedure() {
    }

    // Parametrized constructor for name and date
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }

    // Parametrized constructor for all attributes
    public Procedure(String procedureName, String procedureDate, String practitionerName, double charges) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.charges = charges;
    }

    // Accessors and mutators
    public String getProcedureName() {
        return procedureName;
    }

    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public String getProcedureDate() {
        return procedureDate;
    }

    public void setProcedureDate(String procedureDate) {
        this.procedureDate = procedureDate;
    }

    public String getPractitionerName() {
        return practitionerName;
    }

    public void setPractitionerName(String practitionerName) {
        this.practitionerName = practitionerName;
    }

    public double getCharges() {
        return charges;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }

    // toString method to display procedure information
    @Override
    public String toString() {
        return "Procedure: " + procedureName + "\nDate: " + procedureDate + "\nPractitioner: " + practitionerName +
                "\nCharges: $" + String.format("%.2f", charges);
    }
}
