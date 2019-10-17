import scroll.internal.Compartment
import solution.Behavior
import task.Robot
import solution.Behavior.ServiceRole
import solution.Navigation.NavigationRole
import solution.Sensor.ObservingRole
import solution.Actor.DrivableRole

object Main extends App {
  new Compartment {
    // constructing a Robot with its roles
    val myRobot = Robot("Pete") play ServiceRole play NavigationRole play ObservingRole play DrivableRole

    // merging all the role-playing-relations defined above
    Behavior partOf this

    // calling the actual behavior
    println(myRobot move())
  }
}