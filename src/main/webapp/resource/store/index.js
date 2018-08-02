import Vue from 'vue';
import Vuex from 'vuex'
Vue.use(Vuex);
var store = new  Vuex.Store({
  state:{
      test:"测试",
     data:[]
  },
  mutations:{
    test(state,test){
        state.test = test;
    },
    saveData(state,data){
        console.log("数据",data);
        state.data = data;

    }
  },
  actions:{
    saveData(context,data){
      context.commit('saveData',data);
    }
  }

})
export default store;
