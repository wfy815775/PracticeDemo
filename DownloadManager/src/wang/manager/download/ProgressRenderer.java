package wang.manager.download;

import java.awt.Component;

import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class ProgressRenderer extends JProgressBar
implements TableCellRenderer{

	public ProgressRenderer(int min, int max) {
      super(min , max);
	 }
	
	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		setValue((int)  ((Float)value).floatValue());
    
		return this;
	}

}
