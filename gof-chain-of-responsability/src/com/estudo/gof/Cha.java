package com.estudo.gof;

public class Cha {
	public static void main(String[] args) {
		new Cha().gerenciar();
	}

	public void gerenciar() {
		WebServer wp = new WebServer("WS Principal");
		WebServer primeiro = new WebServer("WS1");
		wp.add(primeiro);
		wp.add(new WebServer("WS2"));
		wp.add(primeiro);

		Rede[] redes = { new Linux(), new Linux(), new Microsoft() };
		for (Rede rede : redes) {
			wp.handle(rede);
		}
	}
}
