package gui;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.util.GregorianCalendar;

public class DodajPredmet extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNazivPredmeta;
	private JLabel lblEspb;
	private JLabel lblSemestar;
	private JLabel lblDatumIspita;
	private JTextField txtNazivpredmeta;
	private JTextField txtEspb;
	private JTextField txtSemestar;
	private JDateChooser dateChooser;
	private JButton btnDodaj;
	private JButton btnOdustani;


	

	/**
	 * Create the frame.
	 */
	public DodajPredmet() {
		setResizable(false);
		setTitle("Dodaj predmet");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 307, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNazivPredmeta());
		contentPane.add(getLblEspb());
		contentPane.add(getLblSemestar());
		contentPane.add(getLblDatumIspita());
		contentPane.add(getTxtNazivpredmeta());
		contentPane.add(getTxtEspb());
		contentPane.add(getTxtSemestar());
		contentPane.add(getDateChooser());
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnOdustani());
	}

	private JLabel getLblNazivPredmeta() {
		if (lblNazivPredmeta == null) {
			lblNazivPredmeta = new JLabel("Naziv predmeta");
			lblNazivPredmeta.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNazivPredmeta.setBounds(21, 22, 107, 22);
		}
		return lblNazivPredmeta;
	}
	private JLabel getLblEspb() {
		if (lblEspb == null) {
			lblEspb = new JLabel("ESPB");
			lblEspb.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblEspb.setBounds(21, 67, 46, 14);
		}
		return lblEspb;
	}
	private JLabel getLblSemestar() {
		if (lblSemestar == null) {
			lblSemestar = new JLabel("Semestar");
			lblSemestar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblSemestar.setBounds(21, 106, 90, 22);
		}
		return lblSemestar;
	}
	private JLabel getLblDatumIspita() {
		if (lblDatumIspita == null) {
			lblDatumIspita = new JLabel("Datum ispita");
			lblDatumIspita.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblDatumIspita.setBounds(21, 149, 90, 22);
		}
		return lblDatumIspita;
	}
	private JTextField getTxtNazivpredmeta() {
		if (txtNazivpredmeta == null) {
			txtNazivpredmeta = new JTextField();
			txtNazivpredmeta.setBounds(142, 25, 86, 20);
			txtNazivpredmeta.setColumns(10);
		}
		return txtNazivpredmeta;
	}
	private JTextField getTxtEspb() {
		if (txtEspb == null) {
			txtEspb = new JTextField();
			txtEspb.setBounds(142, 66, 86, 20);
			txtEspb.setColumns(10);
		}
		return txtEspb;
	}
	private JTextField getTxtSemestar() {
		if (txtSemestar == null) {
			txtSemestar = new JTextField();
			txtSemestar.setBounds(142, 109, 86, 20);
			txtSemestar.setColumns(10);
		}
		return txtSemestar;
	}
	private JDateChooser getDateChooser() {
		if (dateChooser == null) {
			dateChooser = new JDateChooser();
			dateChooser.setBounds(142, 151, 86, 20);
		}
		return dateChooser;
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj ");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				GUIKontroler.dodajPredmet(txtNazivpredmeta.getText(),
											txtSemestar.getText(),
										     txtEspb.getText(),
										     DateFormat.getDateInstance().format(dateChooser.getDate()));
				
				dispose();
					
				
				}
			});
			btnDodaj.setBounds(32, 199, 96, 29);
		}
		return btnDodaj;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				dispose();
				}
			});
			btnOdustani.setBounds(156, 199, 96, 29);
		}
		return btnOdustani;
	}

}
