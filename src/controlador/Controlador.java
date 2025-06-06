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
        this.vista.btnResetearCuentas.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.vista.btnCuentaClick) {
            this.vista.etiquetaCuentaClick.setText("Veces que se hace click el botón: " + this.modulo.aumentaCuentaBotonClick());
        } else if (e.getSource() == this.vista.btnResetearCuentas) {
            this.modulo.resetearCuentas();
            this.vista.etiquetaCuentaClick.setText("Veces que se hace click el botón: " + this.modulo.getCuentaBotonClick());
            this.vista.etiquetaCursorEntra.setText("Veces que el cursor entra en el botón: " + this.modulo.getCuentaBotonEntra());
            this.vista.etiquetaCursorSale.setText("Veces que el cursor sale del botón: " + this.modulo.getCuentaBotonSale());
        }
        this.toggleBtnResetarCuentas();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == this.vista.btnCursorEntra) {
            this.vista.etiquetaCursorEntra.setText("Veces que el cursor entra en el botón: " + this.modulo.aumentaCuentaBotonEntra());
        }
        this.toggleBtnResetarCuentas();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == this.vista.btnCursorSale) {
            this.vista.etiquetaCursorSale.setText("Veces que el cursor sale del botón: " + this.modulo.aumentaCuentaBotonSale());
        }
        this.toggleBtnResetarCuentas();
    }
    
    public void toggleBtnResetarCuentas() {
        int cuentaBtnClick = this.modulo.getCuentaBotonClick();
        int cuentaBtnEntra = this.modulo.getCuentaBotonEntra();
        int cuentaBtnSale = this.modulo.getCuentaBotonSale();
        this.vista.btnResetearCuentas.setEnabled(cuentaBtnClick != 0 || cuentaBtnEntra != 0 || cuentaBtnSale != 0);
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
