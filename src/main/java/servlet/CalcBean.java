package servlet;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CalcBean {	
	private String num1,num2,operator;
	private int result;
	
	public void calculate() {
		this.num1 = this.num1==null? "0" : this.num1;
		this.num2 = this.num2==null? "0" : this.num2;
		this.operator = this.operator==null? "+" : this.operator;	
		
		Calc newCalc=new Calc(Integer.parseInt(this.num1),Integer.parseInt(this.num2),this.operator);
		this.result = newCalc.getResult();
		
		Map<String,BinaryOperator<Integer>> calcMap = new HashMap<>();
		calcMap.put("+",(a,b)-> a+b);
		calcMap.put("-",(a,b)-> a-b);
		calcMap.put("*",(a,b)-> a*b);
		calcMap.put("/",(a,b)-> a/b);
		
		this.result = calcMap.get(this.operator).apply(Integer.parseInt(this.num1), Integer.parseInt(this.num2));
	}

}
