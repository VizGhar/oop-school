package xyz.kandrac;

public class IdCard {

    private IdCard() {
    }

    private String lastName;
    private String firstName;
    private String sex;
    private String dateOfBirth;
    private String ssn;
    private String issuedBy;
    private String publishDate;
    private String expiryDate;
    private String placeOfLiving;
    private String cityOfBirth;

    @Override
    public String toString() {
        return "IdCard{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", sex='" + sex + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", ssn='" + ssn + '\'' +
                ", issuedBy='" + issuedBy + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", placeOfLiving='" + placeOfLiving + '\'' +
                ", cityOfBirth='" + cityOfBirth + '\'' +
                '}';
    }

    public static final class Builder {

        private String lastName;
        private String firstName;
        private String sex;
        private String dateOfBirth;
        private String ssn;
        private String issuedBy;
        private String publishDate;
        private String expiryDate;
        private String placeOfLiving;
        private String cityOfBirth;

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder setSsn(String ssn) {
            this.ssn = ssn;
            return this;
        }

        public Builder setIssuedBy(String issuedBy) {
            this.issuedBy = issuedBy;
            return this;
        }

        public Builder setPublishDate(String publishDate) {
            this.publishDate = publishDate;
            return this;
        }

        public Builder setExpiryDate(String expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }

        public Builder setPlaceOfLiving(String placeOfLiving) {
            this.placeOfLiving = placeOfLiving;
            return this;
        }

        public Builder setCityOfBirth(String cityOfBirth) {
            this.cityOfBirth = cityOfBirth;
            return this;
        }

        public IdCard build() {
            IdCard result = new IdCard();
            result.lastName = this.lastName;
            result.firstName = this.firstName;
            result.sex = this.sex;
            result.dateOfBirth = this.dateOfBirth;
            result.ssn = this.ssn;
            result.issuedBy = this.issuedBy;
            result.publishDate = this.publishDate;
            result.expiryDate = this.expiryDate;
            result.placeOfLiving = this.placeOfLiving;
            result.cityOfBirth = this.cityOfBirth;
            return result;
        }
    }
}
