package model.entities;

import java.time.LocalDate;

public class Installment {
	
//	Classe criada para implementação das parcelas.
//	Cada instância será uma parcela.
	
	private LocalDate dueDate;
	private Double amount;
	
	public Installment() {
	}

	public Installment(LocalDate dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
