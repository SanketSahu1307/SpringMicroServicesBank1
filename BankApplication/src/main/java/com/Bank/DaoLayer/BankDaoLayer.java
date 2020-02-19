package com.Bank.DaoLayer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bank.Model.BankModal;

public interface BankDaoLayer extends JpaRepository<BankModal, Long>{

}
