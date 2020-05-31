package com.aa.android.cleanarchilearning.productScene

class ProductSceneConfigurator {

    companion object {
        val interactor = ProductsInteractor()
        val presenter = ProductsPresenter()

        fun makeScene(view: ProductsActivity): ProductsActivity {

            view.presenter = presenter

            presenter.view = view
            presenter.interactor = interactor

            interactor.presenter = presenter

            return view
        }
    }
}