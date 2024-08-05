package com.citi.core.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public final class MyImmutable {
    private final String name;
    private final Date dob; // mutable
    private final List<String> mailId;
    private final Address address;

    public MyImmutable(String name, Date dob, List<String> mailId, Address address) {
        this.name = name;
        this.dob = dob;
        this.mailId = mailId;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return (Date) dob.clone();
    }

    public List<String> getMailId() {
        return new ArrayList<>(mailId);
    }

    public Address getAddress() {
        return new Address(address.getCity(), address.getZip());
    }

    @Override
    public String toString() {
        return "MyImmutable{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", mailId=" + mailId +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {

        Address address = new Address("pune", "411014");

        MyImmutable myImmutable = new MyImmutable(
                "shorav",
                new Date(),
                Arrays.stream(new String[]{"1234@gmail.com", "abc@gmail.com"}).collect(Collectors.toList()),
                address);

        System.out.println(myImmutable);

        //myImmutable.name = "sharma"; // Cannot assign a value to final variable 'name'

        myImmutable.getDob().setDate(25);
        System.out.println(myImmutable);

        myImmutable.getMailId().add("5678@gmail.com");
        System.out.println(myImmutable);

        myImmutable.getAddress().setCity("Noida");
        System.out.println(myImmutable);
    }
}
