package com.mycompany.projecto;
//Version 1.3  Mas Completa

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Juego extends JFrame {

    private JFrame JFN1 = new JFrame();
    private JFrame JFN2 = new JFrame();
    private JFrame JFN3 = new JFrame();
    private MatrizJuego matrizJuego;
    private JButton nivel1Button, nivel2Button, nivel3Button, initButton, mainButton;
    private JLabel tiempoRestanteLabel;
    private JLabel TittleNivel;
    private Random random;
    private int Nivel;
    boolean winNivel_1 = false;
    boolean winNivel_2 = false;
    boolean winNivel_3 = false;
    boolean finGame = false;

    private boolean ganaste;

    private void JFNiveles() {

        JFrame JFNiveles = new JFrame();
        JFNiveles.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFNiveles.setSize(500, 180);
        JFNiveles.setLocationRelativeTo(null);

        JLabel Tittle = new javax.swing.JLabel();
        Tittle.setText("NIVEL SELECT");
        Tittle.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 70));
        Tittle.setForeground(new Color(0, 102, 102));

        nivel1Button = new JButton("Nivel 1");
        nivel1Button.setBackground(Color.WHITE);
        nivel1Button.setForeground(new Color(52, 231, 228));
        nivel1Button.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 30));

        nivel2Button = new JButton("Nivel 2");
        nivel2Button.setForeground(new Color(0, 153, 153));
        nivel2Button.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 30));
        nivel2Button.setBackground(Color.WHITE);

        nivel3Button = new JButton("Nivel 3");
        nivel3Button.setForeground(new Color(0, 51, 102));
        nivel3Button.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 30));
        nivel3Button.setBackground(Color.WHITE);

        if (winNivel_1 == false) {
            nivel1Button.setEnabled(true);
            nivel2Button.setEnabled(false);
            nivel3Button.setEnabled(false);
        } else if (winNivel_1 == true && winNivel_2 == false) {
            nivel1Button.setEnabled(true);
            nivel2Button.setEnabled(true);
            nivel3Button.setEnabled(false);
        } else if (winNivel_2 == true) {
            nivel1Button.setEnabled(true);
            nivel2Button.setEnabled(true);
            nivel3Button.setEnabled(true);
        }
        /*else if (winNivel_3 == true) {
            finGame = true;
        }*/

        nivel1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Nivel = 3; //Representa el valor de n 
                JFNiveles.dispose();
                JFNivel1();
                iniciarJuego(3);

            }
        });

        nivel2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Nivel = 4;
                JFNiveles.dispose();
                JFNivel2();
                iniciarJuego(4);

            }
        });

        nivel3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Nivel = 5;
                JFNiveles.dispose();
                JFNivel3();
                iniciarJuego(5);

            }
        });

        JPanel TittlePanel = new JPanel();
        JPanel buttonPanel = new JPanel();

        TittlePanel.setBackground(Color.WHITE);
        buttonPanel.setBackground(Color.WHITE);

        TittlePanel.add(Tittle, BorderLayout.NORTH);
        buttonPanel.add(nivel1Button);
        buttonPanel.add(nivel2Button);
        buttonPanel.add(nivel3Button);

        JFNiveles.add(TittlePanel, BorderLayout.NORTH);
        JFNiveles.add(buttonPanel, BorderLayout.SOUTH);

        JFNiveles.setVisible(true);

    }

    private void JFNivel1() {

        JFN1.setTitle("NIVEL 1");
        JFN1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFN1.setSize(800, 700);
        JFN1.setLocationRelativeTo(null);

        mainButton = new JButton("Iniciar");
        mainButton.setBackground(Color.WHITE);
        mainButton.setForeground(new Color(52, 231, 228));
        mainButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 30));

        JPanel buttonPanel = new JPanel();
        TittleNivel = new JLabel("NIVEL 1:  ");
        TittleNivel.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 40));
        TittleNivel.setForeground(new Color(52, 231, 228));

        buttonPanel.add(TittleNivel);

        buttonPanel.add(mainButton);

        JFN1.add(buttonPanel, BorderLayout.PAGE_START);

        tiempoRestanteLabel = new JLabel("Tiempo Restante: 60 Segundos");
        tiempoRestanteLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 22));
        JPanel tiempoPanel = new JPanel();
        tiempoPanel.add(tiempoRestanteLabel);
        JFN1.add(tiempoPanel, BorderLayout.SOUTH);
        random = new Random();
        JFN1.setVisible(true);

    }

    private void JFNivel2() {

        JFN2.setTitle("NIVEL 2");
        JFN2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFN2.setSize(800, 700);
        JFN2.setLocationRelativeTo(null);

        mainButton = new JButton("Iniciar");
        mainButton.setBackground(Color.WHITE);
        mainButton.setForeground(new Color(0, 153, 153));
        mainButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 30));

        JPanel buttonPanel = new JPanel();

        TittleNivel = new JLabel("NIVEL 2:  ");
        TittleNivel.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 40));
        TittleNivel.setForeground(new Color(0, 153, 153));

        buttonPanel.add(TittleNivel);

        buttonPanel.add(mainButton);

        JFN2.add(buttonPanel, BorderLayout.PAGE_START);

        tiempoRestanteLabel = new JLabel("Tiempo Restante: 60 Segundos");
        tiempoRestanteLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 22));
        JPanel tiempoPanel = new JPanel();
        tiempoPanel.add(tiempoRestanteLabel);
        JFN2.add(tiempoPanel, BorderLayout.SOUTH);
        random = new Random();
        JFN2.setVisible(true);

    }

    private void JFNivel3() {

        JFN3.setTitle("NIVEL 3");
        JFN3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFN3.setSize(800, 700);
        JFN3.setLocationRelativeTo(null);

        mainButton = new JButton("Iniciar");
        mainButton.setBackground(Color.WHITE);
        mainButton.setForeground(new Color(0, 51, 102));
        mainButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 30));

        JPanel buttonPanel = new JPanel();

        TittleNivel = new JLabel("NIVEL 3:  ");
        TittleNivel.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 40));
        TittleNivel.setForeground(new Color(0, 51, 102));

        buttonPanel.add(TittleNivel);

        buttonPanel.add(mainButton);

        JFN3.add(buttonPanel, BorderLayout.PAGE_START);

        tiempoRestanteLabel = new JLabel("Tiempo Restante: 60 Segundos");
        tiempoRestanteLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 22));
        JPanel tiempoPanel = new JPanel();
        tiempoPanel.add(tiempoRestanteLabel);
        JFN3.add(tiempoPanel, BorderLayout.SOUTH);
        random = new Random();
        JFN3.setVisible(true);

    }

    public Juego() {

        initButton = new javax.swing.JButton();
        JLabel Tittle = new javax.swing.JLabel();

        JFrame Inicio = new JFrame();
        Inicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Inicio.setSize(370, 190);
        Inicio.setVisible(true);
        Inicio.setLocationRelativeTo(null);

        initButton = new JButton("Comenzar");
        initButton.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 25));
        initButton.setForeground(new Color(0, 153, 153));
        initButton.setBackground(Color.WHITE);

        Tittle.setText("ROADS");
        Tittle.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 100));
        Tittle.setForeground(new Color(0, 102, 102));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        panel1.setBackground(Color.WHITE);
        panel2.setBackground(Color.WHITE);

        panel1.add(Tittle, BorderLayout.SOUTH);
        panel2.add(initButton, BorderLayout.NORTH);
        Inicio.add(panel1, BorderLayout.NORTH);
        Inicio.add(panel2, BorderLayout.SOUTH);

        initButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFNiveles();
                Inicio.dispose();
            }
        });

    }

    private void iniciarJuego(int nivel) {

        mainButton.setEnabled(false);
        if (matrizJuego != null) {
            remove(matrizJuego.getMatrizPanel());
        }
        matrizJuego = new MatrizJuego(nivel);
        matrizJuego.establecerCaminoAleatorio();
        matrizJuego.inicializarOrdenCasillas();
        matrizJuego.actualizarMatriz();
        switch (nivel) {
            case 3:
                JFN1.add(matrizJuego.getMatrizPanel(), BorderLayout.CENTER);
                break;
            case 4:
                JFN2.add(matrizJuego.getMatrizPanel(), BorderLayout.CENTER);
                break;
            case 5:
                JFN3.add(matrizJuego.getMatrizPanel(), BorderLayout.CENTER);
                break;
        }
        revalidate();
        repaint();

    }

    class MatrizJuego {

        private JPanel matrizPanel;
        private Timer cronometro;
        private int n;
        private int[][] camino;
        private List<Integer> ordenCasillas;
        private int pasoActual;
        private int pasoFinal = 0;
        private Timer timer;
        private List<JPanel> cuadros;

        public MatrizJuego(int tamanioInicial) {

            n = tamanioInicial;
            matrizPanel = new JPanel();
            matrizPanel.setSize(new Dimension(500, 500));
            matrizPanel.setLayout(new GridLayout(n, n));
            cuadros = new ArrayList<>();
            ganaste = false;
        }

        public void inicializarOrdenCasillas() {
            ordenCasillas = new ArrayList<>();
            for (int i = 0; i < camino.length; i++) {
                int indice = camino[i][0] * n + camino[i][1];
                ordenCasillas.add(indice);
            }
            pasoActual = 0;
            ganaste = false;
        }

        public void actualizarMatriz() {
            matrizPanel.removeAll();
            cuadros.clear();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    JPanel cuadro = new JPanel();
                    cuadro.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                    cuadro.addMouseListener(new CuadroMouseListener());
                    cuadros.add(cuadro);
                    matrizPanel.add(cuadro);
                }
            }

            matrizPanel.revalidate();
            matrizPanel.repaint();

            iniciarIluminacionCamino();
        }

        private void iniciarIluminacionCamino() {
            timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (pasoActual < ordenCasillas.size()) {
                        int indice = ordenCasillas.get(pasoActual);
                        int fila = indice / n;
                        int columna = indice % n;
                        iluminarCasilla(fila, columna);
                        pasoActual++;
                    } else {
                        timer.stop();
                        mainButton.setEnabled(true);
                        mainButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                iniciarCronometro();
                            }
                        });
                        // Agregar una pausa antes de reiniciar la matriz
                        Timer pausaTimer = new Timer(1000, new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                reiniciarMatriz();
                            }
                        });
                        pausaTimer.setRepeats(false); // Para que solo se ejecute una vez
                        pausaTimer.start();
                    }
                }
            });
            timer.start();

        }

        private void iniciarCronometro() {
            int duracion = 61 * 1000;  // Duración del cronómetro en milisegundos (60 segundos)
            cronometro = new Timer(1000, new ActionListener() {
                int segundosRestantes = 61;

                @Override
                public void actionPerformed(ActionEvent e) {
                    segundosRestantes--;

                    // Actualizar la etiqueta con el tiempo restante
                    tiempoRestanteLabel.setText("Tiempo Restante: " + segundosRestantes + " Segundos");

                    if (segundosRestantes == 0) {
                        // Detener el cronómetro y mostrar mensaje
                        cronometro.stop();
                        JOptionPane.showMessageDialog(matrizPanel, "¡Perdiste, El Tiempo Se Ha Agotado!");
                        reiniciarJuego();
                    }
                }
            });
            cronometro.start();
        }

        private void reiniciarMatriz() {
            // Código para reiniciar la matriz (poner casillas en blanco)
            for (JPanel cuadro : cuadros) {
                cuadro.setBackground(matrizPanel.getBackground());
            }
            matrizPanel.revalidate();
            matrizPanel.repaint();
        }

        private void iluminarCasilla(int fila, int columna) {
            JPanel cuadro = obtenerCuadro(fila, columna);
            switch (Nivel) {
                case 3:
                    cuadro.setBackground(new Color(52, 231, 228));
                    break;

                case 4:
                    cuadro.setBackground(new Color(0, 153, 153));
                    break;

                case 5:
                    cuadro.setBackground(new Color(0, 51, 102));
                    break;
            }

        }

        private JPanel obtenerCuadro(int fila, int columna) {
            int indice = fila * n + columna;
            return cuadros.get(indice);
        }

        public JPanel getMatrizPanel() {
            return matrizPanel;
        }

        public void establecerCaminoAleatorio() {
            List<int[][]> caminos = obtenerCaminosSegunNivel(n);
            int indiceCaminoAleatorio = random.nextInt(caminos.size());
            camino = caminos.get(indiceCaminoAleatorio);
        }

        private List<int[][]> obtenerCaminosSegunNivel(int nivel) {
            List<int[][]> caminos = new ArrayList<>();
            switch (nivel) {
                case 3:
                    caminos.add(new int[][]{{0, 0}, {1, 1}, {0, 2}, {1, 2}, {2, 1}});
                    caminos.add(new int[][]{{0, 0}, {0, 1}, {1, 2}, {1, 1}, {1, 0}, {2, 1}});
                    caminos.add(new int[][]{{0, 2}, {1, 2}, {2, 2}, {1, 1}, {0, 0}, {1, 0}, {2, 0}});
                    break;
                case 4:
                    caminos.add(new int[][]{{0, 0}, {0, 1}, {1, 1}, {1, 2}, {2, 2}, {2, 3}, {3, 3}});
                    caminos.add(new int[][]{{0, 0}, {1, 0}, {2, 0}, {1, 1}, {1, 2}, {1, 3}, {2, 2}, {3, 3}});
                    caminos.add(new int[][]{{0, 3}, {1, 2}, {1, 3}, {2, 2}, {2, 3}, {3, 2}, {3, 1}, {3, 0}});
                    caminos.add(new int[][]{{3, 2}, {2, 3}, {1, 3}, {0, 2}, {0, 1}, {1, 0}, {2, 0}, {3, 1}, {2, 1}, {1, 2}});
                    break;
                case 5:
                    caminos.add(new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 2}, {2, 2}, {2, 3}, {3, 2}, {4, 2}, {4, 1}});
                    caminos.add(new int[][]{{4, 0}, {3, 1}, {2, 0}, {1, 1}, {0, 0}, {0, 1}, {1, 2}, {0, 3}, {0, 4}, {1, 3}, {2, 4}, {3, 3}, {4, 4}});
                    caminos.add(new int[][]{{4, 0}, {3, 0}, {2, 0}, {1, 0}, {0, 0}, {1, 1}, {2, 2}, {1, 3}, {0, 4}, {1, 4}, {2, 4}, {3, 4}, {4, 4}});
                    caminos.add(new int[][]{{4, 2}, {3, 1}, {2, 0}, {1, 1}, {0, 2}, {1, 3}, {2, 4}, {3, 3}, {2, 2}});
                    caminos.add(new int[][]{{2, 0}, {1, 1}, {0, 0}, {0, 1}, {1, 2}, {0, 3}, {0, 4}, {1, 3}, {2, 4}, {3, 3}, {2, 2}, {3, 1}});
                    break;
                // Agregar casos para niveles 5 cuando se definan los caminos
            }
            return caminos;
        }

        private class CuadroMouseListener extends MouseAdapter {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (cronometro == null) {
                    JOptionPane.showMessageDialog(matrizPanel, "Debes Oprimir Iniciar");
                } else if (!ganaste) {
                    int fila = obtenerFila((JPanel) e.getSource());
                    int columna = obtenerColumna((JPanel) e.getSource());

                    // Verificar si la casilla clicada es parte del camino
                    if (esParteDelCamino(fila, columna)) {
                        verificarCasilla(fila, columna);
                        JPanel cuadro = obtenerCuadro(fila, columna);

                        // Cambiar el color de la casilla a verde
                        cuadro.setBackground(new Color(102, 255, 51)); // Verde

                        pasoFinal++;

                        // Verificar si se ha completado todo el camino
                        if (pasoFinal == ordenCasillas.size()) {
                            ganaste = true;

                            if (ganaste == true && cronometro != null && cronometro.isRunning()) {
                                cronometro.stop();
                                tiempoRestanteLabel.setText("Tiempo Restante: 60 Segundos");
                            }
                            timer.stop();
                            JOptionPane.showMessageDialog(matrizPanel, "¡Ganaste!");
                            if (ganaste == true && winNivel_1 == false) {
                                winNivel_1 = true;
                                ganaste = false;
                                JFN1.dispose();
                                JFNiveles();

                            } else if (ganaste == true && winNivel_2 == false) {
                                winNivel_2 = true;
                                ganaste = false;
                                JFN2.dispose();
                                JFNiveles();
                            } else if (ganaste == true && winNivel_3 == false) {
                                winNivel_3 = true;
                                JOptionPane.showMessageDialog(matrizPanel, "¡Fin Del Juego!");
                                JFN3.dispose();
                            }

                        }
                    } else {
                        // Si la casilla no es parte del camino, mostrar mensaje y reiniciar juego
                        JOptionPane.showMessageDialog(matrizPanel, "¡Perdiste, Elegiste Una Casilla Incorrecta!");
                        ganaste = false;
                        reiniciarJuego();
                    }
                }
            }

            private void verificarCasilla(int fila, int columna) {
                int indice = fila * n + columna;
                if (indice == ordenCasillas.get(pasoFinal)) {
                    // La casilla seleccionada es la correcta en el orden

                } else {
                    // La casilla seleccionada no es la correcta en el orden
                    JOptionPane.showMessageDialog(matrizPanel, "¡Perdiste, Elegiste Una Casilla Incorrecta!");
                    reiniciarJuego();
                }
            }
        }

        private void reiniciarJuego() {

            if (cronometro != null && cronometro.isRunning()) {
                cronometro.stop();
                tiempoRestanteLabel.setText("Tiempo Restante: 60 Segundos");
            }

            timer.stop();
            switch (Nivel) {
                case 3:
                    JFN1.getContentPane().removeAll();
                    JFN1.dispose();
                    break;
                case 4:
                    winNivel_3 = false;
                    JFN2.getContentPane().removeAll();
                    JFN2.dispose();
                    break;
                case 5:
                    JFN3.getContentPane().removeAll();
                    JFN3.dispose();
                    break;
            }
            JFNiveles();

            ganaste = false; // Restablecer ganaste a false
            pasoActual = 0; // Restablecer pasoActual a 0
            pasoFinal = 0; // Restablecer pasoFinal a 0

        }

        private int obtenerFila(JPanel cuadro) {
            int indice = cuadros.indexOf(cuadro);
            return indice / n;
        }

        private int obtenerColumna(JPanel cuadro) {
            int indice = cuadros.indexOf(cuadro);
            return indice % n;
        }

        private boolean esParteDelCamino(int fila, int columna) {
            for (int[] camino1 : camino) {
                if (camino1[0] == fila && camino1[1] == columna) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Juego());

    }
}
