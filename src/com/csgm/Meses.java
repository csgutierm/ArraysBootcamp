package com.csgm;

public class Meses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		boolean sobrepeso = false;
		int cantidadMesesSobrepeso = 0;
		
		String [][] calendario = { {"Enero", "68", "170"},
				{"Febrero", "70", "170"},
				{"Marzo", "70", "170"},
				{"Abril", "72", "170"},
				{"Mayo", "74", "170"},
				{"Junio", "75", "170"},
				{"Julio", "78", "171"},
				{"Agosto", "80", "171"},
				{"Septiembre", "80", "171"},
				{"Octubre", "82", "171"},
				{"Noviembre", "82", "171"},
				{"Diciembre", "83", "172"}};
		
		for (int i = 0; i < calendario.length; i++) {
			
			if( Integer.parseInt(calendario[i][1]) + 100 > Integer.parseInt(calendario[i][2])  ) {
//				sobrepeso = true;
				cantidadMesesSobrepeso++;
				System.out.println("Sobre peso en el mes " + calendario[i][0] + " de " + 
						(Integer.parseInt(calendario[i][1]) + 100 - Integer.parseInt(calendario[i][2])) 
						+ " kilos");
			}
		}
		
		System.out.println("Estuve de sobrepeso " + cantidadMesesSobrepeso + " meses en este año");
		

	}

}
