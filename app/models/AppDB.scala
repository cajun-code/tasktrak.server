package models

import org.squeryl.Schema
import org.squeryl.PrimitiveTypeMode._

object AppDB extends Schema{

  val userTable = table[User]("users")
  val taskTable = table[Task]("tasks")

  on(userTable){ p => declare {
    p.id is(autoIncremented)
  }}

  on(taskTable){ p => declare {
    p.id is(autoIncremented)
  }}
}
