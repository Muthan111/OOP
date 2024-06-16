import java.util.Date
class Review( customer: Customer, product: Product,private var _details: String, private var _reviewdate: Date = new Date()){

 def details =_details
 def reviewdate = _reviewdate
 def this() = this(new Customer("", 0, new Date(), "", "", "", "","", 0,1000),new Product(),  "",new Date())
 def details_= ( newDetails: String)  {
   _details = newDetails
 }

 def delete(): Unit = {
   details = "";

 }
 def editReview ( descrptionChange: String): Unit = {
   details = descrptionChange
   return details
 }

}
