package gui;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrijavaGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblIme;
	private JLabel lblPrezime;
	private JLabel lblBrojIndeksa;
	private JTextField txtIme;
	private JTextField txtPrezime;
	private JTextField txtBrojindeksa;
	private JButton btnPrijaviSe;
	private JButton btnCancel;

	

	/**
	 * Create the frame.
	 */
	public PrijavaGUI() {
		setResizable(false);
		setTitle("Prijava");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 409, 263);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblIme());
		contentPane.add(getLblPrezime());
		contentPane.add(getLblBrojIndeksa());
		contentPane.add(getTxtIme());
		contentPane.add(getTxtPrezime());
		contentPane.add(getTxtBrojindeksa());
		contentPane.add(getBtnPrijaviSe());
		contentPane.add(getBtnCancel());
	}
	private JLabel getLblIme() {
		if (lblIme == null) {
			lblIme = new JLabel("Ime");
			lblIme.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblIme.setBounds(22, 30, 99, 26);
		}
		return lblIme;
	}
	private JLabel getLblPrezime() {
		if (lblPrezime == null) {
			lblPrezime = new JLabel("Prezime");
			lblPrezime.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblPrezime.setBounds(22, 82, 99, 26);
		}
		return lblPrezime;
	}
	private JLabel getLblBrojIndeksa() {
		if (lblBrojIndeksa == null) {
			lblBrojIndeksa = new JLabel("Broj indeksa");
			lblBrojIndeksa.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblBrojIndeksa.setBounds(22, 135, 99, 26);
		}
		return lblBrojIndeksa;
	}
	private JTextField getTxtIme() {
		if (txtIme == null) {
			txtIme = new JTextField();
			txtIme.setBounds(131, 33, 99, 25);
			txtIme.setColumns(10);
		}
		return txtIme;
	}
	private JTextField getTxtPrezime() {
		if (txtPrezime == null) {
			txtPrezime = new JTextField();
			txtPrezime.setBounds(131, 85, 99, 25);
			txtPrezime.setColumns(10);
		}
		return txtPrezime;
	}
	private JTextField getTxtBrojindeksa() {
		if (txtBrojindeksa == null) {
			txtBrojindeksa = new JTextField();
			txtBrojindeksa.setBounds(131, 135, 99, 25);
			txtBrojindeksa.setColumns(10);
		}
		return txtBrojindeksa;
	}
	private JButton getBtnPrijaviSe() {
		if (btnPrijaviSe == null) {
			btnPrijaviSe = new JButton("Prijavi se");
			btnPrijaviSe.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnPrijaviSe.setBounds(268, 52, 99, 33);
		}
		return btnPrijaviSe;
	}
	private JButton getBtnCancel() {
		if (btnCancel == null) {
			btnCancel = new JButton("Cancel");
			btnCancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 15));
			btnCancel.setBounds(268, 108, 99, 33);
		}
		return btnCancel;
	}
}
