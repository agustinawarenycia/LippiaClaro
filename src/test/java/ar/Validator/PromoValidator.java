package ar.Validator;

//import api.model.project.ProjectResponse;
import api.model.promoPlusModel.ProductOfferingQualificationItemItem;
import api.model.promoPlusModel.ResponsePromoPlusModel;
import com.crowdar.api.rest.APIManager;
import com.crowdar.api.rest.Response;
import org.testng.Assert;

public class PromoValidator {
    static Response response;
    static ResponsePromoPlusModel responsePost;

    public static void validate(String pDato, String pVoz, String pDinero){
        ProductOfferingQualificationItemItem response = (ProductOfferingQualificationItemItem) APIManager.getLastResponse().getResponse();
        System.out.println(response);



        //Assert.assertEquals(name,response.getName(),"Nombre de proyecnto no coincide");
    }
//    public static void validateSearch(){
//        ProjectResponse[] response = (ProjectResponse[]) APIManager.getLastResponse().getResponse();
//        Assert.assertTrue(response.length > 0, "No tiene proyectos cargados");
//    }
}
