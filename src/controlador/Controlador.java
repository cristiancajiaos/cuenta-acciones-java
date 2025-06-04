package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modulo.Modulo;
import vista.Vista;

public class Controlador implements ActionListener, MouseListener {

    private Vista vista;
    private Modulo modulo;

    public Controlador(Vista vista, Modulo modulo) {
        this.vista = vista;
        this.modulo = modulo;
        this.vista.btnCuentaClick.addActionListener(this);
        this.vista.btnCursorEntra.addMouseListener(this);
        this.vista.btnCursorSale.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vista.btnCuentaClick) {
            this.vista.etiquetaCuentaClick.setText("Veces que se hace click el botón: " + this.modulo.aumentaCuentaBotonClick());
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == this.vista.btnCursorEntra) {
            this.vista.etiquetaCursorEntra.setText("Veces que el cursor entra en el botón: " + this.modulo.aumentaCuentaBotonEntra());
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == this.vista.btnCursorSale) {
            this.vista.etiquetaCursorSale.setText("Veces que el cursor sale del botón: " + this.modulo.aumentaCuentaBotonSale());
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

}
