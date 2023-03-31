package com.ekan.api.util;

import java.util.Calendar;
import java.util.Date;


public class DataUtil {
	
	// data: Data e hora original
	// horas: Horas que se deseja asicionar
	public Date adicionaHoras(Date data, int horas) {
	   Calendar calendario = Calendar.getInstance(); // Cria um objeto de data
	   calendario.setTime(data); // Inicia o objeto com a data original
	   calendario.add(Calendar.HOUR_OF_DAY, horas); // Adiciona as horas necessárias

	   return calendario.getTime(); // Retorna a hora formatada
	}

}
