package com.ironhack.classes;

public class Contact extends Lead{
    private static int counter2 = 0;

    public Contact(String name, Long phoneNumber, String email, String companyName) {
        super(name, phoneNumber, email, companyName);
        this.id = counter2++;
    }

    @Override
    public String toString() {
        return "Contact: id = " + getId() + ", name = " + getName() + ", phoneNumber = " + getPhoneNumber() +
                ", email = " + getEmail() + ", companyName = " + getCompanyName() + "\n";
    }
}
