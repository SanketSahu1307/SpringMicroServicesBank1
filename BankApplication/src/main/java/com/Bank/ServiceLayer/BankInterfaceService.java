package com.Bank.ServiceLayer;

import java.util.List;
import java.util.Optional;

import com.Bank.Model.BankModal;

public interface BankInterfaceService {
	
	public BankModal createService(BankModal bankModal);
	
	public List<BankModal> getService();
	
	public void getDeleteDetailId(Long id);
	
	public BankModal getUpdateById(BankModal bankModal);

}
