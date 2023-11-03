package ovh.christophedlr.view;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class Main extends JFrame {
    private Locale locale = Locale.getDefault();
    private ResourceBundle resourceBundle;
    private Properties properties;
    private JMenuBar menuBar;

    private JTabbedPane tabbedPane;

    public Main(Properties properties) {
        this.resourceBundle = ResourceBundle.getBundle("resources/lang/messages", locale);
        this.properties = properties;

        setSize(1280, 720);
        setTitle("JExosculatio - " + properties.getProperty("version"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuBar = new JMenuBar();
        addMenuFile();
        addMenuEdit();
        addMenuList();
        addMenuSales();
        addMenuPurchase();
        addMenuOther();
        addMenuHelp();
        setJMenuBar(menuBar);

        tabbedPane = new JTabbedPane();

        add(tabbedPane);
        setVisible(true);
    }

    /**
     * Add the menu "File" to the menu bar.
     */
    public void addMenuFile() {
        JMenu menuFile = new JMenu(resourceBundle.getString("menu.file"));
        JMenuItem menuFileNew = new JMenuItem(resourceBundle.getString("menu.file.new"));
        JMenuItem menuFileOpen = new JMenuItem(resourceBundle.getString("menu.file.open"));
        JMenuItem menuFileClose = new JMenuItem(resourceBundle.getString("menu.file.close"));
        JMenuItem menuFileImport = new JMenuItem(resourceBundle.getString("menu.file.import"));
        JMenuItem menuFileExport = new JMenuItem(resourceBundle.getString("menu.file.export"));
        JMenuItem menuFileExit = new JMenuItem(resourceBundle.getString("menu.file.exit"));

        menuFile.setMnemonic(KeyEvent.VK_F);
        menuFileNew.setMnemonic(KeyEvent.VK_N);
        menuFileOpen.setMnemonic(KeyEvent.VK_O);
        menuFileClose.setMnemonic(KeyEvent.VK_F);
        menuFileImport.setMnemonic(KeyEvent.VK_I);
        menuFileExport.setMnemonic(KeyEvent.VK_E);
        menuFileExit.setMnemonic(KeyEvent.VK_Q);

        menuFileNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
        menuFileOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
        menuFileClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK));
        menuFileExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.CTRL_DOWN_MASK));

        menuFile.add(menuFileNew);
        menuFile.add(menuFileOpen);
        menuFile.add(menuFileClose);
        menuFile.addSeparator();
        menuFile.add(menuFileImport);
        menuFile.add(menuFileExport);
        menuFile.addSeparator();
        menuFile.add(menuFileExit);

        menuFileClose.setEnabled(false);
        menuFileImport.setEnabled(false);
        menuFileExport.setEnabled(false);

        menuBar.add(menuFile);
    }

    /**
     * Add the menu "Edit" to the menu bar.
     */
    public void addMenuEdit() {
        JMenu menuEdit = new JMenu(resourceBundle.getString("menu.edit"));
        JMenuItem menuEditUndo = new JMenuItem(resourceBundle.getString("menu.edit.undo"));
        JMenuItem menuEditRedo = new JMenuItem(resourceBundle.getString("menu.edit.redo"));
        JMenuItem menuEditCut = new JMenuItem(resourceBundle.getString("menu.edit.cut"));
        JMenuItem menuEditCopy = new JMenuItem(resourceBundle.getString("menu.edit.copy"));
        JMenuItem menuEditPaste = new JMenuItem(resourceBundle.getString("menu.edit.paste"));
        JMenuItem menuEditDelete = new JMenuItem(resourceBundle.getString("menu.edit.delete"));
        JMenuItem menuEditSelectAll = new JMenuItem(resourceBundle.getString("menu.edit.selectAll"));
        JMenuItem menuEditPreferences = new JMenuItem(resourceBundle.getString("menu.edit.preferences"));

        menuEdit.setMnemonic(KeyEvent.VK_E);
        menuEditUndo.setMnemonic(KeyEvent.VK_Z);
        menuEditRedo.setMnemonic(KeyEvent.VK_Y);
        menuEditCut.setMnemonic(KeyEvent.VK_X);
        menuEditCopy.setMnemonic(KeyEvent.VK_C);
        menuEditPaste.setMnemonic(KeyEvent.VK_V);
        menuEditDelete.setMnemonic(KeyEvent.VK_D);
        menuEditSelectAll.setMnemonic(KeyEvent.VK_A);
        menuEditPreferences.setMnemonic(KeyEvent.VK_P);

        menuEditUndo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, KeyEvent.CTRL_DOWN_MASK));
        menuEditRedo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, KeyEvent.CTRL_DOWN_MASK));
        menuEditCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK));
        menuEditCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));
        menuEditPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK));
        menuEditDelete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
        menuEditSelectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK));
        menuEditPreferences.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_DOWN_MASK));

        menuEdit.add(menuEditUndo);
        menuEdit.add(menuEditRedo);
        menuEdit.addSeparator();
        menuEdit.add(menuEditCut);
        menuEdit.add(menuEditCopy);
        menuEdit.add(menuEditPaste);
        menuEdit.add(menuEditDelete);
        menuEdit.addSeparator();
        menuEdit.add(menuEditSelectAll);
        menuEdit.addSeparator();
        menuEdit.add(menuEditPreferences);

        menuBar.add(menuEdit);
    }

    /**
     * Add the menu "List" to the menu bar.
     */
    public void addMenuList() {
        JMenu menuList = new JMenu(resourceBundle.getString("menu.list"));
        JMenuItem menuListCustomers = new JMenuItem(resourceBundle.getString("menu.list.customers"));
        JMenuItem menuListSuppliers = new JMenuItem(resourceBundle.getString("menu.list.suppliers"));
        JMenuItem menuListProducts = new JMenuItem(resourceBundle.getString("menu.list.products"));
        JMenuItem menuListTaxes = new JMenuItem(resourceBundle.getString("menu.list.taxRates"));
        JMenuItem menuListCurrencies = new JMenuItem(resourceBundle.getString("menu.list.currencies"));

        menuList.setMnemonic(KeyEvent.VK_L);
        menuListCustomers.setMnemonic(KeyEvent.VK_C);
        menuListSuppliers.setMnemonic(KeyEvent.VK_S);
        menuListProducts.setMnemonic(KeyEvent.VK_P);
        menuListTaxes.setMnemonic(KeyEvent.VK_T);
        menuListCurrencies.setMnemonic(KeyEvent.VK_U);

        menuList.add(menuListCustomers);
        menuList.add(menuListSuppliers);
        menuList.addSeparator();
        menuList.add(menuListProducts);
        menuList.addSeparator();
        menuList.add(menuListTaxes);
        menuList.add(menuListCurrencies);

        menuBar.add(menuList);
    }

    /**
     * Add the menu "Sales" to the menu bar.
     */
    public void addMenuSales() {
        JMenu menuSales = new JMenu(resourceBundle.getString("menu.sales"));
        JMenuItem menuSalesInvoices = new JMenuItem(resourceBundle.getString("menu.sales.invoices"));
        JMenuItem menuSalesOrders = new JMenuItem(resourceBundle.getString("menu.sales.orders"));
        JMenuItem menuSalesDeliveryNotes = new JMenuItem(resourceBundle.getString("menu.sales.deliveryNotes"));
        JMenuItem menuSalesQuotes = new JMenuItem(resourceBundle.getString("menu.sales.quotes"));
        JMenuItem menuSalesCreditNotes = new JMenuItem(resourceBundle.getString("menu.sales.creditNotes"));

        menuSales.setMnemonic(KeyEvent.VK_S);
        menuSalesInvoices.setMnemonic(KeyEvent.VK_I);
        menuSalesOrders.setMnemonic(KeyEvent.VK_O);
        menuSalesDeliveryNotes.setMnemonic(KeyEvent.VK_D);
        menuSalesQuotes.setMnemonic(KeyEvent.VK_Q);
        menuSalesCreditNotes.setMnemonic(KeyEvent.VK_C);

        menuSales.add(menuSalesInvoices);
        menuSales.add(menuSalesOrders);
        menuSales.add(menuSalesDeliveryNotes);
        menuSales.add(menuSalesQuotes);
        menuSales.add(menuSalesCreditNotes);

        menuBar.add(menuSales);
    }

    /**
     * Add the menu "Purchase" to the menu bar.
     */
    public void addMenuPurchase() {
        JMenu menuPurchase = new JMenu(resourceBundle.getString("menu.purchases"));
        JMenuItem menuPurchaseInvoices = new JMenuItem(resourceBundle.getString("menu.purchases.invoices"));
        JMenuItem menuPurchaseOrders = new JMenuItem(resourceBundle.getString("menu.purchases.orders"));
        JMenuItem menuPurchaseDeliveryNotes = new JMenuItem(resourceBundle.getString("menu.purchases.deliveryNotes"));
        JMenuItem menuPurchaseQuotes = new JMenuItem(resourceBundle.getString("menu.purchases.quotes"));
        JMenuItem menuPurchaseCreditNotes = new JMenuItem(resourceBundle.getString("menu.purchases.creditNotes"));

        menuPurchase.setMnemonic(KeyEvent.VK_P);
        menuPurchaseInvoices.setMnemonic(KeyEvent.VK_I);
        menuPurchaseOrders.setMnemonic(KeyEvent.VK_O);
        menuPurchaseDeliveryNotes.setMnemonic(KeyEvent.VK_D);
        menuPurchaseQuotes.setMnemonic(KeyEvent.VK_Q);
        menuPurchaseCreditNotes.setMnemonic(KeyEvent.VK_C);

        menuPurchase.add(menuPurchaseInvoices);
        menuPurchase.add(menuPurchaseOrders);
        menuPurchase.add(menuPurchaseDeliveryNotes);
        menuPurchase.add(menuPurchaseQuotes);
        menuPurchase.add(menuPurchaseCreditNotes);

        menuBar.add(menuPurchase);
    }

    public void addMenuOther() {
        JMenu menuOther = new JMenu(resourceBundle.getString("menu.other"));
        JMenuItem menuOtherPaymentMethods = new JMenuItem(resourceBundle.getString("menu.other.paymentMethods"));
        JMenuItem menuOtherComptableExercices = new JMenuItem(resourceBundle.getString("menu.other.comptableExercices"));
        JMenuItem menuOtherTasks = new JMenuItem(resourceBundle.getString("menu.other.tasks"));

        JMenu menuOtherProduction = new JMenu(resourceBundle.getString("menu.other.production"));
        JMenuItem menuOtherProductionAssembly = new JMenuItem(resourceBundle.getString("menu.other.production.assembly"));
        JMenuItem menuOtherProductionStop = new JMenuItem(resourceBundle.getString("menu.other.production.stop"));

        JMenu menuOtherStock = new JMenu(resourceBundle.getString("menu.other.stock"));
        JMenuItem menuOtherStockMovements = new JMenuItem(resourceBundle.getString("menu.other.stock.movements"));
        JMenuItem menuOtherStockAdjustments = new JMenuItem(resourceBundle.getString("menu.other.stock.adjustments"));

        menuOther.setMnemonic(KeyEvent.VK_O);
        menuOtherPaymentMethods.setMnemonic(KeyEvent.VK_P);
        menuOtherComptableExercices.setMnemonic(KeyEvent.VK_E);
        menuOtherTasks.setMnemonic(KeyEvent.VK_T);
        menuOtherProduction.setMnemonic(KeyEvent.VK_R);
        menuOtherProductionAssembly.setMnemonic(KeyEvent.VK_A);
        menuOtherProductionStop.setMnemonic(KeyEvent.VK_S);
        menuOtherStock.setMnemonic(KeyEvent.VK_S);
        menuOtherStockMovements.setMnemonic(KeyEvent.VK_M);
        menuOtherStockAdjustments.setMnemonic(KeyEvent.VK_A);

        menuOtherProduction.add(menuOtherProductionAssembly);
        menuOtherProduction.add(menuOtherProductionStop);

        menuOtherStock.add(menuOtherStockMovements);
        menuOtherStock.add(menuOtherStockAdjustments);

        menuOther.add(menuOtherPaymentMethods);
        menuOther.add(menuOtherComptableExercices);
        menuOther.add(menuOtherTasks);
        menuOther.addSeparator();
        menuOther.add(menuOtherProduction);
        menuOther.add(menuOtherStock);

        menuBar.add(menuOther);
    }

    /**
     * Add the menu "Help" to the menu bar.
     */
    public void addMenuHelp() {
        JMenu menuHelp = new JMenu(resourceBundle.getString("menu.help"));
        JMenuItem menuHelpContent = new JMenuItem(resourceBundle.getString("menu.help.content"));
        JMenuItem menuHelpVisitWebsite = new JMenuItem(resourceBundle.getString("menu.help.visitWebsite"));
        JMenuItem menuHelpReportBug = new JMenuItem(resourceBundle.getString("menu.help.reportBug"));
        JMenuItem menuHelpVideoTutorials = new JMenuItem(resourceBundle.getString("menu.help.videoTutorials"));
        JMenuItem menuHelpAbout = new JMenuItem(resourceBundle.getString("menu.help.about"));

        menuHelp.setMnemonic(KeyEvent.VK_H);
        menuHelpContent.setMnemonic(KeyEvent.VK_C);
        menuHelpVisitWebsite.setMnemonic(KeyEvent.VK_W);
        menuHelpReportBug.setMnemonic(KeyEvent.VK_B);
        menuHelpVideoTutorials.setMnemonic(KeyEvent.VK_V);
        menuHelpAbout.setMnemonic(KeyEvent.VK_A);

        menuHelpContent.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));

        menuHelp.add(menuHelpContent);
        menuHelp.addSeparator();
        menuHelp.add(menuHelpVisitWebsite);
        menuHelp.add(menuHelpReportBug);
        menuHelp.add(menuHelpVideoTutorials);
        menuHelp.addSeparator();
        menuHelp.add(menuHelpAbout);

        menuBar.add(menuHelp);
    }
}
