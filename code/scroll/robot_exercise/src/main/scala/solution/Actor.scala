package solution

import scroll.internal.Compartment
import task.Actor

object Actor extends Compartment {

  // TODO: Implement the role DrivableRole here!
  object DrivableRole {
    def getActor() : Actor = {
      return new Actor(name = "wheels")
    }
  }
}
