import java.util.Date

 abstract class User( private var _name: String,
                      private var _age: Int,
                      private var _dob: Date,
                      private var _email: String,
                      private var _phone: String,
                      private var _address: String,
                      private var _password: String)
{
  def name = _name
  def age = _age
  def dob = _dob
  def email = _email
  def phone = _phone
  def address = _address
  def password = _password
  def this() = this("", 0, new Date(), "", "", "","")

  def name_= (value: String): Unit = _name = value
  def age_= (value: Int): Unit = _age = value
  def dob_= (value: Date): Unit = _dob = value
  def email_= (value: String): Unit = _email = value
  def phone_= (value: String): Unit = _phone = value
  def address_= (value: String): Unit = _address = value
  def password_= (value: String): Unit = _password = value
  def register(name: String, email: String, password: String): Unit = {
    name_=(name)
    email_=(email)
    password_=(password)

    println(s"User registered.");

  }
  def login(name: String, email: String, password: String): Unit = {
    name_=(name)
    email_=(email)
    password_=(password)

    println(s"User logged in.");
  }
  def login(email: String, password: String): Unit = {
    email_=(email)
    password_=(password)
    println(s"User logged in.");


  }
  def logout(): Unit = {
    print("User logged out");
  }
  def viewProfile (): Unit = {
    return name + " " + email + " " + age + "" + dob
  }
}