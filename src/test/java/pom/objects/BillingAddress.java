package pom.objects;

public class BillingAddress {
    private String firstName;
    private String lastName;
    private String addressLine;
    private String city;
    private String postCode;
    private String email;
    private String countryName;
    private String stateName;
    public BillingAddress()
    {

    }
    public BillingAddress(String firstName, String lastName, String addressLine, String city, String email, String postCode,String countryName,String stateName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressLine = addressLine;
        this.city = city;
        this.email = email;
        this.postCode = postCode;
        this.countryName = countryName;
        this.stateName=stateName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getStateName() {
        return stateName;
    }
}
