package com.BackEnd.Desafio.repositories;

import com.BackEnd.Desafio.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
