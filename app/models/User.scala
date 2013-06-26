package models

import org.squeryl.KeyedEntity

case class User(id: Long,
                name: String,
                email: String,
                encrypted_password:String
              ) extends KeyedEntity[Long]


