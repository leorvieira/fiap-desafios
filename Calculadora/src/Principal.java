import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		JTextField fator1 = new JTextField();
		JTextField fator2 = new JTextField();
		JTextField operacao = new JTextField();

		
		Object[] message = {"fator 1", fator1 , "fator 2" , fator2, "Operação (+, -, *, /) ", operacao};		
	
		
		System.out.println(JOptionPane.showInputDialog(  null, message, null ));
		String f1 = fator1.getText();
		int i1 = Integer.parseInt(f1);
		String f2 = fator2.getText();
		int i2 = Integer.parseInt(f2);
		String o1 = operacao.getText();
		Calculadora calculadora = new Calculadora();
		float resultado = 0;
		if (o1.contentEquals("+") ) {
			resultado = calculadora.somar(i1, i2);
		}		
		if (o1.contentEquals("-")) {
			resultado = calculadora.diminuir(i1, i2);
		}
		if (o1.contentEquals("*")) {
			resultado = calculadora.multiplicar(i1, i2);
		}
		if (o1.contentEquals("/")) {
			resultado = calculadora.dividir(i1, i2);
		}
		System.out.println("resultado = " + resultado );

		String result = String.valueOf(resultado);
		
		JOptionPane.showMessageDialog(null, result);
		
		
		
		
	}

}
