package org.axteel.lab2;

import java.util.UUID;

public class Loan {
    private String uuid;
    private String description;
    private Double amount;

    public Loan(String description, Double amount) {
        uuid = UUID.randomUUID().toString();
        this.description = description;
        this.amount = amount;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Loan {" +
                "uuid='" + uuid + '\'' +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                '}';
    }
}
