import java.util.Date

class Admin(_name: String,
            _age: Int,
            _dob: Date,
            _email: String,
            _phone: String,
            _password: String,
            _address: String, private var _adminID: String) extends  User(_name, _age, _dob, _email, _phone, _address,_password){
  def adminID = _adminID

  def viewCustomerrecords(): Unit = {

  }


}
