package solution

import scroll.internal.Compartment
import task.{Result, Target}

object Behavior extends Compartment {

  // TODO: Implement the role ServiceRole here!
  object ServiceRole {
    def move(): Result = {
      return Result(+this name, +this getTarget(), +this readSensor(), +this getActor())
    }
  }
}
