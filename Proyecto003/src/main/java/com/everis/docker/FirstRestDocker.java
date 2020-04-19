import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class FirstRestDocker{
	
	@RequestMapping("/helloDocker")
	String helloDocker(){
		return "Hi Developper this is my first example!!!!!";
	}
	
	@RequestMapping("/sumar/{operando1}/{operando2}")
	String sumar(@PathVariable("operando1") String operando1,@PathVariable("operando2") String operando2){
		String resultado = "";
		double oper1 = Double.parseDouble(operando1);
		double oper2 = Double.parseDouble(operando2);
		double result = oper1 + oper2;
		resultado = String.valueOf(result);
		return resultado;
	}
	
	@RequestMapping("/restar/{operando1}/{operando2}")
	String restar(@PathVariable("operando1") String operando1,@PathVariable("operando2") String operando2){
		String resultado = "";
		double oper1 = Double.parseDouble(operando1);
		double oper2 = Double.parseDouble(operando2);
		double result = oper1 - oper2;
		resultado = String.valueOf(result);
		return resultado;
	}
	
	@RequestMapping("/multiplicar/{operando1}/{operando2}")
	String multiplicar(@PathVariable("operando1") String operando1,@PathVariable("operando2") String operando2){
		String resultado = "";
		double oper1 = Double.parseDouble(operando1);
		double oper2 = Double.parseDouble(operando2);
		double result = oper1*oper2;
		resultado = String.valueOf(result);
		return resultado;
	}	
	
	@RequestMapping("/dividir/{operando1}/{operando2}")
	String dividir(@PathVariable("operando1") String operando1,@PathVariable("operando2") String operando2){
		String resultado = "";
		double oper1 = Double.parseDouble(operando1);
		double oper2 = Double.parseDouble(operando2);
		double result = oper1/oper2;
		resultado = String.valueOf(result);
		return resultado;
	}
	
	public static void main(String[] args) throws Exception{
		SpringApplication.run(FirstRestDocker.class, args);
	}
	
}