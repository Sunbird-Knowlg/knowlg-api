package modules

import com.google.inject.AbstractModule
import org.sunbird.content.actors.{HealthActor, ObjectActor}
import play.libs.akka.AkkaGuiceSupport
import utils.ActorNames

class KnowlgAPIModule extends AbstractModule with AkkaGuiceSupport {

    override def configure() = {
        // $COVERAGE-OFF$ Disabling scoverage as this code is impossible to test
        //super.configure()
        bindActor(classOf[HealthActor], ActorNames.HEALTH_ACTOR)
        bindActor(classOf[ObjectActor], ActorNames.OBJECT_ACTOR)
        println("Initialized application actors...")
        // $COVERAGE-ON
    }
}
