import java.util.Date
class Order
{
  private var quantity : Int = 0
  private var orderDate : Date = new Date()
  def cart (product : Product): Unit = {
    println(product.name)
    println(product.color)
    println(product.model)



  }
  def displayCustomer (customer: Customer): Unit = {
    println(customer.name)
    println(customer.address)
  }
  def displayOrder (product : Product, customer: Customer): Unit = {
    println("Order displayed")
  }
  def makePayment (customer: Customer, product : Product): Unit = {
     customer.balance - product.price
  }
}
