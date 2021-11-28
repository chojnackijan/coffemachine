public class ID {
    private String firstName="Jan";
    private String lastName="Chojnacki";
    private int idNumber=931216;

    ID(String firstName,String lastName,int idNumber){
        this.firstName=firstName;
        this.lastName=lastName;
        this.idNumber=idNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}

