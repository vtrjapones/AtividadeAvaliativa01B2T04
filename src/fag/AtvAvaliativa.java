package fag;

public class AtvAvaliativa {

	public static void main(String[] args) {
		System.out.println("1. Classe ContaBancaria");
		ContaBancaria conta = new ContaBancaria();
		conta.setTitular("Victor H da Motta de Oliveira");
		conta.depositar(2000.0);
		conta.sacar(800.0);
		System.out.println("Saldo final: " + conta.getSaldo());
		System.out.println("n");

		System.out.println("2. Classe Filme");
		Filme filme1 = new Filme("Scarface", 5.0);
		Filme filme2 = new Filme();
		filme2.setTitulo("Interestelar");
		filme2.setAvaliacao(4.8);
		filme1.exibir();
		filme2.exibir();
		System.out.println("n");

		System.out.println("3. Classe Funcionario");
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Isaac Saldanha Araujo");
		funcionario.setSalario(3000.0);
		System.out.println("Salário antes do aumento: " + funcionario.getSalario());
		funcionario.aumentarSalario(10.0);
		System.out.println("Salário depois do aumento: " + funcionario.getSalario());
		System.out.println("n");

		System.out.println("4. Classe Retangulo");
		Retangulo retangulo = new Retangulo();
		retangulo.setLargura(8.0);
		retangulo.setAltura(12.0);
		System.out.println("Área: " + retangulo.area());
		System.out.println("Perímetro: " + retangulo.perimetro());
		System.out.println("n");

		System.out.println("5. Classe Musica");
		Musica musica1 = new Musica();
		musica1.setTitulo("Bohemian Rhapsody");
		musica1.setDuracaoSegundos(355);
		Musica musica2 = new Musica();
		musica2.setTitulo("Stairway to Heaven");
		musica2.setDuracaoSegundos(482);
		System.out.println("Música: " + musica1.getTitulo() + " - Duração: " + musica1.formatarDuracao());
		System.out.println("Música: " + musica2.getTitulo() + " - Duração: " + musica2.formatarDuracao());
		System.out.println("\n");

		System.out.println("6. Classe Pessoa");
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Victor H da Motta de Oliveira");
		pessoa.setPeso(61.5);
		pessoa.setAltura(1.70);
		System.out.printf("IMC: %.2f\n", pessoa.calcularIMC());
		System.out.println("Classificação: " + pessoa.classificacaoIMC());
		System.out.println("\n");

		System.out.println("7. Classe ContaLuz");
		ContaLuz contaLuz = new ContaLuz();
		contaLuz.setConsumoKwh(100.0);
		contaLuz.setValorKwh(1.25);
		System.out.printf("Valor a pagar: R$ %.2f\n", contaLuz.calcularValorTotal());
		System.out.println("\n");

		System.out.println("8. Classe BicicletaAlugada");
		BicicletaAlugada aluguel = new BicicletaAlugada();
		aluguel.setHoras(6);
		aluguel.setValorHora(15.00);
		System.out.printf("Valor final do aluguel: R$ %.2f\n", aluguel.calcularValor());
		System.out.println("\n");

		System.out.println("9. Classe ProdutoEstoque");
		ProdutoEstoque produto = new ProdutoEstoque();
		produto.setNome("Caneta");
		produto.setQuantidade(200);
		produto.adicionarEstoque(50);
		produto.removerEstoque(25);
		System.out.println("Quantidade final em estoque: " + produto.getQuantidade());
		System.out.println("\n");

		System.out.println("10. Classe Temperatura");
		Temperatura temp = new Temperatura();
		temp.setCelsius(35.0);
		System.out.printf("Temperatura em Fahrenheit: %.2f °F\n", temp.paraFahrenheit());
		System.out.printf("Temperatura em Kelvin: %.2f K\n", temp.paraKelvin());
		System.out.println("\n");
	}
}


class ContaBancaria {
	private String titular;
	private double saldo;

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setTitular(String titular) {
		if (titular == null || titular.trim().isEmpty()) {
			System.out.println("Erro: O titular não pode ser vazio.");
		} else {
			this.titular = titular;
		}
	}

	private void setSaldo(double saldo) {
		if (saldo < 0) {
			System.out.println("Erro: O saldo não pode ser negativo.");
		} else {
			this.saldo = saldo;
		}
	}

	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		} else {
			System.out.println("Erro: O valor do depósito deve ser positivo.");
		}
	}

	public void sacar(double valor) {
		if (this.saldo - valor < 0) {
			System.out.println("Erro: Saldo insuficiente para o saque.");
		} else {
			this.saldo -= valor;
		}
	}
}


class Filme {
	private String titulo;
	private double avaliacao;

	public Filme() {
	}

	public Filme(String titulo, double avaliacao) {
		setTitulo(titulo);
		setAvaliacao(avaliacao);
	}

	public String getTitulo() {
		return titulo;
	}

	public double getAvaliacao() {
		return avaliacao;
	}

	public void setTitulo(String titulo) {
		if (titulo == null || titulo.trim().isEmpty()) {
			System.out.println("Erro: O título não pode ser vazio.");
		} else {
			this.titulo = titulo;
		}
	}

	public void setAvaliacao(double avaliacao) {
		if (avaliacao >= 0 && avaliacao <= 5) {
			this.avaliacao = avaliacao;
		} else {
			System.out.println("Erro: A avaliação deve ser entre 0 e 5.");
		}
	}

	public void exibir() {
		System.out.println("Filme: " + this.titulo + " | Avaliação: " + this.avaliacao);
	}
}


class Funcionario {
	private String nome;
	private double salario;

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setNome(String nome) {
		if (nome == null || nome.trim().isEmpty()) {
			System.out.println("Erro: O nome não pode ser vazio.");
		} else {
			this.nome = nome;
		}
	}

	public void setSalario(double salario) {
		if (salario >= 0) {
			this.salario = salario;
		} else {
			System.out.println("Erro: O salário não pode ser negativo.");
		}
	}

	public void aumentarSalario(double percentual) {
		if (percentual > 0) {
			this.salario += this.salario * (percentual / 100.0);
		} else {
			System.out.println("Erro: O percentual de aumento deve ser positivo.");
		}
	}
}


class Retangulo {
	private double largura;
	private double altura;

	public double getLargura() {
		return largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setLargura(double largura) {
		if (largura > 0) {
			this.largura = largura;
		} else {
			System.out.println("Erro: A largura deve ser maior que 0.");
		}
	}

	public void setAltura(double altura) {
		if (altura > 0) {
			this.altura = altura;
		} else {
			System.out.println("Erro: A altura deve ser maior que 0.");
		}
	}

	public double area() {
		return this.largura * this.altura;
	}

	public double perimetro() {
		return 2 * (this.largura + this.altura);
	}
}


class Musica {
	private String titulo;
	private int duracaoSegundos;

	public String getTitulo() {
		return titulo;
	}

	public int getDuracaoSegundos() {
		return duracaoSegundos;
	}

	public void setTitulo(String titulo) {
		if (titulo == null || titulo.trim().isEmpty()) {
			System.out.println("Erro: O título não pode ser vazio.");
		} else {
			this.titulo = titulo;
		}
	}

	public void setDuracaoSegundos(int duracaoSegundos) {
		if (duracaoSegundos > 0) {
			this.duracaoSegundos = duracaoSegundos;
		} else {
			System.out.println("Erro: A duração deve ser maior que 0.");
		}
	}

	public String formatarDuracao() {
		int minutos = this.duracaoSegundos / 60;
		int segundos = this.duracaoSegundos % 60;
		return String.format("%02d:%02d", minutos, segundos);
	}
}


class Pessoa {
	private String nome;
	private double peso;
	private double altura;

	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setNome(String nome) {
		if (nome == null || nome.trim().isEmpty()) {
			System.out.println("Erro: O nome não pode ser vazio.");
		} else {
			this.nome = nome;
		}
	}

	public void setPeso(double peso) {
		if (peso > 0) {
			this.peso = peso;
		} else {
			System.out.println("Erro: O peso deve ser maior que 0.");
		}
	}

	public void setAltura(double altura) {
		if (altura > 0) {
			this.altura = altura;
		} else {
			System.out.println("Erro: A altura deve ser maior que 0.");
		}
	}

	public double calcularIMC() {
		return this.peso / (this.altura * this.altura);
	}

	public String classificacaoIMC() {
		double imc = calcularIMC();
		if (imc < 18.5)
			return "Abaixo do peso";
		else if (imc < 24.9)
			return "Normal";
		else if (imc < 29.9)
			return "Sobrepeso";
		else
			return "Obesidade";
	}
}


class ContaLuz {
	private double consumoKwh;
	private double valorKwh;

	public double getConsumoKwh() {
		return consumoKwh;
	}

	public double getValorKwh() {
		return valorKwh;
	}

	public void setConsumoKwh(double consumoKwh) {
		if (consumoKwh > 0) {
			this.consumoKwh = consumoKwh;
		} else {
			System.out.println("Erro: O consumo em kWh deve ser maior que 0.");
		}
	}

	public void setValorKwh(double valorKwh) {
		if (valorKwh > 0) {
			this.valorKwh = valorKwh;
		} else {
			System.out.println("Erro: O valor por kWh deve ser maior que 0.");
		}
	}

	public double calcularValorTotal() {
		return this.consumoKwh * this.valorKwh;
	}
}


class BicicletaAlugada {
	private int horas;
	private double valorHora;

	public int getHoras() {
		return horas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setHoras(int horas) {
		if (horas >= 1) {
			this.horas = horas;
		} else {
			System.out.println("Erro: O número de horas deve ser no mínimo 1.");
		}
	}

	public void setValorHora(double valorHora) {
		if (valorHora > 0) {
			this.valorHora = valorHora;
		} else {
			System.out.println("Erro: O valor por hora deve ser maior que 0.");
		}
	}

	public double calcularValor() {
		return this.horas * this.valorHora;
	}
}


class ProdutoEstoque {
	private String nome;
	private int quantidade;

	public String getNome() {
		return nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setNome(String nome) {
		if (nome == null || nome.trim().isEmpty()) {
			System.out.println("Erro: O nome não pode ser vazio.");
		} else {
			this.nome = nome;
		}
	}

	public void setQuantidade(int quantidade) {
		if (quantidade >= 0) {
			this.quantidade = quantidade;
		} else {
			System.out.println("Erro: A quantidade não pode ser negativa.");
		}
	}

	public void adicionarEstoque(int qtd) {
		if (qtd > 0) {
			this.quantidade += qtd;
		} else {
			System.out.println("Erro: A quantidade a ser adicionada deve ser positiva.");
		}
	}

	public void removerEstoque(int qtd) {
		if (this.quantidade - qtd < 0) {
			System.out.println("Erro: Estoque insuficiente para remoção.");
		} else {
			this.quantidade -= qtd;
		}
	}
}


class Temperatura {
	private double celsius;

	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		if (celsius >= -273.15) {
			this.celsius = celsius;
		} else {
			System.out.println("Erro: A temperatura não pode ser menor que o zero absoluto (-273.15 °C).");
		}
	}

	public double paraFahrenheit() {
		return (this.celsius * 9.0 / 5.0) + 32;
	}

	public double paraKelvin() {
		return this.celsius + 273.15;
	}
}