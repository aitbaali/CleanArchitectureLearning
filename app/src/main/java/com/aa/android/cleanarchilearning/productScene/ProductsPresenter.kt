package com.aa.android.cleanarchilearning.productScene

class ProductsPresenter(
    var view: ProductsViewInput? = null,
    var interactor: ProductsInteractorInput? = null
) : ProductsViewOutput, ProductsInteractorOutput {

    override fun productButtonPressed() {
        interactor?.getProduct()
    }

    override fun productRetrieved(product: Product) {
        view?.updateProductName(product.name)
    }
}