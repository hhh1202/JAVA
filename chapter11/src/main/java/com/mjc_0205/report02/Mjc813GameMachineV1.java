package com.mjc_0205.report02;

public class Mjc813GameMachineV1 {
	private int battery = 0;
	private MarioGame game1;

	public Mjc813GameMachineV1 (int bat, MarioGame game) {
		this.battery = bat;
		this.game1 = game;
	}

	public Mjc813GameMachineV1() {

	}

	public void runGame1() throws BatteryLessThan5Exception, Game1IsNullException {
		if ( battery < 5 ) {
			throw new BatteryLessThan5Exception();
			// 배터리 5% 미만 이라는 예외를 만들어서 던져보세요
			// 예외클래스 이름은 BatteryLessThan5Exception
		}
		if ( game1 == null ){
			throw new Game1IsNullException();
			// game1 소프트웨어가 없다 라는 예외를 만들어서 던져 보세요
			// 예외클래스 이름은 Game1IsNullException
		}
		game1.runGame();
	}
}
