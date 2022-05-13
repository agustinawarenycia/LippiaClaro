import com.claro.sp.automation.objetosPrepago.Properties;
import com.crowdar.bdd.cukes.TestNGParallelRunner;
import org.junit.BeforeClass;

public class ApiExampleProjectParalellTestRunner extends TestNGParallelRunner {
    @BeforeClass
    public static void beforeTest() throws Exception {

        //se obtienen las variables parametricas, utilizar las necesarias en cada caso
        Properties.userCcard     = "ghct";//System.getProperty("UserCcard");
        Properties.passwordCcard = "auto_333";//System.getProperty("PasswordCcard");
//
        Properties.userProd      = "ghct";//System.getProperty("UserProd");
        Properties.passwordProd  = "auto_333";//System.getProperty("PasswordProd");
//
        Properties.environment   = "TEST";//System.getProperty("Environment");
        Properties.country       = "AR";//System.getProperty("Country");

       // Properties.cellularNumber = System.getProperty("CellularNumber");
       // Properties.flagCpa = Boolean.valueOf(System.getProperty("FlagCpa"));

        //Se validan que las propiedades no sean nulas o tengan los valores esperados
        //Si se agregan o se eliminan propiedades, se debe actualizar el validate()
        //Properties.validate();
    }
}
