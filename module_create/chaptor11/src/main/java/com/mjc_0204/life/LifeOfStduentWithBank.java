package com.mjc_0204.life;

import com.mjc_0204.banking.BankAccount;
import com.mjc_0204.banking.MachineNotWorkingException;
import com.mjc_0204.banking.SendMachine;
import com.mjc_0204.student.Student;

public class LifeOfStduentWithBank {
	public void doToday() {
		Student lsh = new Student("이승협", "lsh2928");
		Student cwc = new Student("최원철", "csc9292");

		BankAccount ba1 = new BankAccount("1111-1111-11", "이승협");
		BankAccount ba2 = new BankAccount("222-222-2222", "최원철");

		StudentHasBankAccount lshBank = new StudentHasBankAccount(lsh, ba1);
		StudentHasBankAccount cwcBank = new StudentHasBankAccount(cwc, ba2);

		this.sendMoney(lshBank, cwcBank, 100000);
		this.sendMoney(cwcBank, lshBank, 5000);
	}

	public void sendMoney(StudentHasBankAccount from, StudentHasBankAccount to, int money) {
		// 원하는 곳에 예외처리 하세요
		SendMachine sm = new SendMachine();

		from.outcome(money);
		// from 뱅크에서 money 를 빼낸다.
		// 과제
		try {
			if (sm.isActive()) {

				to.income(money);
				// to 뱅크로 money 를 추가한다.
				// 과제
			}
		} catch (MachineNotWorkingException e) {
			System.out.println(e.getMessage());
			from.income(money);
		}
	}
}
