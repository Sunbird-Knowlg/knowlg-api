package actors

import org.sunbird.actor.core.BaseActor
import org.sunbird.common.dto.{Request, Response, ResponseHandler}

import scala.concurrent.{ExecutionContext, Future}

class TestActor extends BaseActor {

  implicit val ec: ExecutionContext = getContext().dispatcher

  override def onReceive(request: Request): Future[Response] = {
    Future(ResponseHandler.OK)
  }
}