/* Appending a Row to a JTable Component : Table « Swing JFC « Java
 * http://www.java2s.com/Code/Java/Swing-JFC/AppendingaRowtoaJTableComponent.htm
 */
package demo.javaswing.singleframe;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TestTable {   
    public static void main(String[] args) {
    DefaultTableModel model = new DefaultTableModel();
    JTable table = new JTable(model);
    model.addColumn("Col1");
    model.addColumn("Col2");
    model.addRow(new Object[] { "v1", "v2" });
    model.addRow(new Object[] { "v1" });
    model.addRow(new Object[] { "v1", "v2", "v3" });
    JFrame f = new JFrame();
    f.setSize(300, 300);
    f.add(new JScrollPane(table));
    f.setVisible(true);
    }
    
}
