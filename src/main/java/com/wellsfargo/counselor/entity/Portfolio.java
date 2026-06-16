package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private long portfolioId;

    @Column(nullable = false)
    private String portfolioName;

    @Column(nullable = false)
    private LocalDate createdDate;

    @OneToOne
    private Client client;

    protected Portfolio() {
    }

    public Portfolio(String portfolioName,
                     LocalDate createdDate,
                     Client client) {
        this.portfolioName = portfolioName;
        this.createdDate = createdDate;
        this.client = client;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}