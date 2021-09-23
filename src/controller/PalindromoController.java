package controller;

import model.PilhaString;

public class PalindromoController {
	
	
	public String invertePalavra(String palavra) throws Exception {
		PilhaString pilha = new PilhaString();
		for(int i=0; i < palavra.length(); i++) {
			pilha.push(String.valueOf(palavra.charAt(i)));
		}
		String retornoString = new String();;
		
		while(!pilha.isEmpty()) {
			retornoString = retornoString + pilha.pop();
		}
		return retornoString;
	}
	
	public boolean comparaPalavras(String palavra, String palavraInvertida) {
		return palavra.equals(palavraInvertida);
	}

}
