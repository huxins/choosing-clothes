import Vue from 'vue'
import router from 'vue-router'

Vue.use(router)
//联系客服页面
import Contact_Customer_Service from '../src/components/Contact_Customer_Service'
//品牌公告
import Brand_Announcement from '../src/components/Brand_Announcement'

import Login from '../src/components/main/login'

import Home_Page from '../src/components/main/home_Page'
import detailss from '../src/components/main/details'
import Go_Shopping from '../src/components/main/go_Shopping'
import List_Of_Goods from '../src/components/main/List_Of_Goods'
import shousuokuang from '../src/components/shousuokuang'

var routers = new router({
  mode:"history",
  routes:[
    //登录
    {
      path:'/',
      redirect:'/Home_Page'
    },
    {
      path:"/Login",
      component:Login
    },
    {
      path:'/Home_Page',
      component:Home_Page
    },
    {
      path:'/Home_Page',
      component:Home_Page
    },
    {
      path:'/detailss',
      component:detailss
    },
    {
      path:'/Go_Shopping',
      component:Go_Shopping
    },
    {
      path:'/List_Of_Goods',
      component:List_Of_Goods
    },
    {
      path:'/Contact_Customer_Service',
      component:Contact_Customer_Service
    },
    {
      path:'/Brand_Announcement',
      component:Brand_Announcement
    },
    {
      path:'/shousuokuang',
      component:shousuokuang
    }
  ]
})
export  default routers;

