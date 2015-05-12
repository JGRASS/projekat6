package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JScrollPane;
import javax.swing.JList;

public class PlannerGUI extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JButton btnDodajPredmet;
	private JButton btnObrisiPredmet;
	private JButton btnPolozenPredmet;
	private JScrollPane scrollPane;
	private JList list;
	private JScrollPane scrollPane_1;
	private JList list_1;
	private JButton btnKrajRada;
	private JScrollPane scrollPane_2;
	private JList list_2;

	

	/**
	 * Create the frame.
	 */
	public PlannerGUI() {
		setTitle("StudentPlanner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getTabbedPane(), BorderLayout.CENTER);
		contentPane.add(getPanel(), BorderLayout.EAST);
	}

	private JTabbedPane getTabbedPane() {
		if (tabbedPane == null) {
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.addTab("Aktuelni predmeti", null, getPanel_1(), null);
			tabbedPane.addTab("PolozeniPredmeti", null, getPanel_2(), null);
			tabbedPane.addTab("Svi predmeti", null, getPanel_3(), null);
		}
		return tabbedPane;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(140, 100));
			panel.setLayout(null);
			panel.add(getBtnDodajPredmet());
			panel.add(getBtnObrisiPredmet());
			panel.add(getBtnPolozenPredmet());
			panel.add(getBtnKrajRada());
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setLayout(new BorderLayout(0, 0));
			panel_1.add(getScrollPane(), BorderLayout.CENTER);
		}
		return panel_1;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.setLayout(new BorderLayout(0, 0));
			panel_2.add(getScrollPane_1(), BorderLayout.CENTER);
		}
		return panel_2;
	}
	private JPanel getPanel_3() {
		if (panel_3 == null) {
			panel_3 = new JPanel();
			panel_3.setLayout(new BorderLayout(0, 0));
			panel_3.add(getScrollPane_2(), BorderLayout.CENTER);
		}
		return panel_3;
	}
	private JButton getBtnDodajPredmet() {
		if (btnDodajPredmet == null) {
			btnDodajPredmet = new JButton("Dodaj predmet");
			btnDodajPredmet.setBounds(10, 24, 130, 34);
		}
		return btnDodajPredmet;
	}
	private JButton getBtnObrisiPredmet() {
		if (btnObrisiPredmet == null) {
			btnObrisiPredmet = new JButton("Obrisi predmet");
			btnObrisiPredmet.setBounds(10, 80, 130, 34);
		}
		return btnObrisiPredmet;
	}
	private JButton getBtnPolozenPredmet() {
		if (btnPolozenPredmet == null) {
			btnPolozenPredmet = new JButton("Polozen predmet");
			btnPolozenPredmet.setHorizontalTextPosition(SwingConstants.LEFT);
			btnPolozenPredmet.setHorizontalAlignment(SwingConstants.LEFT);
			btnPolozenPredmet.setBounds(10, 136, 130, 34);
		}
		return btnPolozenPredmet;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getList());
		}
		return scrollPane;
	}
	private JList getList() {
		if (list == null) {
			list = new JList();
		}
		return list;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setViewportView(getList_1());
		}
		return scrollPane_1;
	}
	private JList getList_1() {
		if (list_1 == null) {
			list_1 = new JList();
		}
		return list_1;
	}
	private JButton getBtnKrajRada() {
		if (btnKrajRada == null) {
			btnKrajRada = new JButton("Kraj rada");
			btnKrajRada.setBounds(39, 336, 91, 23);
			
		}
		return btnKrajRada;
	}
	private JScrollPane getScrollPane_2() {
		if (scrollPane_2 == null) {
			scrollPane_2 = new JScrollPane();
			scrollPane_2.setViewportView(getList_2());
		}
		return scrollPane_2;
	}
	private JList getList_2() {
		if (list_2 == null) {
			list_2 = new JList();
		}
		return list_2;
	}
}
