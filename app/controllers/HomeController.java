package controllers;

import actions.Basic;
import play.mvc.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    @Basic
    public Result index() {
        return ok(views.html.index.render());
    }
}
