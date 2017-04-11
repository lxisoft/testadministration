package com.diviso.servease.controler;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.diviso.servease.entity.Payment;
import com.diviso.servease.repo.PaymentRepo;

public class ServiceControler {
	
	@Autowired
	
	private PaymentRepo paymentrepo;

	@RequestMapping(value="/save",method=RequestMethod.POST,consumes={"multipart/mixed"})
	public @ResponseBody Payment save(Payment pro,MultipartFile file)
	{
	/*	 
		 pro.setNotes(notes);
		 pro.setPayment(payment);
		 pro.setRecepts(recepts);
		 pro.setTotal(total);
		 pro.setTransid(transid);*/
		
		try {
			pro.setReturnmsg(file.getBytes());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
				
		return paymentrepo.save(pro);
	}

	@RequestMapping("/vv")
	public String show()
	{
	
		
	return "hai payment implimentaion complited";
     }
}



