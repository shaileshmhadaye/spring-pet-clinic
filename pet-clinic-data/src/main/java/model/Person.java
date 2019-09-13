package model;

public class Person extends BaseEntity{
    private String firstname;
    private String lastname;

    public Person(Long id, String firstname, String lastname) {
        super(id);
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
