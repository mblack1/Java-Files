package purchasearray;

public class Purchase {
	   private static int invoiceNum;
	   private static int saleAmount;
	   float salesTax;
	   public void setsaleAmount(int amount) {
	      saleAmount = amount + (int)(0.05*amount);
	   }
	   
	   public void setinvoiceNum(int invoice) {
	      invoiceNum = invoice;
	   }
	   
	   public int getsaleAmount() {
	      return saleAmount;
	   }
	   
	   public int getinvoiceNum() {
	      return invoiceNum;
	   }
	   
	   public void displayDetails() {
	      System.out.println("Invoice number: " + invoiceNum);
	      System.out.println("Sale Amount: " + saleAmount);
	      System.out.println("Sales Tax: 5%");
	   }
	}