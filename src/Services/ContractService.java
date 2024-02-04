package Services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	/**
	 * @param onlinePaymentService: Injecao de dependencia
	 */
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	/**
	 * @param months: A quantidade de parcelas determinadas por meio do atributo months
	 * @param basicQuota: eh o valor total do contrato dividido pelo mes, resultando no valor base de 200
	 * @param dueDate: Quando ira vencer a parcela?, a data original do contrato mais o mes da
	 * variavel i utilizando o metodo da biblioteca date para acrescentar + o valor
	 * @param interest: basicQuota mais os meses acrescentados por meio do incremento, isso resulta no juros a cada mes.
	 * @param fee: basicQuota mais o juros resulta na taxa;
	 * @param quota: o resultado de todas as operacoes que sera inserido na classe Installment;
	 */
	public void processContract(Contract contract, Integer months) {

		Double basicQuota = contract.getTotalValue() / months;
		
		for (int i = 1; i <= months; i++) {
		
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			Double interest = onlinePaymentService.interest(basicQuota, i);
			Double fee = onlinePaymentService.paymentFee(basicQuota + interest);
			Double quota = basicQuota + interest + fee;
			
			contract.getInstallment().add(new Installment(dueDate, quota));
			
		}

	}
}