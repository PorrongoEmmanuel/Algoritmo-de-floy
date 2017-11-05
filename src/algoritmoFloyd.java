public class algoritmoFloyd {

    public void calcularRutaMasCorta(int[][] grafos, String[] nodos) {
        String[][] matrizCaminos = new String[grafos.length][grafos.length];
        //System.out.println(grafos.length);
        for (int a = 0; a < grafos.length; a++) {
            for (int b = 0; b < grafos.length; b++) {
                matrizCaminos[b][a] = nodos[a];
            }
        }
        // Recorrido de la matriz de caminos
        for (int a = 0; a < grafos.length; a++) {
            for (int b = 0; b < grafos.length; b++) {
                //System.out.println(a + ", " + b + " = " + matrizCaminos[a][b]);
            }
        }
        System.out.println("Evaluado a fila y columna 0");
        //Evaluado a fila y columna 0
        for (int a = 0; a < grafos.length; a++) {
            if (!(grafos[0][a] == grafos[a][0])) {
                //System.out.println("0, " + a + " = " + grafos[0][a]);
                //System.out.println(a + ", 0 = " + grafos[a][0]);
                for (int b = 0; b < grafos.length; b++) {
                    if (!(grafos[0][b] == grafos[b][0])) {
                        System.out.print("0, " + a + " + " + b + ", 0 = " +
                                grafos[0][a] + " + " + grafos[b][0] + " = "
                                + (grafos[0][a] + grafos[b][0]) + " < " +
                                grafos[a][b]);
                        if ((grafos[0][a] + grafos[b][0]) < grafos[a][b]) {
                            System.out.println(" Hay cambio");
                        } else {
                            System.out.println(" No hay cambio");
                        }
                    }
                }
            }
        }
        System.out.println("Evaluado a fila y columna 1");
        //Evaluado a fila y columna 1
        for (int a = 0; a < grafos.length; a++) {
            if (!(grafos[1][a] == grafos[a][1])) {
                for (int b = 0; b < grafos.length; b++) {
                    if (!(grafos[1][b] == grafos[b][1])) {
                        System.out.print("1, " + a + " + " + b + ", 1 = " +
                                grafos[1][a] + " + " + grafos[b][1] + " = "
                                + (grafos[1][a] + grafos[b][1]) + " < " +
                                grafos[a][b]);
                        if ((grafos[0][a] + grafos[b][0]) < grafos[a][b]) {
                            System.out.println(" Hay cambio");
                        } else {
                            System.out.println(" No hay cambio");
                        }
                    }
                }
            }


        }
        System.out.println("Evaluado a fila y columna 2");
        //Evaluado a fila y columna 2


        for (int a = 0; a < grafos.length; a++) {
            if (!(grafos[2][a] == grafos[a][2])) {
                for (int b = 0; b < grafos.length; b++) {
                    if (!(grafos[2][b] == grafos[b][2])) {
                        System.out.print("2, " + a + " + " + b + ", 2 = " +
                                grafos[2][a] + " + " + grafos[b][2] + " = "
                                + (grafos[2][a] + grafos[b][2]) + " < " +
                                grafos[a][b]);
                        if ((grafos[2][a] + grafos[b][2]) < grafos[a][b]) {
                            System.out.println(" Hay cambio");
                        } else {
                            System.out.println(" No hay cambio");
                        }
                    }
                }
            }
        }

        System.out.println("Evaluado a fila y columna 3");
        //Evaluado a fila y columna 2


        for (int a = 0; a < grafos.length; a++) {
            if (!(grafos[3][a] == grafos[a][3])) {
                for (int b = 0; b < grafos.length; b++) {
                    if (!(grafos[3][b] == grafos[b][3])) {
                        System.out.print("3, " + a + " + " + b + ", 3 = " +
                                grafos[3][a] + " + " + grafos[b][3] + " = "
                                + (grafos[3][a] + grafos[b][3]) + " < " +
                                grafos[a][b]);
                        if ((grafos[3][a] + grafos[b][3]) < grafos[a][b]) {
                            System.out.println(" Hay cambio");
                        } else {
                            System.out.println(" No hay cambio");
                        }
                    }
                }
            }
        }





    }}






