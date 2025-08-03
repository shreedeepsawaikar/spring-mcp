package in.lolxz.mcp_server_demo;

// Main User class
public class User {
    private Long id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;

    // Constructors
    public User() {}

    public User(Long id, String name, String username, String email) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getWebsite() { return website; }
    public void setWebsite(String website) { this.website = website; }

    public Company getCompany() { return company; }
    public void setCompany(Company company) { this.company = company; }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", phone='" + phone + '\'' +
                ", website='" + website + '\'' +
                ", company=" + company +
                '}';
    }

    // Nested Address class
    public static class Address {
        private String street;
        private String suite;
        private String city;
        private String zipcode;
        private Geo geo;

        // Constructors
        public Address() {}

        public Address(String street, String suite, String city, String zipcode) {
            this.street = street;
            this.suite = suite;
            this.city = city;
            this.zipcode = zipcode;
        }

        // Getters and Setters
        public String getStreet() { return street; }
        public void setStreet(String street) { this.street = street; }

        public String getSuite() { return suite; }
        public void setSuite(String suite) { this.suite = suite; }

        public String getCity() { return city; }
        public void setCity(String city) { this.city = city; }

        public String getZipcode() { return zipcode; }
        public void setZipcode(String zipcode) { this.zipcode = zipcode; }

        public Geo getGeo() { return geo; }
        public void setGeo(Geo geo) { this.geo = geo; }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", suite='" + suite + '\'' +
                    ", city='" + city + '\'' +
                    ", zipcode='" + zipcode + '\'' +
                    ", geo=" + geo +
                    '}';
        }

        // Nested Geo class
        public static class Geo {
            private String lat;
            private String lng;

            // Constructors
            public Geo() {}

            public Geo(String lat, String lng) {
                this.lat = lat;
                this.lng = lng;
            }

            // Getters and Setters
            public String getLat() { return lat; }
            public void setLat(String lat) { this.lat = lat; }

            public String getLng() { return lng; }
            public void setLng(String lng) { this.lng = lng; }

            @Override
            public String toString() {
                return "Geo{" +
                        "lat='" + lat + '\'' +
                        ", lng='" + lng + '\'' +
                        '}';
            }
        }
    }

    // Nested Company class
    public static class Company {
        private String name;
        private String catchPhrase;
        private String bs;

        // Constructors
        public Company() {}

        public Company(String name, String catchPhrase, String bs) {
            this.name = name;
            this.catchPhrase = catchPhrase;
            this.bs = bs;
        }

        // Getters and Setters
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getCatchPhrase() { return catchPhrase; }
        public void setCatchPhrase(String catchPhrase) { this.catchPhrase = catchPhrase; }

        public String getBs() { return bs; }
        public void setBs(String bs) { this.bs = bs; }

        @Override
        public String toString() {
            return "Company{" +
                    "name='" + name + '\'' +
                    ", catchPhrase='" + catchPhrase + '\'' +
                    ", bs='" + bs + '\'' +
                    '}';
        }
    }
}