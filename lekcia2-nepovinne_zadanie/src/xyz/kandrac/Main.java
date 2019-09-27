package xyz.kandrac;

public class Main {

    public static void main(String[] args) {
        IdCard idCard = new IdCard.Builder()
                .setLastName("Jozef")
                .setFirstName("Holy")
                .setSex("M")
                .setCityOfBirth("Trencin")
                .setDateOfBirth("30.3.3000")
                .setExpiryDate("30.3.3300")
                .setIssuedBy("Ilava")
                .setPlaceOfLiving("Nova Dubnica")
                .setSsn("090889887777")
                .setPublishDate("30.3.3000")
                .build();

        System.out.println("Id Card details: " + idCard.toString());
    }
}
