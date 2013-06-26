import models.{User, AppDB}
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import play.api.test._
import play.api.test.Helpers._
import org.squeryl.PrimitiveTypeMode.inTransaction


class UserModelSpec extends FlatSpec with ShouldMatchers {

  "A user" should "be creatable" in{
    running(FakeApplication(additionalConfiguration = inMemoryDatabase())){
      inTransaction{
        val user = AppDB.userTable.insert(
          User(id = 0, name = "Allan Davis", email = "cajun.code@gmail.com", encrypted_password = "1234556667")
        )
        user.id should not equal(0)
      }
    }
  }

}
