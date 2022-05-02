package br.com.mjv.model.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatadorUtil {

	public static String formatarCpf(String cpf) {
		String part1 = cpf.substring(0,3);
		String part2 = cpf.substring(3, 6);
		String part3 = cpf.substring(6, 9);
		String part4 = cpf.substring(9, 11);
		String cpfFormatador = String.format("%s.%s.%s-%s", part1, part2, part3, part4);
		return cpfFormatador;
	}
	
//  String cpfFormatado = part1.concat(".").concat(part2).concat(".").concat(part3).concat(".").concat(part4).concat("-");

	
    public static String formatarData(LocalDateTime dataHora) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dataFormatada = dataHora.format(formatter);

        return dataFormatada;
    }
	
}