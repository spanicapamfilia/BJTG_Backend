package org.example.repository;

import org.example.model.CardData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepoCard extends JpaRepository<CardData, String> {
    List<CardData> findAllById(String cardnumber, String cardholder, String expirydate, String securitycode);
}
