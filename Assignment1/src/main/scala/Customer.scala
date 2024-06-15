import java.util.Date

class Customer(_name: String,
               _age: Int,
               _dob: Date,
               _email: String,
               _phone: String,
               _address: String,
                _password: String,
               private var _customerID: String,
               private var _loyaltyPoints: Int,
               private var _balance: Int)
  extends User(_name, _age, _dob, _email, _phone, _address,_password) {

  def customerID = _customerID
  def loyaltyPoints = _loyaltyPoints
  def balance = _balance

  def addLoyaltyPoints(points: Int): Unit = {
    _loyaltyPoints += points
  }


}