import Vue from "vue";
import VueRouter from "vue-router";
import  Route  from "vue-router";
import Home from "@/pages/Home"
import Regist from "@/pages/Regist"
import Login from "@/pages/Login"
import Search from "@/pages/Search"
Vue.use(Route)

export default new VueRouter({
    routes:[
        {
            path:"/home",
            component:Home,
            meta:{show:true}
        },
        {
            path:"/regist",
            component:Regist,
            meta:{show:false}
        },
        {
            path:"/login",
            component:Login,
            meta:{show:false}
        },
        {
            path:"/search",
            component:Search,
            meta:{show:true}
        },
        //重定向，在项目运行时立即定向到首页
        {
            path:"*",
            redirect:Home
        }
    ]
})