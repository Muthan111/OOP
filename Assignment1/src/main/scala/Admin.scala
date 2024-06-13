import java.util.Date

class Admin(_name: String,
            _age: Int,
            _dob: Date,
            _email: String,
            _phone: String,
            _address: String, private var _adminID: String) extends  User(_name, _age, _dob, _email, _phone, _address){
  def adminID = _adminID

  def viewCustomerrecords(): Unit = {

  }
  override def login(): Unit = {
    println(s"admin $_name logged in with customer ID $_adminID.")
  }
}
