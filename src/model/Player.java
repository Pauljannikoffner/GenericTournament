package model;

public class Player {

    private String surname;
    private String lastName;
    private Integer rating;

    public Player(String surname, String lastName, Integer dwz) {
        this.surname = surname;
        this.lastName = lastName;
        this.rating = dwz;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDwz() {
        return rating;
    }

    public void setDwz(Integer dwz) {
        this.rating = dwz;
    }

    @Override
    public String toString() {
        if (rating != null) {
            return "surname " + "lastName " + "DWZ: " + rating;
        } else {
            return "surname " + "lastName";
        }
    }
}
