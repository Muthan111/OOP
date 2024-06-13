import java.util.Date

 abstract class User( private var _name: String,
                      private var _age: Int,
                      private var _dob: Date,
                      private var _email: String,
                      private var _phone: String,
                      private var _address: String)
{
  def name = _name
  def age = _age
  def dob = _dob
  def email = _email
  def phone = _phone
  def address = _address
  def this() = this("", 0, new Date(), "", "", "")

  def name_= (value: String): Unit = _name = value
  def age_= (value: Int): Unit = _age = value
  def dob_= (value: Date): Unit = _dob = value
  def email_= (value: String): Unit = _email = value
  def phone_= (value: String): Unit = _phone = value
  def address_= (value: String): Unit = _address = value


  def login(): Unit = {
    println(s"User $_name logged in.")
  }
}