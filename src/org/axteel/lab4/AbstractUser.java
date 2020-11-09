package org.axteel.lab4;

public class AbstractUser {
    private Long id;

    AbstractUser(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
