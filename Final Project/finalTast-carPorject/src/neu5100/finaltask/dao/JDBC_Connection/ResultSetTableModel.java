package neu5100.finaltask.dao.JDBC_Connection;
import java.sql.ResultSet;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Administrator
 */
public class ResultSetTableModel extends AbstractTableModel{
    private ResultSet rs;

    public ResultSetTableModel(ResultSet rs) {
        this.rs = rs;
        fireTableDataChanged();
    }

    @Override
    public int getColumnCount(){
        try{
            if(rs == null){
                return 0;
            }else{
                return rs.getMetaData().getColumnCount();
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
    }

    @Override
    public int getRowCount(){
        try{
            if(rs == null){
                return 0;
            }else{
                rs.last();
                return rs.getRow();
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
    }

    @Override
    public Object getValueAt(int rowIndex,int columIndex){
        if(rowIndex < 0 || rowIndex > getRowCount()
                ||columIndex < 0 || columIndex > getColumnCount()){
            return null;
        }
        try{
            if(rs == null){
                return null;
            }else{
                rs.absolute(rowIndex + 1 );
                return rs.getObject(columIndex + 1);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
    }

    @Override
    public String getColumnName(int column) {
        try{
            return rs.getMetaData().getColumnName(column + 1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return super.getColumnName(column); //To change body of generated methods, choose Tools | Templates.
    }

}

