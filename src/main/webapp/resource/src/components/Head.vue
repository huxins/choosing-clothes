<template>
  <div class="public_Head">
    <div class="header1">
      <div class="header_one">
        <ul>
          <li><a @click="go_login" href="">登录</a></li>
          <li><a @click="go_zhuce" href="">注册</a></li>
          <li><a href="">个人页面</a></li>
          <li><a href="">品牌公告</a></li>
          <li><a @click="go_kefu" href="">在线客服</a></li>
        </ul>
      </div>
    </div>
    <div class="header2">
      <div class="header_two_logo">
        <div class="logo_img">
          <a href="#">
            <img src="https://www.thefaceshop.com.cn/skin/frontend/tfs/desktop_eguana/images/logo.gif" alt="">
          </a>
        </div>
        <div class="logo_inp">
          <span>正品认证</span>
          <form action="">
            <input v-model="seaVal" @change="search()" placeholder="搜索商品" type="text">
          </form>
          <!--<ul class="search_list">-->
            <!--<li v-for="v,k in search_lie"></li>-->
          <!--</ul>-->
        </div>
      </div>
    </div>
    <div class="header3">
      <div class="search">
        <ul class="search_title">
          <li @mouseout="canShow=false" @mouseover="canShow=true">
            <span>品牌简介</span>
            <div v-show="canShow" @mouseout="canShow=false" @mouseover="canShow=true" class="search_show">
              <ul class="search_ul">
                <li>品牌介绍</li>
                <li>品牌广告</li>
                <li>品牌咨询</li>
                <li>社会责任</li>
              </ul>
              <img src="http://www.thefaceshop.com.cn/media/wysiwyg/tfs/eguana/main/gnb/gnb_menu_4_1_07311.jpg" alt="">
              <img src="http://www.thefaceshop.com.cn/media/wysiwyg/tfs/eguana/main/gnb/gnb_menu_3_2.jpg" alt="">
            </div>
          </li>
          <li @mouseout="canShow=false" @mouseover="canShow=true">
            <span>产品类别</span>
            <div v-show="canShow" @mouseout="canShow=false" @mouseover="canShow=true" class="search_show">
              <ul class="search_ul">
                <li @click="go_liebiao(v.sortname,0)" @mouseover="keysort=k" v-for="v,k in result[0]">{{v.sortname}}</li>
                <!--<li>品牌广告</li>-->
                <!--<li>品牌咨询</li>-->
                <!--<li>社会责任</li>-->
              </ul>
              <ul class="ul_2">
                <li @click="go_erji(result[0][keysort].sortname,v.sortname,0)"  v-for="v,k in result[0][keysort].childrenCommodity">{{v.sortname}}</li>
              </ul>
              <img src="http://www.thefaceshop.com.cn/media/wysiwyg/tfs/eguana/main/gnb/gnb_menu_1_1025.jpg" alt="">
            </div>
          </li>
          <li @mouseout="canShow=false" @mouseover="canShow=true">
            <span>产品系列</span>
            <div v-show="canShow" @mouseout="canShow=false" @mouseover="canShow=true" class="search_show">
              <ul class="search_ul">
                <li @click="go_liebiao(v.seriesname,1)" @mouseout="keysort1=k" v-for="v,k in result[1]">{{v.seriesname}}</li>
                <!--<li>品牌广告</li>-->
                <!--<li>品牌咨询</li>-->
                <!--<li>社会责任</li>-->
              </ul>
              <ul class="ul_3">
                <li @click="go_erji(result[1][keysort1].seriesname,v.seriesname,1)"  v-for="v,k in result[1][keysort1].childrenCommodity">{{v.seriesname}}</li>
              </ul>
              <img class="ul_3Img" src="http://www.thefaceshop.com.cn/media/wysiwyg/tfs/eguana/main/gnb/gnb_menu_2.jpg" alt="">
            </div>
          </li>
          <li @mouseout="canShow=false" @mouseover="canShow=true">
            <span>产品榜单</span>
            <div v-show="canShow" @mouseout="canShow=false" @mouseover="canShow=true" class="search_show">
              <ul class="search_ul">
                <li>新品榜单</li>
                <li>畅销榜单</li>
                <li>本月热推</li>
              </ul>
              <img src="http://www.thefaceshop.com.cn/media/wysiwyg/tfs/eguana/main/gnb/gnb_menu_3_1_1025.jpg" alt="">
              <img src="http://www.thefaceshop.com.cn/media/wysiwyg/tfs/eguana/main/gnb/gnb_menu_3_2_1025.jpg" alt="">
            </div>
          </li>
          <li @mouseout="canShow=false" @mouseover="canShow=true">
            <span>社区活动</span>
            <div v-show="canShow" @mouseout="canShow=false" @mouseover="canShow=true" class="search_show">
              <ul class="search_ul">
                <li>本月试用</li>
                <li>图片评价</li>
                <li>菲诗美颜TIP</li>
                <li>菲诗SNS</li>
              </ul>
              <img src="http://www.thefaceshop.com.cn/media/wysiwyg/tfs/eguana/main/gnb/gnb_menu_5.jpg" alt="">
            </div>
          </li>
          <li>店铺指南</li>
        </ul>
      </div>
    </div>
  </div>

</template>

<script>
    export default {
        name: "Head",
      data:function(){
        return {
          canShow:false,
          result:[[[{childrenCommodity:''}]],["dsa"]],
          keysort:0,
          keysort1:0,
          seaVal:"",
          search_lie:""
        }
      },
      methods:{
          go_login(){
            this.$router.push("/login?a=1");
          },
        go_zhuce(){
          this.$router.push("/login?a=2");
        },
        go_kefu(){
            this.$router.push("/Contact_Customer_Service");
        },
        go_liebiao(lis,c){
            console.log(lis,c);
          $.ajax({
            type:"post",
            url:`http://10.80.9.234:8093/list`,
            data:{
              seriesname:lis,
              rank:c
            },
            success: (data)=> {
              // console.log(data);
              data = JSON.stringify(data);
              sessionStorage.setItem('list1',data);
              this.$router.push(`/List_Of_Goods?p=${lis}&ye=1`);
            }
          })
        },
        go_erji(a,b,c){
            // console.log(a,b);
          $.ajax({
            type:"post",
            url:`http://10.80.9.234:8093/list`,
            data:{
              sortname:b,
              seriesname:a,
              rank:c
            },
            // dataType:"json",
            success:(data)=> {
              // console.log(data);
              data = JSON.stringify(data);
              sessionStorage.setItem('list',data);
              // this.$store.dispatch('saveData',data);
              this.$router.push(`/List_Of_Goods?p=${a}&w=${b}&ye=2`);
            }
          })
        },
        search(){
            $.ajax({
              type:"post",
              url:'http://10.80.9.234:8093/search',
              data:{
                commodityname:this.seaVal
              },
              success:(data)=>{
                console.log(data);
                this.search_lie = data;
              }
            })
        }
      },
      created: function () {
        fetch("http://10.80.9.234:8093/classify", {}).then((res)=>{
          return res.json();
        }).then((res)=>{
          this.result = res;
          // console.log(this.result);
        }).catch((error)=>{
          console.log(error);
        })
      }
    }
</script>

<style lang="less" scoped>
.public_Head{
  width: 100vw;
  height: 180px;
  .header1{
    width: 100%;
    height: 31px;
    background-color: #f3f3f5;
    .header_one{
      width: 1100px;
      height: 31px;
      margin: 0 auto;
      font-size: 12px;
      ul{
        padding: 0;
        margin: 0;
        float: right;
        li{
          float: left;
          line-height: 30px;
          text-align: center;
          list-style: none;
          width: 73px;
          height: 30px;
          border-right: 1px solid #dcdcde;
          a{
            color: #919191;
            text-decoration: none;
          }
        }
        li:nth-child(1){
          border-left: 1px solid #dcdcde;
        }
        li:hover>a{
          text-decoration: underline;
          color: #b4885a;
        }
      }
    }
  }
  .header2{
    width: 100%;
    height: 99px;
    .header_two_logo{
      width: 1100px;
      height: 99px;
      margin: 0 auto;
      .logo_img{
        float: left;
        width: 230px;
        height: 100%;
        a{
          line-height: 99px;
        }
      }
      .logo_inp{
        float: right;
        width: 345px;
        height: 100%;
        position: relative;
        .search_list{
          padding: 0;
          margin: 0;
          width: 260px;
          height: 100px;
          background-color: red;
          position: absolute;
          top: 64px;
          left: 80px;
          z-index: 111;
          li{
            list-style: none;
            height: 50px;
            width: 100%;
            border-bottom: 1px solid #dedede;
          }
        }
        span{
          width: 56px;
          height: 40px;
          display: inline-block;
          color: #5A493F;
          float: left;
          font-size: 14px;
          line-height: 99px;
        }
        form{
          input{
            width: 260px;
            height: 40px;
            padding: 10.5px 42px 10.5px 10px;
            box-sizing: border-box;
            border: 2px solid #8b6a47;
            background: url("../assets/inp.png") no-repeat 98% 8px;
            background-size: 20px auto;
          }
          width: 262px;
          height: 41px;
          float: left;
          box-sizing: border-box;
          background: #FFF;
          color: #8b6a47;
          line-height: 1;
          margin-top: 7%;
          margin-left: 24px;
        }
      }
    }
  }
  .header3{
    width: 100%;
    height: 50px;
    background-color: #3b322b;
    .search{
      width: 1100px;
      height: 100%;
      margin: 0 auto;
      .search_title{
        margin: 0;
        padding: 0;
        width: 100%;
        list-style: none;
        position: relative;
        li:nth-child(1){
          border-left: 1px solid #5e5957;
        }
        li:hover{
          background-color: rgb(0 , 0, 0);
        }
        li:hover>.search_show{
          display: block;
          position: absolute;
          z-index: 111;
        }
        li{
          width: 183px;
          height: 50px;
          text-align: center;
          line-height: 50px;
          color: white;
          border-right: 1px solid #5e5957;
          float: left;
          box-sizing: border-box;
          .search_show{
            width: 1098px;
            height: 460px;
            border: 1px solid #5e5957;
            box-sizing: border-box;
            position: absolute;
            top: 50px;
            left: 0;
            overflow: hidden;
            .search_ul{
              padding: 0;
              margin: 0;
              width: 180px;
              height: 460px;
              background-color: #f8f8f8;
              float: left;
              li{
                width: 100%;
                height: 46px;
                box-sizing: border-box;
                border-bottom: 1px solid #e4e4e4;
                color: #555;
                list-style: none;
                a{
                  color: #555;
                  text-decoration: none;
                }
              }
              li:hover{
                color: orange;
              }
            }
            .ul_3Img{
              width: 365px;
              height: 458px;
              float: right;
            }
            .ul_3{
              width: 518px;
              height: 450px;
              float: left;
              border-right: 1px solid #5e5957;
              display: table-cell;
              vertical-align: top;
              box-sizing: border-box;
              padding: 5px 15px;
              margin: 0;
              background-color: white;
              li{
                background-color: white;
                color:black;
                float: left;
                width: 150px;
                height: 50px;
                text-align: center;
                line-height: 50px;
                list-style: none;
                border: 0px;
                margin-left: 10px;
              }
              li:hover{
                color: orange;
              }
            }
            .ul_2{
              width: 180px;
              height: 460px;
              background-color: white;
              padding: 0;
              margin: 0;
              list-style: none;
              float: left;
              color: black;
              li{
                background-color: white;
                color: black;
              }
              li:hover{
                color: orange;
              }
            }
            .search_ul>li:hover{
              border: 1px solid #5e5957;
              border-left: 0px;
              background: transparent;
              border-right: 1px solid transparent;
            }
            img{
              float: left;
            }
          }
        }
        li:nth-child(1):hover .search_show{
          z-index: 111;
          background-color: white;
        }
      }
    }
  }
}
</style>
