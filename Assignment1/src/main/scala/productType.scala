 class productType() {
    var myproduct : Array[Product] = new Array[Product](10)

    def addProduct(product: Product): Unit = {
      for (i <- 0 until myproduct.length) {
        if (myproduct(i) == null) {
          myproduct(i) = product
          return
        }
      }
    }

    def removeProduct(product: Product): Unit = {
      for (i <- 0 until myproduct.length) {
        if (myproduct(i) == product) {
          myproduct(i) = null
          return
        }
      }
    }



}
