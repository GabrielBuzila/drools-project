package com.tests;

import com.entities.CustomerProduct;
import com.entities.Fico;
import com.entities.GeneralCosts;
import com.entities.History;
import com.entities.Payment;
import com.entities.PotentialCustomer;
import com.entities.Product;
import com.enums.CreditType;
import com.enums.MaritalStatus;
import com.enums.Status;

import java.text.ParseException;
import java.time.LocalDate;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Test {
	public static final void main(String[] args) throws ParseException {
		KieServices ks = KieServices.Factory.get();
		KieContainer kC = ks.getKieClasspathContainer();

		
		//Rule 1		
		GeneralCosts gc1 = new GeneralCosts();
		gc1.setCommision(2.0);
		gc1.setRegisterTaxRNPM(2.0);

		Fico fico1 = new Fico();

		PotentialCustomer pc1 = new PotentialCustomer("A", 31, "RO", MaritalStatus.SINGLE, 5, 20.000, 0, 2.4,
				Status.ACCEPTED, gc1);
		
		fico1.setTotal(801);
		fico1.setPotentialCustomer(pc1);
		fico1.setPromptSc(100);
		
		//Rule 2
		GeneralCosts gc2 = new GeneralCosts();
		gc2.setCommision(2.0);
		gc2.setRegisterTaxRNPM(2.0);

		Fico fico2 = new Fico();

		PotentialCustomer pc2 = new PotentialCustomer("B", 27, "RO", MaritalStatus.SINGLE, 5, 20.000, 0, 2.4,
				Status.ACCEPTED, gc2);
		fico2.setTotal(399);
		fico2.setPotentialCustomer(pc2);
		fico2.setPromptSc(100);
		
		//Rule 3 & Rule 4
		GeneralCosts gc34 = new GeneralCosts();
		gc34.setCommision(2.0);
		gc34.setRegisterTaxRNPM(2.0);
		
		Fico fico34 = new Fico();
		
		PotentialCustomer pc34 = new PotentialCustomer("C", 35, "RO", MaritalStatus.SINGLE, 5, 20.000, 0, 2.4,
				Status.ACCEPTED, gc34);
		fico34.setTotal(456);
		fico34.setPotentialCustomer(pc34);
		fico34.setPromptSc(100);
		
		History h34 = new History(pc34, false, 2, 20.00);
		
		//Rule 5
		GeneralCosts gc5 = new GeneralCosts();
		gc5.setCommision(2.0);
		gc5.setRegisterTaxRNPM(2.0);
		
		Fico fico5 = new Fico();
		
		PotentialCustomer pc5 = new PotentialCustomer("D", 18, "RO", MaritalStatus.SINGLE, 5, 20.000, 0, 2.4,
				Status.ACCEPTED, gc5);
		fico5.setTotal(456);
		fico5.setPotentialCustomer(pc5);
		fico5.setPromptSc(100);
		
		Product p5 = new Product(CreditType.NEVOI_PERSONALE, 100000.00);
		
		CustomerProduct cp5 = new CustomerProduct(pc5, p5, 10.00, 10.00, 10.00, 60);
		
		//Rule 6
		GeneralCosts gc6 = new GeneralCosts();
		gc6.setCommision(2.0);
		gc6.setRegisterTaxRNPM(2.0);
		
		Fico fico6 = new Fico();
		
		PotentialCustomer pc6 = new PotentialCustomer("E", 40, "RO", MaritalStatus.SINGLE, 5, 20.000, 0, 2.4,
				Status.ACCEPTED, gc6);
		fico6.setTotal(810);
		fico6.setPotentialCustomer(pc6);
		fico6.addCustomer(pc6);
		fico6.setPromptSc(100);
		
		//Rule 7
		GeneralCosts gc7 = new GeneralCosts();
		gc7.setCommision(2.0);
		gc7.setRegisterTaxRNPM(2.0);
		
		Fico fico7 = new Fico();
		
		PotentialCustomer pc7 = new PotentialCustomer("F", 40, "RO", MaritalStatus.SINGLE, 5, 20.000, 0, 2.4,
				Status.ACCEPTED, gc7);
		fico7.setTotal(810);
		fico7.setPotentialCustomer(pc7);
		fico7.setPromptSc(100);
		
		//Rule 8
		GeneralCosts gc8 = new GeneralCosts();
		gc8.setCommision(2.0);
		gc8.setRegisterTaxRNPM(2.0);
		
		Fico fico8 = new Fico();
		
		PotentialCustomer pc8 = new PotentialCustomer("G", 35, "RO", MaritalStatus.SINGLE, 5, 20.000, 0, 2.4,
				Status.ACCEPTED, gc8);
		fico8.setTotal(456);
		fico8.setPotentialCustomer(pc8);
		fico8.setPromptSc(100);
		
		History h8 = new History(pc8, true, 2, 20.00);
		
		//Rule 9
		GeneralCosts gc9 = new GeneralCosts();
		gc9.setCommision(2.0);
		gc9.setRegisterTaxRNPM(2.0);
		
		Fico fico9 = new Fico();
		
		PotentialCustomer pc9 = new PotentialCustomer("H", 50, "RO", MaritalStatus.SINGLE, 5, 20.000, 0, 2.4,
				Status.ACCEPTED, gc9);
		fico9.setTotal(456);
		fico9.setPotentialCustomer(pc9);
		fico9.setPromptSc(100);
		
		Product p9 = new Product(CreditType.NEVOI_PERSONALE, 100000.00);
		
		CustomerProduct cp9 = new CustomerProduct(pc9, p9, 10.00, 10.00, 10.00, 60);
		
		//Rule 10
		GeneralCosts gc10 = new GeneralCosts();
		gc10.setCommision(2.0);
		gc10.setRegisterTaxRNPM(2.0);
		
		Fico fico10 = new Fico();
		
		PotentialCustomer pc10 = new PotentialCustomer("I", 44, "RO", MaritalStatus.WIDOW, 5, 20.000, 0, 2.4,
				Status.ACCEPTED, gc10);
		fico10.setTotal(456);
		fico10.setPotentialCustomer(pc10);
		fico10.setPromptSc(100);
		
		Product p10 = new Product(CreditType.NEVOI_PERSONALE, 100000.00);
		
		CustomerProduct cp10 = new CustomerProduct(pc10, p10, 10.00, 10.00, 10.00, 40);
		
		Payment pay10 = new Payment(1000.00, LocalDate.now(), LocalDate.now(), 40);
		
		//Rule 11
		GeneralCosts gc11 = new GeneralCosts();
		gc11.setCommision(2.0);
		gc11.setRegisterTaxRNPM(2.0);
		
		Fico fico11 = new Fico();
		
		PotentialCustomer pc11 = new PotentialCustomer("J", 33, "RO", MaritalStatus.WIDOW, 5, 20.000, 0, 2.4,
				Status.ACCEPTED, gc11);
		fico11.setTotal(456);
		fico11.setPotentialCustomer(pc11);
		fico11.setPromptSc(100);
		
		Payment pay11 = new Payment(1000.00, LocalDate.now().plusDays(10), LocalDate.now(), 40);
		
		//Rule 12
		GeneralCosts gc12 = new GeneralCosts();
		gc12.setCommision(2.0);
		gc12.setRegisterTaxRNPM(2.0);
		
		Fico fico12 = new Fico();
		
		PotentialCustomer pc12 = new PotentialCustomer("K", 35, "RO", MaritalStatus.SINGLE, 5, 20.000, 0, 2.4,
				Status.ACCEPTED, gc12);
		fico12.setTotal(456);
		fico12.setPotentialCustomer(pc12);
		fico12.setPromptSc(100);
		
		History h12 = new History(pc8, true, 0, 20.00);
		
		//Rule 13
		GeneralCosts gc13 = new GeneralCosts();
		gc13.setCommision(2.0);
		gc13.setRegisterTaxRNPM(2.0);
		
		Fico fico13 = new Fico();
		
		PotentialCustomer pc13 = new PotentialCustomer("L", 35, "RO", MaritalStatus.SINGLE, 5, 20.000, 0, 2.4,
				Status.ACCEPTED, gc13);
		fico13.setTotal(456);
		fico13.setPotentialCustomer(pc13);
		fico13.setPromptSc(100);
		
		History h13 = new History(pc13, true, 0, 6000.00);
		
		//Rule 14 
		GeneralCosts gc14 = new GeneralCosts();
		gc14.setCommision(2.0);
		gc14.setRegisterTaxRNPM(2.0);

		Fico fico14 = new Fico();

		PotentialCustomer pc14 = new PotentialCustomer("M", 31, "RO", MaritalStatus.SINGLE, 5, 20.000, 5, 2.4,
				Status.ACCEPTED, gc14);
		
		fico14.setTotal(801);
		fico14.setPotentialCustomer(pc14);
		fico14.setPromptSc(100);
		
		//Rule 15
		GeneralCosts gc15 = new GeneralCosts();
		gc15.setCommision(2.0);
		gc15.setRegisterTaxRNPM(2.0);
		
		Fico fico15 = new Fico();
		
		PotentialCustomer pc15 = new PotentialCustomer("N", 78, "RO", MaritalStatus.WIDOW, 5, 20.000, 0, 2.4,
				Status.ACCEPTED, gc15);
		fico15.setTotal(456);
		fico15.setPotentialCustomer(pc15);
		fico15.setPromptSc(100);
		
		Payment pay15 = new Payment(1000.00, LocalDate.now().plusDays(10), LocalDate.now(), 40);
		
//****************************************************************************************************
		//Rule 1
		KieSession kSession1 = kC.newKieSession("ksession-rules");
		kSession1.insert(gc1);
		kSession1.insert(fico1);
		kSession1.insert(pc1);
		
		kSession1.fireAllRules();
		kSession1.dispose();
		
		//Rule 2
		KieSession kSession2 = kC.newKieSession("ksession-rules");
		kSession2.insert(gc2);
		kSession2.insert(fico2);
		kSession2.insert(pc2);
		
		kSession2.fireAllRules();
		kSession2.dispose();
		
		//Rule 3 & 4
		KieSession kSession34 = kC.newKieSession("ksession-rules");
		kSession34.insert(gc34);
		kSession34.insert(fico34);
		kSession34.insert(pc34);
		kSession34.insert(h34);
		
		kSession34.fireAllRules();
		kSession34.dispose();
		
		//Rule 5
		KieSession kSession5 = kC.newKieSession("ksession-rules");
		kSession5.insert(gc5);
		kSession5.insert(fico5);
		kSession5.insert(pc5);
		kSession5.insert(cp5);
		
		kSession5.fireAllRules();
		kSession5.dispose();
		
		//Rule 6
		KieSession kSession6 = kC.newKieSession("ksession-rules");
		kSession6.insert(gc6);
		kSession6.insert(fico6);
		kSession6.insert(pc6);
		
		kSession6.fireAllRules();
		kSession6.dispose();
		
		//Rule 7
		KieSession kSession7 = kC.newKieSession("ksession-rules");
		kSession7.insert(gc7);
		kSession7.insert(fico7);
		kSession7.insert(pc7);
		
		kSession7.fireAllRules();
		kSession7.dispose();
		
		//Rule 8
		KieSession kSession8 = kC.newKieSession("ksession-rules");
		kSession8.insert(gc8);
		kSession8.insert(fico8);
		kSession8.insert(pc8);
		kSession8.insert(h8);
		
		kSession8.fireAllRules();
		kSession8.dispose();
		
		//Rule 9
		KieSession kSession9 = kC.newKieSession("ksession-rules");
		kSession9.insert(gc9);
		kSession9.insert(fico9);
		kSession9.insert(pc9);
		kSession9.insert(cp9);
		
		kSession9.fireAllRules();
		kSession9.dispose();
		
		//Rule 10
		KieSession kSession10 = kC.newKieSession("ksession-rules");
		kSession10.insert(gc10);
		kSession10.insert(fico10);
		kSession10.insert(pc10);
		kSession10.insert(cp10);
		kSession10.insert(pay10);
		
		kSession10.fireAllRules();
		kSession10.dispose();
		
		//Rule 11
		KieSession kSession11 = kC.newKieSession("ksession-rules");
		kSession11.insert(gc11);
		kSession11.insert(fico11);
		kSession11.insert(pc11);
		kSession11.insert(pay11);
		
		kSession11.fireAllRules();
		kSession11.dispose();

		//Rule 12
		KieSession kSession12 = kC.newKieSession("ksession-rules");
		kSession12.insert(gc12);
		kSession12.insert(fico12);
		kSession12.insert(pc12);
		kSession12.insert(h12);
		
		kSession12.fireAllRules();
		kSession12.dispose();
		
		//Rule 13
		KieSession kSession13 = kC.newKieSession("ksession-rules");
		kSession13.insert(gc13);
		kSession13.insert(fico13);
		kSession13.insert(pc13);
		kSession13.insert(h13);
		
		kSession13.fireAllRules();
		kSession13.dispose();
		
		//Rule 14
		KieSession kSession14 = kC.newKieSession("ksession-rules");
		kSession14.insert(gc14);
		kSession14.insert(fico14);
		kSession14.insert(pc14);
		
		kSession14.fireAllRules();
		kSession14.dispose();
		
		//Rule 15
		KieSession kSession15 = kC.newKieSession("ksession-rules");
		kSession15.insert(gc15);
		kSession15.insert(fico15);
		kSession15.insert(pc15);
		kSession15.insert(pay15);
		
		kSession15.fireAllRules();
		kSession15.dispose();
	}
}