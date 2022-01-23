package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;
import tests.factory.FinancingFactory;

public class FinancingTest {
	
	@Test
	public void constructorShouldCreateObjectsWhenValidDatas() {
		
		Financing fin = FinancingFactory.createValidFinancing();
		
		Assertions.assertTrue(fin.getTotalAmount() == 100000.0);
		Assertions.assertTrue(fin.getIncome() == 2000.0);
		Assertions.assertTrue(fin.getMonths() == 80.0);

	}
	
	@Test
	public void constructorShouldThrowExceptionWhenInvalidDatas() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			FinancingFactory.createInvalidFinancing();
			
		});
	}
	
	@Test
	public void setTotalAmountShouldAtualizeWhenValidDatas() {
		
		double expectedValue = 80000.0;
		Financing fin = FinancingFactory.createValidFinancing();
		fin.setTotalAmount(80000.0);
		
		Assertions.assertEquals(expectedValue, fin.getTotalAmount());
	}
	
	@Test
	public void setTotalAmountShouldThrowExceptionWhenInvalidDatas() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			Financing fin = FinancingFactory.createValidFinancing();
			fin.setTotalAmount(200000.0);
			
		});
	}
	
	@Test
	public void setIncomeShouldAtualizeWhenValidDatas() {
		
		double expectedValue = 2500.0;
		Financing fin = FinancingFactory.createValidFinancing();
		fin.setIncome(2500.0);
		
		Assertions.assertEquals(expectedValue, fin.getIncome());
	}
	
	
	@Test
	public void setIncomeShouldThrowExceptionWhenInvalidDatas() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			Financing fin = FinancingFactory.createValidFinancing();
			fin.setIncome(1000.0);
			
		});
	}
	
	@Test
	public void setMonthsShouldAtualizeWhenValidDatas() {
		
		Integer expectedValue = 90;
		Financing fin = FinancingFactory.createValidFinancing();
		fin.setMonths(90);
		
		Assertions.assertEquals(expectedValue, fin.getMonths());
	
	}
	
	@Test
	public void setMonthsShouldThrowExceptionWhenInvalidDatas() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			Financing fin = FinancingFactory.createValidFinancing();
			fin.setMonths(1);
			
			
		} );
		
	}
	
	@Test
	public void entryValueShouldCalculateCorrectly() {
		
		double expectedValue = 20000.0;
		Financing fin = FinancingFactory.createValidFinancing();
		double entryValue = fin.entry();
		
		Assertions.assertEquals(expectedValue, entryValue);
	}
	
	@Test
	public void quotaValueShouldCalculateCorrectly() {
		
		double expectedValue = 1000.0;
		Financing fin = FinancingFactory.createValidFinancing();
		double quotaValue = fin.quota();
		
		Assertions.assertEquals(expectedValue, quotaValue);
	}
	
	

}
