package com.estudo.gof;

public class WebServer {
	private WebServer next;
	private String nome;

	public WebServer(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "WebServer: " + nome;
	}

	public void add(WebServer nextWS) {
		if (next != null) {
			next.add(nextWS);
		} else {
			next = nextWS;
		}
	}

	public void wrapAround(WebServer firstWS) {
		if (next != null) {
			next.wrapAround(firstWS);
		} else {
			next = firstWS;
		}
	}

	public void handle(Rede rede) {
		if ((int) (Math.random() * 4) % 2 == 0) {
			System.out.println("WebServer Conectado - " + rede.tipoRede() + " em " + next);
		} else {
			System.out.println("WebServer " + next + " Ocupado ... Tentar outro...");
			next.handle(rede);
		}
	}
}
