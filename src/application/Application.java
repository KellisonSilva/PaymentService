package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Services.ContractService;
import Services.PayPalService;
import entities.Contract;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados do contrato:");
		System.out.print("Numero: ");
		Integer num = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		Double totalValue = sc.nextDouble();

		Contract obj = new Contract(num, date, totalValue);

		System.out.print("Entre com as parcelas: ");
		int installments = sc.nextInt();

		ContractService contractService = new ContractService(new PayPalService());
		contractService.processContract(obj, installments);

		System.out.println("PARCELAS: ");
		obj.getInstallment().forEach(System.out::print);

		sc.close();
	}

}
