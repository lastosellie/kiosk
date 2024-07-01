
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import MenuㅡenuManager from "./components/listers/MenuㅡenuCards"
import MenuㅡenuDetail from "./components/listers/MenuㅡenuDetail"

import SalesSalesManager from "./components/listers/SalesSalesCards"
import SalesSalesDetail from "./components/listers/SalesSalesDetail"

import KitchenKitchenManager from "./components/listers/KitchenKitchenCards"
import KitchenKitchenDetail from "./components/listers/KitchenKitchenDetail"

import RestauranttableRestaurantTableManager from "./components/listers/RestauranttableRestaurantTableCards"
import RestauranttableRestaurantTableDetail from "./components/listers/RestauranttableRestaurantTableDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/menus/ㅡenus',
                name: 'MenuㅡenuManager',
                component: MenuㅡenuManager
            },
            {
                path: '/menus/ㅡenus/:id',
                name: 'MenuㅡenuDetail',
                component: MenuㅡenuDetail
            },

            {
                path: '/sales/sales',
                name: 'SalesSalesManager',
                component: SalesSalesManager
            },
            {
                path: '/sales/sales/:id',
                name: 'SalesSalesDetail',
                component: SalesSalesDetail
            },

            {
                path: '/kitchens/kitchens',
                name: 'KitchenKitchenManager',
                component: KitchenKitchenManager
            },
            {
                path: '/kitchens/kitchens/:id',
                name: 'KitchenKitchenDetail',
                component: KitchenKitchenDetail
            },

            {
                path: '/restauranttables/restaurantTables',
                name: 'RestauranttableRestaurantTableManager',
                component: RestauranttableRestaurantTableManager
            },
            {
                path: '/restauranttables/restaurantTables/:id',
                name: 'RestauranttableRestaurantTableDetail',
                component: RestauranttableRestaurantTableDetail
            },




    ]
})
