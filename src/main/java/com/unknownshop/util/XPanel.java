package com.unknownshop.util;

import com.unknownshop.form.DialogWelcome;
import com.unknownshop.form.admin.PanelAccountManager;
import com.unknownshop.form.user.PanelCart;
import com.unknownshop.fragment.header.Header;
import com.unknownshop.main.MainForm;
import javax.swing.JPanel;

public class XPanel {
    
    public static MainForm mainForm;
    public static DialogWelcome dlgWelcome;
    public static JPanel panelTaiKhoan;
    public static Header panelHeader;
    
    // User
    public static String nameCard;
    public static JPanel panelCardUser;
    public static JPanel panelDangNhap;
    public static JPanel panelDangKy;
    // Panel chứa panel giỏ hàng
    public static JPanel panelCart;
    // Panel giỏ hàng
    public static PanelCart pnlCart;
    
    // Admin
    public static JPanel panelCardAdmin;
    public static JPanel panelOrders;
    public static PanelAccountManager pnlAccManager;
    
}
