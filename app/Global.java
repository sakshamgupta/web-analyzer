import controllers.routes;
import play.GlobalSettings;
import play.libs.F;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Results;

/**
 * Created by saksham on 22/01/16.
 */
public class Global extends GlobalSettings {
    @Override
    public F.Promise<Result> onHandlerNotFound(Http.RequestHeader request) {
        return F.Promise.pure(Results.redirect(routes.Application.index()));
    }
}
