package solution

import scroll.internal.Compartment
import task.Target

object Navigation extends Compartment {

  // TODO: Implement the role NavigationRole here!
  object NavigationRole {
    def getTarget() : Target = {
      return new Target("kitchen");
    }
  }
}
