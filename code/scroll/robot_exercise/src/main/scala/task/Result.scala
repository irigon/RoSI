package task

case class Target(name: String)

case class Actor(name: String)

case class Result(
                   name: String,
                   target: Target,
                   sensorValue: Int,
                   actor: Actor
                 )
