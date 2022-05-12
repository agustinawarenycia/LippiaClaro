package services;

import com.claro.sp.tecnoapis.model.subscriber.Cellular;
import com.crowdar.api.rest.MethodsService;

public class BaseService extends MethodsService {

    public static final ThreadLocal<String> linea = new ThreadLocal<String>();
    public static final ThreadLocal<String> monto = new ThreadLocal<String>();
    public static final Cellular cellular = new Cellular();





}
