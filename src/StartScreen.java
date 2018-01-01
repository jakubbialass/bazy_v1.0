import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Font;

public class StartScreen  {

	private JPanel panel_LogIn;
	private JPanel panel_Register;
	private JPanel panel_main_customer;
	private JPanel panel_main_admin;
	private JLabel sprzet_info;
	JPanel panel_konto;
	JButton zapiszDane_button;
	public static JLabel mailIstnieje;
	public static JLabel rozneHasla;
	
	private JFrame frmTwjSklepZiomeczku;
	private JPasswordField passwordField;
	private JTextField usernameField;
	private JPasswordField passwordFieldRegister;
	private JTextField usernameFieldRegister;
	private JPasswordField repeatPasswordFieldRegister;
	static Aplikacja aplikacja;
	private JTextField dane_imie;
	private JTextField dane_nazwisko;
	private JTextField dane_nrTelefonu;
	private JTextField dane_miasto;
	private JTextField dane_ulica;
	private JTextField dane_nrDomu;
	private JTextField dane_nrMieszkania;
	private JTextField dane_poczta;
	private JTextField wysylka_imie;
	private JTextField wysylka_nazwisko;
	private JTextField wysylka_nrTelefonu;
	private JTextField wysylka_miasto;
	private JTextField wysylka_ulica;
	private JTextField wysylka_nrDomu;
	private JTextField wysylka_nrMieszkania;
	private JTextField wysylka_poczta;
	private JTextField nazwa_sprzetu;
	private JTextField producent;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		aplikacja = new Aplikacja();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartScreen window = new StartScreen();
					window.frmTwjSklepZiomeczku.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StartScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTwjSklepZiomeczku = new JFrame();
		frmTwjSklepZiomeczku.setTitle("Twoja wypo\u017Cyczalnia ziomeczku");
		frmTwjSklepZiomeczku.setBounds(100, 100, 957, 786);
		frmTwjSklepZiomeczku.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTwjSklepZiomeczku.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel_LogIn = new JPanel();
		frmTwjSklepZiomeczku.getContentPane().add(panel_LogIn, "name_22470559233334");
		panel_LogIn.setLayout(null);
		
		JPanel panel_Register = new JPanel();
		frmTwjSklepZiomeczku.getContentPane().add(panel_Register, "name_22474101695708");
		panel_Register.setLayout(null);
		
		
		
		JLabel label = new JLabel("Username:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(135, 115, 109, 14);
		panel_LogIn.add(label);
		
		JLabel label_1 = new JLabel("Password:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(135, 157, 109, 14);
		panel_LogIn.add(label_1);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Enter your password.");
		passwordField.setBounds(254, 154, 145, 20);
		panel_LogIn.add(passwordField);
		
		usernameField = new JTextField();
		usernameField.setToolTipText("Enter your username.");
		usernameField.setColumns(10);
		usernameField.setBounds(254, 112, 145, 20);
		panel_LogIn.add(usernameField);
		
		JLabel label_2 = new JLabel("Don't have account yet?");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(123, 214, 188, 14);
		panel_LogIn.add(label_2);
		
		JLabel label_register = new JLabel("REGISTER NOW");
		label_register.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_LogIn.setVisible(false);
				panel_Register.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				label_register.setText("<HTML><U>REGISTER NOW</U></HTML>");
				label_register.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label_register.setText("REGISTER NOW");
			}
		});
		label_register.setForeground(Color.BLUE);
		label_register.setBounds(321, 214, 95, 14);
		panel_LogIn.add(label_register);
		
		JButton button_logIn = new JButton("Log In");
		
		
		
		
		JLabel label_3 = new JLabel("Username:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(136, 103, 109, 14);
		panel_Register.add(label_3);
		
		JLabel label_4 = new JLabel("Password:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(136, 139, 109, 14);
		panel_Register.add(label_4);
		
		passwordFieldRegister = new JPasswordField();
		passwordFieldRegister.setToolTipText("Enter your password.");
		passwordFieldRegister.setBounds(255, 136, 145, 20);
		panel_Register.add(passwordFieldRegister);
		
		usernameFieldRegister = new JTextField();
		usernameFieldRegister.setToolTipText("Enter your username.");
		usernameFieldRegister.setColumns(10);
		usernameFieldRegister.setBounds(255, 100, 145, 20);
		panel_Register.add(usernameFieldRegister);
		
		JLabel lblAlreadyRegistered = new JLabel("Already registered?");
		lblAlreadyRegistered.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAlreadyRegistered.setBounds(136, 231, 188, 14);
		panel_Register.add(lblAlreadyRegistered);
		
		JLabel label_logIn = new JLabel("LOG IN");
		label_logIn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_LogIn.setVisible(true);
				panel_Register.setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				label_logIn.setText("<HTML><U>LOG IN</U></HTML>");
				label_logIn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label_logIn.setText("LOG IN");
			}
		});
		label_logIn.setForeground(Color.BLUE);
		label_logIn.setBounds(334, 231, 67, 14);
		panel_Register.add(label_logIn);
		
		JButton button_register = new JButton("Register");
		
		button_register.setBounds(197, 202, 215, 23);
		panel_Register.add(button_register);
		
		JLabel lblRepeatPassword = new JLabel("Repeat password:");
		lblRepeatPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRepeatPassword.setBounds(136, 174, 109, 14);
		panel_Register.add(lblRepeatPassword);
		
		repeatPasswordFieldRegister = new JPasswordField();
		repeatPasswordFieldRegister.setToolTipText("Enter your password.");
		repeatPasswordFieldRegister.setBounds(255, 171, 145, 20);
		panel_Register.add(repeatPasswordFieldRegister);
		
		mailIstnieje = new JLabel("Konto o podanym adresie e-mail ju\u017C istnieje!");
		mailIstnieje.setHorizontalAlignment(SwingConstants.CENTER);
		mailIstnieje.setForeground(Color.RED);
		mailIstnieje.setBounds(410, 88, 293, 46);
		mailIstnieje.setVisible(false);
		panel_Register.add(mailIstnieje);
		
		rozneHasla = new JLabel("Podane has\u0142a r\u00F3\u017Cni\u0105 si\u0119 !");
		rozneHasla.setForeground(Color.RED);
		rozneHasla.setHorizontalAlignment(SwingConstants.CENTER);
		rozneHasla.setBounds(422, 139, 229, 49);
		rozneHasla.setVisible(false);
		panel_Register.add(rozneHasla);
		
		JPanel panel_main_admin = new JPanel();
		frmTwjSklepZiomeczku.getContentPane().add(panel_main_admin, "name_322835030657197");
		panel_main_admin.setLayout(null);
		
		JLabel lblWitajAdmin = new JLabel("Witaj ADMIN");
		lblWitajAdmin.setBounds(440, 5, 61, 14);
		panel_main_admin.add(lblWitajAdmin);
		
		JLabel lblNewLabel_2 = new JLabel("Nazwa sprz\u0119tu:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(101, 588, 113, 22);
		panel_main_admin.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Producent:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(373, 592, 81, 14);
		panel_main_admin.add(lblNewLabel_3);
		
		nazwa_sprzetu = new JTextField();
		nazwa_sprzetu.setBounds(221, 589, 161, 20);
		panel_main_admin.add(nazwa_sprzetu);
		nazwa_sprzetu.setColumns(10);
		
		producent = new JTextField();
		producent.setBounds(464, 589, 161, 20);
		panel_main_admin.add(producent);
		producent.setColumns(10);
		
		JButton dodajSprzet_button = new JButton("Dodaj sprz\u0119t");
		dodajSprzet_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sprzet sprzet= new Sprzet(nazwa_sprzetu.getText(), producent.getText());
				sprzet_info.setText(aplikacja.dodajSprzet(sprzet));
				sprzet_info.setVisible(true);
			}
		});
		dodajSprzet_button.setBounds(635, 588, 139, 23);
		panel_main_admin.add(dodajSprzet_button);
		
		sprzet_info = new JLabel("New label");
		sprzet_info.setForeground(Color.RED);
		sprzet_info.setHorizontalAlignment(SwingConstants.CENTER);
		sprzet_info.setBounds(221, 632, 404, 14);
		sprzet_info.setVisible(false);
		panel_main_admin.add(sprzet_info);
		
		JPanel panel_main_customer = new JPanel();
		frmTwjSklepZiomeczku.getContentPane().add(panel_main_customer, "name_322875070706609");
		panel_main_customer.setLayout(null);
		
		JLabel lblWitajUzytkownikuZerowy = new JLabel("Witaj uzytkowniku zerowy ty");
		lblWitajUzytkownikuZerowy.setBounds(193, 5, 138, 14);
		panel_main_customer.add(lblWitajUzytkownikuZerowy);
		
		JLabel nazwa_label = new JLabel("New label");
		nazwa_label.setBounds(341, 5, 46, 14);
		panel_main_customer.add(nazwa_label);
		
		JButton btnNewButton = new JButton("Zakupy");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(242, 85, 112, 23);
		panel_main_customer.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Twoje konto");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_main_customer.setVisible(false);
				panel_konto.setVisible(true);
				aplikacja.wyswietlDane(dane_imie, dane_nazwisko, dane_nrTelefonu, dane_miasto, dane_ulica, dane_nrDomu, dane_nrMieszkania, dane_poczta);
			}
		});
		btnNewButton_1.setBounds(242, 132, 112, 23);
		panel_main_customer.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Co\u015B tam");
		btnNewButton_2.setBounds(242, 177, 112, 23);
		panel_main_customer.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Wyj\u015Bcie");
		btnNewButton_3.setBounds(242, 223, 112, 23);
		panel_main_customer.add(btnNewButton_3);
		
		//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
		
		
		// ***************** L O G O W A N I E **********************
				button_logIn.addActionListener(new ActionListener() {
					@SuppressWarnings("deprecation")
					public void actionPerformed(ActionEvent arg0) {
						if(passwordField.getPassword()!=null && usernameField.getText() != null)
						{		
							if(aplikacja.zaloguj(usernameField.getText(), passwordField.getText()).equals("uzytkownik"))
							{
								nazwa_label.setText(usernameField.getText());
								panel_LogIn.setVisible(false);
								panel_main_customer.setVisible(true);
							}
							
							else if(aplikacja.zaloguj(usernameField.getText(), passwordField.getText())=="admin")
							{
								nazwa_label.setText(usernameField.getText());
								panel_LogIn.setVisible(false);
								panel_main_admin.setVisible(true);
							}
							else
							{
								// do nothing
							}
						}
					}
				});
				button_logIn.setBounds(184, 185, 215, 23);
				panel_LogIn.add(button_logIn);
				
				JPanel panel_zakupy = new JPanel();
				frmTwjSklepZiomeczku.getContentPane().add(panel_zakupy, "name_404900967488240");
				
				panel_konto = new JPanel();
				frmTwjSklepZiomeczku.getContentPane().add(panel_konto, "name_404903045149823");
				panel_konto.setLayout(null);
				
				JLabel lblTwojeDane = new JLabel("Twoje dane ");
				lblTwojeDane.setFont(new Font("Tahoma", Font.PLAIN, 17));
				lblTwojeDane.setBounds(140, 30, 120, 31);
				panel_konto.add(lblTwojeDane);
				
				JLabel lblNewLabel = new JLabel("Dane wysy\u0142ki");
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
				lblNewLabel.setBounds(636, 23, 143, 45);
				panel_konto.add(lblNewLabel);
				
				JLabel lblNewLabel_1 = new JLabel("Imi\u0119:");
				lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
				lblNewLabel_1.setBounds(50, 89, 80, 25);
				panel_konto.add(lblNewLabel_1);
				
				JLabel lblNazwisko = new JLabel("Nazwisko:");
				lblNazwisko.setHorizontalAlignment(SwingConstants.RIGHT);
				lblNazwisko.setBounds(50, 116, 80, 25);
				panel_konto.add(lblNazwisko);
				
				JLabel lblNumerTelefonu = new JLabel("Numer telefonu:");
				lblNumerTelefonu.setHorizontalAlignment(SwingConstants.RIGHT);
				lblNumerTelefonu.setBounds(22, 152, 108, 25);
				panel_konto.add(lblNumerTelefonu);
				
				JLabel lblMiasto = new JLabel("Miasto:");
				lblMiasto.setHorizontalAlignment(SwingConstants.RIGHT);
				lblMiasto.setBounds(50, 194, 80, 25);
				panel_konto.add(lblMiasto);
				
				JLabel lblUlica = new JLabel("Ulica:");
				lblUlica.setHorizontalAlignment(SwingConstants.RIGHT);
				lblUlica.setBounds(50, 241, 80, 25);
				panel_konto.add(lblUlica);
				
				JLabel lblNumerDomu = new JLabel("Numer domu:");
				lblNumerDomu.setHorizontalAlignment(SwingConstants.RIGHT);
				lblNumerDomu.setBounds(41, 277, 89, 25);
				panel_konto.add(lblNumerDomu);
				
				JLabel lblNumerMieszkania = new JLabel("Numer mieszkania:");
				lblNumerMieszkania.setHorizontalAlignment(SwingConstants.RIGHT);
				lblNumerMieszkania.setBounds(10, 313, 120, 25);
				panel_konto.add(lblNumerMieszkania);
				
				JLabel lblKodPocztowy = new JLabel("Kod pocztowy:");
				lblKodPocztowy.setHorizontalAlignment(SwingConstants.RIGHT);
				lblKodPocztowy.setBounds(41, 359, 89, 25);
				panel_konto.add(lblKodPocztowy);
				
				dane_imie = new JTextField();
				dane_imie.setEditable(false);
				dane_imie.setBounds(140, 91, 130, 20);
				panel_konto.add(dane_imie);
				dane_imie.setColumns(10);
				
				dane_nazwisko = new JTextField();
				dane_nazwisko.setEditable(false);
				dane_nazwisko.setBounds(140, 118, 130, 20);
				panel_konto.add(dane_nazwisko);
				dane_nazwisko.setColumns(10);
				
				dane_nrTelefonu = new JTextField();
				dane_nrTelefonu.setEditable(false);
				dane_nrTelefonu.setBounds(140, 154, 130, 20);
				panel_konto.add(dane_nrTelefonu);
				dane_nrTelefonu.setColumns(10);
				
				dane_miasto = new JTextField();
				dane_miasto.setEditable(false);
				dane_miasto.setBounds(140, 196, 130, 20);
				panel_konto.add(dane_miasto);
				dane_miasto.setColumns(10);
				
				dane_ulica = new JTextField();
				dane_ulica.setEditable(false);
				dane_ulica.setBounds(140, 243, 130, 20);
				panel_konto.add(dane_ulica);
				dane_ulica.setColumns(10);
				
				dane_nrDomu = new JTextField();
				dane_nrDomu.setEditable(false);
				dane_nrDomu.setBounds(140, 279, 130, 20);
				panel_konto.add(dane_nrDomu);
				dane_nrDomu.setColumns(10);
				
				dane_nrMieszkania = new JTextField();
				dane_nrMieszkania.setEditable(false);
				dane_nrMieszkania.setBounds(140, 315, 130, 20);
				panel_konto.add(dane_nrMieszkania);
				dane_nrMieszkania.setColumns(10);
				
				dane_poczta = new JTextField();
				dane_poczta.setEditable(false);
				dane_poczta.setBounds(140, 361, 130, 20);
				panel_konto.add(dane_poczta);
				dane_poczta.setColumns(10);
				
				JLabel label_5 = new JLabel("Imi\u0119:");
				label_5.setHorizontalAlignment(SwingConstants.RIGHT);
				label_5.setBounds(546, 89, 80, 25);
				panel_konto.add(label_5);
				
				JLabel label_6 = new JLabel("Nazwisko:");
				label_6.setHorizontalAlignment(SwingConstants.RIGHT);
				label_6.setBounds(546, 116, 80, 25);
				panel_konto.add(label_6);
				
				JLabel label_7 = new JLabel("Numer telefonu:");
				label_7.setHorizontalAlignment(SwingConstants.RIGHT);
				label_7.setBounds(506, 152, 120, 25);
				panel_konto.add(label_7);
				
				JLabel label_8 = new JLabel("Miasto:");
				label_8.setHorizontalAlignment(SwingConstants.RIGHT);
				label_8.setBounds(546, 194, 80, 25);
				panel_konto.add(label_8);
				
				JLabel label_9 = new JLabel("Ulica:");
				label_9.setHorizontalAlignment(SwingConstants.RIGHT);
				label_9.setBounds(546, 241, 80, 25);
				panel_konto.add(label_9);
				
				JLabel label_10 = new JLabel("Numer domu:");
				label_10.setHorizontalAlignment(SwingConstants.RIGHT);
				label_10.setBounds(546, 277, 80, 25);
				panel_konto.add(label_10);
				
				JLabel label_11 = new JLabel("Numer mieszkania:");
				label_11.setHorizontalAlignment(SwingConstants.RIGHT);
				label_11.setBounds(506, 313, 120, 25);
				panel_konto.add(label_11);
				
				JLabel label_12 = new JLabel("Kod pocztowy:");
				label_12.setHorizontalAlignment(SwingConstants.RIGHT);
				label_12.setBounds(537, 359, 89, 25);
				panel_konto.add(label_12);
				
				wysylka_imie = new JTextField();
				wysylka_imie.setEditable(false);
				wysylka_imie.setColumns(10);
				wysylka_imie.setBounds(636, 91, 130, 20);
				panel_konto.add(wysylka_imie);
				
				wysylka_nazwisko = new JTextField();
				wysylka_nazwisko.setEditable(false);
				wysylka_nazwisko.setColumns(10);
				wysylka_nazwisko.setBounds(636, 118, 130, 20);
				panel_konto.add(wysylka_nazwisko);
				
				wysylka_nrTelefonu = new JTextField();
				wysylka_nrTelefonu.setEditable(false);
				wysylka_nrTelefonu.setColumns(10);
				wysylka_nrTelefonu.setBounds(636, 154, 130, 20);
				panel_konto.add(wysylka_nrTelefonu);
				
				wysylka_miasto = new JTextField();
				wysylka_miasto.setEditable(false);
				wysylka_miasto.setColumns(10);
				wysylka_miasto.setBounds(636, 196, 130, 20);
				panel_konto.add(wysylka_miasto);
				
				wysylka_ulica = new JTextField();
				wysylka_ulica.setEditable(false);
				wysylka_ulica.setColumns(10);
				wysylka_ulica.setBounds(636, 243, 130, 20);
				panel_konto.add(wysylka_ulica);
				
				wysylka_nrDomu = new JTextField();
				wysylka_nrDomu.setEditable(false);
				wysylka_nrDomu.setColumns(10);
				wysylka_nrDomu.setBounds(636, 279, 130, 20);
				panel_konto.add(wysylka_nrDomu);
				
				wysylka_nrMieszkania = new JTextField();
				wysylka_nrMieszkania.setEditable(false);
				wysylka_nrMieszkania.setColumns(10);
				wysylka_nrMieszkania.setBounds(636, 315, 130, 20);
				panel_konto.add(wysylka_nrMieszkania);
				
				wysylka_poczta = new JTextField();
				wysylka_poczta.setEditable(false);
				wysylka_poczta.setColumns(10);
				wysylka_poczta.setBounds(636, 361, 130, 20);
				panel_konto.add(wysylka_poczta);
				
				
				
				
				JButton edytujDane_button = new JButton("Edytuj twoje dane");
				edytujDane_button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dane_imie.setEditable(true);
						dane_nazwisko.setEditable(true);
						dane_nrTelefonu.setEditable(true);
						dane_miasto.setEditable(true);
						dane_ulica.setEditable(true);
						dane_nrDomu.setEditable(true);
						dane_nrMieszkania.setEditable(true);
						dane_poczta.setEditable(true);
						edytujDane_button.setEnabled(false);
						zapiszDane_button.setEnabled(true);
					}
				});
				edytujDane_button.setBounds(41, 426, 153, 23);
				panel_konto.add(edytujDane_button);
				
				zapiszDane_button = new JButton("Zapisz");
				zapiszDane_button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						edytujDane_button.setEnabled(true);
						zapiszDane_button.setEnabled(false);
						dane_imie.setEditable(false);
						dane_nazwisko.setEditable(false);
						dane_nrTelefonu.setEditable(false);
						dane_miasto.setEditable(false);
						dane_ulica.setEditable(false);
						dane_nrDomu.setEditable(false);
						dane_nrMieszkania.setEditable(false);
						dane_poczta.setEditable(false);
						aplikacja.zapiszDane(dane_imie, dane_nazwisko, dane_nrTelefonu, dane_miasto, dane_ulica, dane_nrDomu, dane_nrMieszkania, dane_poczta);
						
					}
				});
				zapiszDane_button.setEnabled(false);
				zapiszDane_button.setBounds(204, 426, 89, 23);
				panel_konto.add(zapiszDane_button);
				
				JButton edytujWysylka_button = new JButton("Edytuj dane wysy\u0142ki");
				edytujWysylka_button.setBounds(506, 426, 174, 23);
				panel_konto.add(edytujWysylka_button);
				
				JButton zapiszWysylka_button = new JButton("Zapisz");
				zapiszWysylka_button.setEnabled(false);
				zapiszWysylka_button.setBounds(690, 426, 89, 23);
				panel_konto.add(zapiszWysylka_button);
				
			
				
				button_register.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						rozneHasla.setVisible(false);
						mailIstnieje.setVisible(false);
						if(aplikacja.zarejestruj(usernameFieldRegister.getText(), passwordFieldRegister.getText(), repeatPasswordFieldRegister.getText())!=null)
						{
							panel_Register.setVisible(false);
							panel_main_customer.setVisible(true);
						}
					}
				});
				
				
	}
}
