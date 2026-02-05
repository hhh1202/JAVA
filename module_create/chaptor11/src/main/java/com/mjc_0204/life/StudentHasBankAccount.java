package com.mjc_0204.life;

import com.mjc_0204.banking.BankAccount;
import com.mjc_0204.student.Student;
import com.mjc_0204.student.Student;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class StudentHasBankAccount {
	private final Student student;
	private final BankAccount bankAccount;

	/**
	 * 계좌에 돈을 입금한다.
	 * @param money
	 */
	public void income(int money) {
//		int current = bankAccount.getMoney();
//		bankAccount.setMoney(current + money);
//		System.out.println( money + "원을 입급하였습니다.");

		bankAccount.setMoney( bankAccount.getMoney() + money );
	}

	/**
	 * 계좌에서 돈을 출금한다.
	 * @param money
	 */
	public int outcome(int money) {
//		int current = bankAccount.getMoney();
//		bankAccount.setMoney(current - money);
//		System.out.println( money + "원을 출금하였습니다.");
//		return bankAccount.getMoney();
		bankAccount.setMoney( bankAccount.getMoney() - money );
		return bankAccount.getMoney();
	}

	/**
	 * 계좌의 현재 금액을 리턴한다.
	 * @return
	 */
	public int getCurrentMoney() {
//		return bankAccount.getMoney();
		return this.bankAccount.getMoney();
	}
}
