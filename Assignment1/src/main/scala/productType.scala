 class productType() {
    var myproduct : Array[Product] = new Array[Product](10)
    var newcategory : Array[Category] = new Array[Category](1)

    def addProduct(product: Product): Unit = {
      for (i <- 0 until myproduct.length) {
        if (myproduct(i) == null) {
          myproduct(i) = product
          return
        }
      }
    }
// alter to replace relationship
    def removeProduct(product: Product): Unit = {
      for (i <- 0 until myproduct.length) {
        if (myproduct(i) == product) {
          myproduct(i) = null
          return
        }
      }
    }
   def addCategory(category: Category): Unit = {
     for (i <- 0 until newcategory.length) {
       if (newcategory(i) == null) {
         newcategory(i) = category
         return
       }
     }
   }

   def removeCategory(category: Category): Unit = {
     for (i <- 0 until newcategory.length) {
       if (newcategory(i) == category) {
         newcategory(i) = null
         return
       }
     }
   }




 }
