import models.{Task, AppDB}
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import org.squeryl.PrimitiveTypeMode._
import play.api.test.FakeApplication
import play.api.test.FakeApplication
import play.api.test.Helpers._

class TaskModelSpec extends FlatSpec with ShouldMatchers {

  "A task" should "be creatable" in{
    running(FakeApplication(additionalConfiguration = inMemoryDatabase())){
      inTransaction{
        val task = AppDB.taskTable.insert(
          Task(id = 0, title = "Hello World" )
        )
        task.id should not equal(0)
      }
    }
  }

}