import java.util.Date

class Customer(_name: String,
               _age: Int,
               _dob: Date,
               _email: String,
               _phone: String,
               _address: String,
               private var _customerID: String,
               private var _loyaltyPoints: Int)
  extends User(_name, _age, _dob, _email, _phone, _address) {

  def customerID = _customerID
  def loyaltyPoints = _loyaltyPoints

  def addLoyaltyPoints(points: Int): Unit = {
    _loyaltyPoints += points
  }

  override def login(): Unit = {
    println(s"Customer $_name logged in with customer ID $_customerID.")
  }
}