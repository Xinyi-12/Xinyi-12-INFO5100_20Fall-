package edu.neu.info5100.assignment03.assignment03;


public class Professor {

    private String firstName;

    private String lastName;

    private Integer id;

    @Override
    public String toString() {
        return "Professor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

    private Professor(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.id = builder.id;
    }

    public static final class Builder{
        private String firstName;

        private String lastName;

        private Integer id;

        public Builder() {
        }

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Professor build(){
            return new Professor(this);
        }

    }
}

