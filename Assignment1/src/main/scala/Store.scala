 class Store ( val _name: String,  val _address: String, val _about: String,  val newcategory: Category)
{

  def name = _name
  def address = _address
  def about = _about
  def this() = this("", "","",new Category())
  def storeCategory: Category = newcategory
  def Search(): Unit = {

  }
  var noOfAdmin: Array[Admin] = new Array [Admin](5)
  def addAdmin(newadmin: Admin): Unit = {
    for (i <- 0 until noOfAdmin.length) {
      if (noOfAdmin(i) == null) {
        noOfAdmin(i) = newadmin
        return
      }
    }
  }
  def welcomw(): Unit = {
    print("Welcome to our Site")
    print("press 1 to see our about page")
    print("press 2 to make an order")
    print("press 3 to see our catalog of products")
    print("press 4 to contact us")
    print("press 5 to register")
    print("press 6 to login")
    print("press 7 to logout")
  }
  def displaywebsite(): Unit = {
    var customerInput = scala.io.StdIn.readLine()
    if (customerInput == "1") {
      print(about)
    }
    else if (customerInput == "2") {
      print("Catalog of products")
    }
    else if (customerInput == "3") {
      print("place an order")
    }
    else if (customerInput == "4") {
      print("contact us")
    }
    else if (customerInput == "5") {
      print("register")
    }
    else if (customerInput == "6") {
      print("login");
    }
    else if (customerInput == "7"){
      print("logout");
    }
    else {
      print("Invalid input")
    }
  }
  def displayCategory (newcategory: Category): Unit = {
    // write code to display category events

  }


}
