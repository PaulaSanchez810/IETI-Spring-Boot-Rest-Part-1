package co.edu.escuelaing.ieti.data;

import java.util.Date;

public class User {

    private String id, name, email, lastName;
    private Date createdAt;

    public User( String id, String name, String lastName, Date createdAt) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.createdAt = createdAt;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
