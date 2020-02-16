package com.BankCustomer.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.BankCustomer.Model.BankModal;
import com.BankCustomer.ServiceLayer.BankService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class BankController {
	
	@Autowired 
	BankService bankServe;
	
	@GetMapping("/teeli")
	public String gethellomsg() {
		return "hello Sanket";
	}
	
	@PostMapping(value = "/customer/save")
	private BankModal savingDetail(@RequestBody BankModal bankModal) {
		return bankServe.createService(bankModal);
	}
	
	@GetMapping(value = "/customer/detail")
	private List<BankModal> getDetail() {
		return bankServe.getService();
	}
	
	@DeleteMapping(value = "/customer/delete/{id}")
	private void deleteDetail(@PathVariable("id")Long id) {
		bankServe.getDeleteDetailId(id);
		return;
	}
	
	@PutMapping(value = "/customer/update")
	private BankModal getUpdateById(@RequestBody BankModal bankModal) {
			return bankServe.getUpdateById(bankModal);
	}
	
	@GetMapping(value = "/customer/detail/{id}")
	private Optional<BankModal> getDetailById(@PathVariable("id") Long id) {
		return bankServe.getOneId(id);
	}
}
