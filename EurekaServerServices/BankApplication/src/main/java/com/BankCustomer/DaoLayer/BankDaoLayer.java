package com.BankCustomer.DaoLayer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BankCustomer.Model.BankModal;

public interface BankDaoLayer extends JpaRepository<BankModal, Long>{

}
