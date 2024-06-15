import java.util.Date
object Driver {
  def main(args: Array[String]): Unit = {
  val phone = new Product("s21", "Samsung S Series", 10,"black")
  val mycustomer = new Customer("John", 25, new Date(), "", "", "","", "123", 0,1000)
  mycustomer.register("John", "th34rm@gmail.com", "password")
  val smartphone = new productType()
  smartphone.addProduct(phone)
  val storecategory = new Category
  storecategory.addType(smartphone)
  println(storecategory.toString)
  val myorder  = new Order
  myorder.cart(phone)
  myorder.displayCustomer(mycustomer)
  print(mycustomer.viewProfile())




  }
}