import org.scalatest.FeatureSpec
import org.scalatest.GivenWhenThen
import org.scalatest.Matchers
import scroll.internal.Compartment
import solution.Actor.DrivableRole
import solution.Behavior
import solution.Behavior.ServiceRole
import solution.Navigation.NavigationRole
import solution.Sensor.ObservingRole
import task.Robot

class RobotTests extends FeatureSpec with GivenWhenThen with Matchers {
  info("Test spec for MOST SCROLL task 1.")

  Given("Your solution for the Roles in the Compartments")
  val r1 = ServiceRole
  val r2 = NavigationRole
  val r3 = ObservingRole
  val r4 = DrivableRole

  feature("Compartments and Roles") {
    scenario("Calling role behavior") {
      Then("Calling their behavior should return the expected values.")
      r2.getTarget shouldBe task.Target("kitchen")
      r3.readSensor shouldBe 100
      r4.getActor shouldBe task.Actor("wheels")
    }

    scenario("Merging all together") {
      val name = "Pete"
      Then("Calling move() should return the expected value.")
      val c = new Compartment {
        val myRobot = Robot(name) play r1 play r2 play r3 play r4

        Behavior partOf this

        val r: task.Result = myRobot move()
        r shouldBe task.Result(
          name,
          task.Target("kitchen"),
          100,
          task.Actor("wheels"))
      }
    }
  }
}
