package src.CreationalDesign.Builder;

public class User {
    // 10 thuộc tính
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phone;
    private final String address;
    private final String city;
    private final String state;
    private final String zip;
    private final String country;
    
    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
        this.city = builder.city;
        this.state = builder.state;
        this.zip = builder.zip;
        this.country = builder.country;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getCountry() {
        return country;
    }

    public static  class UserBuilder {
        private String firstName;
        private String lastName;
        private String email;
        private String phone;
        private String address;
        private String city;
        private String state;
        private String zip;
        private String country;

        public UserBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public UserBuilder setState(String state) {
            this.state = state;
            return this;
        }

        public UserBuilder setZip(String zip) {
            this.zip = zip;
            return this;
        }

        public UserBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
        

    
}
