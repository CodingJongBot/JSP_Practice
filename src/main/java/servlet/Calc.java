package servlet;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Calc {
	private int result = 0;
	
	
	public Calc(int num1,int num2,String op) {

		if(op.equals("+")){
			this.result = num1+num2;
		}
		else if(op.equals("-") ){
			this.result = num1-num2;
		}
		else if(op.equals("*") ){
			this.result = num1*num2;
		}
		else if(op.equals("/") ){
			this.result = num1/num2;
		}
	}
	
}
