package mob_operator.model.entity;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Customer {

    private long id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String passport;
    private String adress;
    private String email;
    private String password;
    private List<Tariff> tariffList;
    private List<Contract>;

public Customer(){}

    public static class Builder {

        private long id;
        private String firstName;
        private String lastName;
        private Date dateOfBirth;
        private String passport;
        private String adress;
        private String email;
        private String password;
        private List<Tariff> tariffList;
        private List<Contract> contractList;

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setContractList(List<Contract> contractList) {
            this.contractList = contractList;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setDateOfBirth(Date dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder setPassport(String passport) {
            this.passport = passport;
            return this;
        }

        public Builder setAdress(String adress) {
            this.adress = adress;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setTariffList(List<Tariff> tariffList) {
            this.tariffList = tariffList;
            return this;
        }


        public Customer build() {
            return new Customer(this);
        }
    }
        public long getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public Date getDateOfBirth() {
            return dateOfBirth;
        }

        public String getPassport() {
            return passport;
        }

        public String getAdress() {
            return adress;
        }

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }

        public List<Tariff> getTariffList() {
            return tariffList;
        }



        public List<Contract> getContractList() {
            return contractList;
        }
        private Contract (Builder builder) {
            this.id= builder.id;
            this.adress=builder.adress;
            this.email=builder.email;
            this.dateOfBirth=builder.dateOfBirth;
            this.firstName= builder.firstName;
            this.lastName= builder.lastName;
            this.passport=builder.passport;
            this.password=builder.password;
            this.tariffList=builder.tariffList;
            this.contractList=builder.contractList

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return id == builder.id && Objects.equals(firstName, builder.firstName) && Objects.equals(lastName, builder.lastName) && Objects.equals(dateOfBirth, builder.dateOfBirth) && Objects.equals(passport, builder.passport) && Objects.equals(adress, builder.adress) && Objects.equals(email, builder.email) && Objects.equals(password, builder.password) && Objects.equals(tariffList, builder.tariffList) && Objects.equals(contractList, builder.contractList);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, firstName, lastName, dateOfBirth, passport, adress, email, password, tariffList, contractList);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "id=" + id +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", dateOfBirth=" + dateOfBirth +
                    ", passport='" + passport + '\'' +
                    ", adress='" + adress + '\'' +
                    ", email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    ", tariffList=" + tariffList +
                    ", contractList=" + contractList +
                    '}';

    }

}
