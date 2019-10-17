package solution

import scroll.internal.Compartment

object Sensor extends Compartment {

  // TODO: Implement the role ObservingRole here!
  object ObservingRole  {
    def readSensor() : Int = {
      return 100;
    }
  }

}
