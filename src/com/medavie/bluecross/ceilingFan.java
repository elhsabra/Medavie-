package com.medavie.bluecross;

import java.util.Calendar;

public class ceilingFan {

	private static final int  dayOFF=25;
	private static final int  monthOFF=25;
	private enum Direction{
		RIGHT,
		LEFT;
	};
	private int speed ;
	private Direction direction;
	

	public int getSpeed() {
		return speed;
	}
	
	public Direction getDirection() {
		return direction;
	}
	
	public void setSpeed(int newSpeed) {
		this.speed=newSpeed;
	}
	
	public void setDirection(Direction newDirection) {
		this.direction=newDirection;
	}
	
	public void directionSetting(Direction currentDirection) {
		if (currentDirection == Direction.RIGHT) {
			currentDirection=Direction.LEFT ;}
		else {
			currentDirection=Direction.RIGHT;
		}
		}

	public void speedAndDirectionSetting(int speed,Direction currentDirection) {
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH);
		if (speed == 3 || (day==dayOFF && month==monthOFF) ) {
			speed = 0;
			directionSetting(currentDirection);
		} else {
			speed++;
		}
	}

		
}
