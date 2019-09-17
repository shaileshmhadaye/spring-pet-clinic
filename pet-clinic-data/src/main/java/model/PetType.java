package model;

public class PetType extends BaseEntity{
    private String name;

    public PetType(Long id, String name) {
        super(id);
        this.name = name;
    }
}
