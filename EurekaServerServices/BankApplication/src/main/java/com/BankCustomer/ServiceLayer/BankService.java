package com.BankCustomer.ServiceLayer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.BankCustomer.DaoLayer.BankDaoLayer;
import com.BankCustomer.Model.BankModal;

@Service
@Transactional
public class BankService implements BankInterfaceService {
	
	@Autowired
	BankDaoLayer bankDao;

	@Override
	public BankModal createService(BankModal bankModal) {
		return bankDao.save(bankModal);
	}

	public List<BankModal> getService() {
		return bankDao.findAll();
	}

	public void getDeleteDetailId(Long id) {
		  bankDao.deleteById(id);
	}

	public BankModal getUpdateById(BankModal bankModal) {
		return bankDao.save(bankModal);
	}

	public Optional<BankModal> getOneId(Long id) {
		return bankDao.findById(id);
	}

}
