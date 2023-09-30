package currencyConverter;

import java.awt.EventQueue;
import javax.swing.UIManager;

public class CurrencyConverter {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}

		// Initialize default exchange rates in the RateManager
		RateManager rateManager = RateManager.getInstance();
		rateManager.setExchangeRate("USD", "EUR", 0.93);
		rateManager.setExchangeRate("EUR", "USD", 1.073);
		// Add more exchange rates as needed

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// Create and show main window at startup
					MainWindow mainWindow = new MainWindow();
					mainWindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
