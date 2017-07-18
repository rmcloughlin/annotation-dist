package actions;

import java.util.concurrent.CompletionStage;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;

public class BasicAction extends Action<Basic> {
  @Override
  public CompletionStage<Result> call(Http.Context ctx) {
    return delegate.call(ctx);
  }
}
