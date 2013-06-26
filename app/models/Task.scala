package models

import org.squeryl.KeyedEntity


case class Task(id:Long,
                title:String,
                complete:Boolean = false,
                note:String = "") extends KeyedEntity[Long]
