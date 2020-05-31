package com.aa.android.cleanarchilearning.productScene

class ProductsInteractor(var presenter: ProductsInteractorOutput? = null) : ProductsInteractorInput {

    override fun getProduct() {
        val product = Product("1234567", "iMac", 4321.32f)
        presenter?.productRetrieved(product)
    }
}