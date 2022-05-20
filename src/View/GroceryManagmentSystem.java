package View;

import javax.swing.*;

public class GroceryManagmentSystem extends JFrame{


    private JPanel pnlMainView;
    private JLabel lblWelcome;
    private JLabel lblOrderID;
    private JTextField txtOrderID;
    private JLabel lblOrderDate;
    private JTextField txtOrderDate;
    private JLabel lblItemCode;
    private JLabel lblDescription;
    private JLabel lblUnitPrice;
    private JLabel lblStockQuntity;
    private JLabel lblQuantity;
    private JComboBox cmbItemCode;
    private JTextField txtItemDescription;
    private JTextField txtUnitPrice;
    private JTextField txtStockQuantity;
    private JTextField txtQuantity;
    private JPanel pnlTable;
    private JScrollPane srlPTable;
    private JTable tblOrderList;
    private JButton btnAddItem;
    private JButton btnAddNewItem;
    private JButton btnUpdateItem;
    private JButton btnDeleteItem;
    private JLabel lblCustomerDetails;
    private JLabel lblCustomerID;
    private JComboBox cmbCustomerID;
    private JLabel lblCustomerName;
    private JTextField txtCustomerName;
    private JButton btnNewCustomer;
    private JButton btnUpdateCustomer;
    private JButton btnDeleteCustomer;
    private JPanel pnlCustomerDetails;
    private JLabel lblItemControl;
    private JLabel lblTotalAmount;
    private JTextField txtTotalAmount;
    private JLabel lblRs;
    private JButton btnPlaceOrder;
    private JLabel lblCustomerAddres;
    private JTextField txtCustomerAddres;
    private JButton btnNewOrder;
    private JButton btnRemoveItem;


    public GroceryManagmentSystem( String title){   /// create a Constructer on Grocery Managment System

        super(title);   /// Grocery Managment System window title setted

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // make the close of Grocery Managment System window with JVM

        this.setContentPane(pnlMainView);
        this.pack();

        tblOrderList.setModel(new javax.swing.table.DefaultTableModel(new Object [][] {}, new String [] {"Code", "Descrption", "Unit Price", "Qty On Hand", "Total"}));
        srlPTable.setViewportView(tblOrderList);


    }

    public static void main(String[] args) {

        JFrame mainViewFrame = new GroceryManagmentSystem("Grocery Managment System"); /// creat  an object from Grocery Managment System
        mainViewFrame.setVisible(true);   /// make visible the created object

    }






}
