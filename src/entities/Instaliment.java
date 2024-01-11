package entities;

import java.util.Date;

public class Instaliment {

	private Date DueDate;
	private Double amount;

	public Instaliment() {
	}

	public Instaliment(Date dueDate, Double amount) {
		DueDate = dueDate;
		this.amount = amount;
	}

	public Date getDueDate() {
		return DueDate;
	}

	public void setDueDate(Date dueDate) {
		DueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

}
