import java.util.Date

class Admin(_name: String,
            _age: Int,
            _dob: Date,
            _email: String,
            _phone: String,
            _password: String,
            _address: String, private var _adminID: String) extends  User(_name, _age, _dob, _email, _phone, _address,_password){
  var storeOwned : Array[Store] = new Array[Store](1)


  def adminID = _adminID

  def viewCustomerrecords(): Unit = {

  }
  // Function to add store to the admin
  def addStore(newStore: Store): Unit = {
    for (i <- 0 until storeOwned.length) {
      if (storeOwned(i) == null) {
        storeOwned(i) = newStore
        return
      }
    }
  }
  override def register(name: String, email: String, password: String): Unit = {
    name_=(name)
    email_=(email)
    password_=(password)

    println(s"Admin registered.");
  }

  override def login(name: String, email: String, password: String): Unit = {
    name_=(name)
    email_=(email)
    password_=(password)

    println(s"User logged in.");
  }
  override def login(email: String, password: String): Unit = {
    email_=(email)
    password_=(password)
    println(s"User logged in.");


  }
  override def logout(): Unit = {
    print("Admin logged out");
  }

  override def viewProfile (): Unit = {
    return name + " " + email + " " + age + "" + dob + adminID
  }


}
