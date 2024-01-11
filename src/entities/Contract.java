package entities;

import java.util.Date;
import java.util.List;

public class Contract {

	private Integer number;
	private Date date;
	private Double totalValue;

	private List<Instaliment> instaliment;

	public Contract(Integer number, Date date, Double totalValue, List<Instaliment> instaliment) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
		this.instaliment = instaliment;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Instaliment> getInstaliment() {
		return instaliment;
	}

}
