
package FuncionesFDS;

import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;

/**
 *
 * @author USER
 */
public class funciones {
    
    SimpleDateFormat Formato = new SimpleDateFormat("yyyy-MM-dd");
    public String getFecha(JDateChooser jd) {
        if (jd.getDate() != null) {
            return Formato.format(jd.getDate());
        } else {
            return null;
        }
    }
    
    
}
