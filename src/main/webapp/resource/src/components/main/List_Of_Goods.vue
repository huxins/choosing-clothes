<template>
<div>
  <!--{{getYema}}-->
  <Head></Head>
  <div  class="list_of_Goods_content">
    <div class="list_of_Goods_contentC">
      <div class="list_of_Goods_contentC_title">
        <h1 class="title_le">{{ getTitle}}</h1>
        <div class="title_rig">
          <a href="">主页</a>>
          <a href="">产品列表</a>>
          <a href="">{{ getTitle }}</a>
          <a href="">>{{getYema == 2 ? getname :  "" }}</a>
        </div>
      </div>
      <div class="list_of_Goods_contentC_con1">
        <ul class="clearFloat">
          <li @click="changsgitu(getTitle,v.sortname == null ?v.seriesname:v.sortname ,v.sortname == null ?1:0)" :class="getname.replace(/\%2F/,'\/') == v.sortname || v.sortname == getname||v.seriesname == getname ?'Bg1':''" v-for="v,k in list_goods">{{v.sortname == null ?v.seriesname:v.sortname }}</li>
        </ul>
      </div>
      <div class="list_of_Goods_contentC_con2">
        <ul>
          <li><a href="">综合</a>|</li>
          <li><a href="">最新上市</a>|</li>
          <li><a href="">商品评论</a></li>
          <li @click="CanTr=!CanTr">12每页 <img src="http://www.thefaceshop.com.cn/skin/frontend/tfs/desktop/formalize/images/select_arrow.gif" alt="">
            <ul v-show="CanTr">
              <li>12每页</li>
              <li>24每页</li>
              <li>36每页</li>
            </ul>
          </li>
        </ul>
      </div>
      <div class="list_of_Goods_contentC_con3">
        <ul class="clearFloat">

          <li v-for="v,k in result">
            <div class="con3_img">
              <img :src="`http://10.80.9.234:8093/pic/${v.pic.split('|')[0]}`" alt="">
            </div>
            <div class="flag">
              <span>{{v.effect}}</span>
              <span>{{v.skintype}}</span>
            </div>
            <h2>{{v.commodityname}}</h2>
            <div class="BgImg"></div>
          </li>

        </ul>
      </div>

      <div class="conent_footer">
        <div class="footer">
          <div class="footer_left">
            <div class="table">
              <div class="table_cell">
                <img src="http://www.thefaceshop.com.cn/media/wysiwyg/tfs/eguana/mobile/footer_logo2.png" alt="">
              </div>
              <div class="table_cell_p">
                作为韩国崇尚自然主义的护肤品牌，THEFACESHOP秉持 “以源于自然的成分研制出高品质护肤化妆品” 的品牌精髓 以大自然的治愈能量为品牌信念，创立了韩系/高端自然主义...
                <a href="">更多></a>
              </div>
              <div class="table_mingchen">
                <p>公司名称 : 菲诗小铺(上海)化妆品销售有限公司 ICP号码 : 沪ICP备12046938号-2 <br>
                  工作时间 : 9:00~22:00（平日） 9:00~18:00（周六）</p><br>
              </div>
            </div>
            <div class="table_ri">
              <img src="http://www.thefaceshop.com.cn/media/wysiwyg/footer/weibo_1.png" alt="">
              <img src="http://www.thefaceshop.com.cn/media/wysiwyg/footer/tianmao.png" alt="">
              <img src="http://www.thefaceshop.com.cn/media/wysiwyg/footer/youku.png" alt="">
            </div>
          </div>
          <div class="footer_right">
            <div class="footer_biaodan">
              <div class="footer_right_1">
                订阅新闻报
              </div>
              <form action="">
                <input type="text" placeholder="请输入邮箱地址">
                <button>订阅</button>
              </form>
            </div>
          </div>
        </div>
      </div>
      <div class="footer_bottom">
        <div class="footer_bottonn_ce">
          <p>© COPYRIGHT THEFACESHOP 菲诗小铺(上海)化妆品销售有限公司 | 隐私声明  沪ICP备12046938号-2</p>
        </div>
      </div>
    </div>
  </div>
</div>
</template>

<script>
  // console.log((window.location));
  function queryString(url){
    let arr=[];
    let res={};
    arr=url.split("?")[1].split("&");

    for(let i=0,len=arr.length;i<len;i++){
      if(arr[i].indexOf("=")!=-1){
        let str=arr[i].split("=");
        res[str[0]]=str[1];
      }else{//没有等号，则赋予空值
        res[arr[i]]="";
      }
    }
    res=JSON.stringify(res);//转化为JSON字符串
    return res; //{"a": "1", "b": "2", "c": "test", "d": ""}
  }
  // console.log(sessionStorage.getItem('list1'));
  // console.log(queryString(decodeURI(window.location.search)));
  import Head from '../Head'
    export default {
      name: "List_Of_Goods",
      components: {
        Head
      },
      data: function () {
        return {
          result: [],
          Nurl:"",
          CanTr:false,
          arr:[],
          list_goods:[],//二级标题
          Bg:false
        }
      },
      methods:{
        changsgitu(a,b,c){
          console.log(a,b,c)
          $.ajax({
            type:"post",
            url:`http://10.80.9.234:8093/list`,
            data:{
              //?sortname=美白亮彩系列&seriesname=女性基础&rank=1
              sortname:b,
              seriesname:a,
              rank:c
            },
            // dataType:"json",
            success:(data)=> {
              this.result = data;
              // console.log(data);
              // data = JSON.stringify(data);
              // sessionStorage.setItem('list',data);
              // this.$store.dispatch('saveData',data);
              // this.$router.push(`/List_Of_Goods?p=${a}&w=${b}&ye=2`);
            }
          })
        }
      },
      computed:{
          getTitle(){
            return JSON.parse(queryString(decodeURI(window.location.search))).p
          },
          getYema(){
            return JSON.parse(queryString(decodeURI(window.location.search))).ye
          },
        getname(){
            if (JSON.parse(queryString(decodeURI(window.location.search))).w) {
              return JSON.parse(queryString(decodeURI(window.location.search))).w;
            }else{
              return "";
            }
        }
      },
      created:function () {
        console.log(1111);
        fetch("http://10.80.9.234:8093/classify", {}).then((res)=>{
          return res.json();
        }).then((res)=>{
          // console.log(res);
          this.Nurl = queryString(decodeURI(window.location.search));
            this.arr = res;
            let aa = 0;
            for (let i = 0; i < this.arr[0].length; i++) {
              if (JSON.parse(this.Nurl).p==this.arr[0][i].sortname){
                aa=1;
                this.list_goods = this.arr[0][i].childrenCommodity;
              }
            }
            if (aa == 0) {
              for (let i = 0; i < this.arr[1].length; i++) {
                if (JSON.parse(this.Nurl).p==this.arr[1][i].seriesname){
                  this.list_goods = this.arr[1][i].childrenCommodity;
                }
              }
            }
          console.log(this.list_goods);
        }).catch((error)=>{
          console.log(error);
        })

        // console.log(this.result);//list1是商品列表东西
        // console.log(JSON.parse(this.Nurl).p);//一级标题名称
        // console.log(this.arr);
        // console.log(JSON.parse(this.Nurl).p,this.arr.sortname);

      }
      ,mounted(){
        // console.log(sessionStorage['list1'])
        if (this.Nurl.ye == 1){
          this.result = JSON.parse(sessionStorage['list1']);
        }else{
          this.result = JSON.parse(sessionStorage['list']);
        }
      }
    }
</script>

<style lang="less" scoped>
  .clearFloat:after{
    height: 0;
    display: block;
    content: "";
    visibility: hidden;
    clear: both;
  }
.list_of_Goods_content{
  width: 1100px;
  margin: 0 auto;
  .list_of_Goods_contentC{
    width: 100%;
    padding-top: 20px;
    .list_of_Goods_contentC_title{
      width: 1100px;
      height: 52px;
      margin-bottom: 30px;border-bottom: 2px solid #333333;
      h1{
        float: left;
        margin: 0;
      }
      div{
        float: right;
        line-height: 50px;
        a{
          text-decoration: none;
          color: #3b322b;
          font-size: 12px;
        }
        a:hover{
          text-decoration: underline;
        }
      }
    }
    .list_of_Goods_contentC_con1{
      width: 1100px;
      margin: 0 auto;
      margin-bottom: 40px;
      ul{
        margin: 0;
        padding: 0;
        list-style: none;
        width: 100%;
        border-bottom: 1px solid #6d9811;
        border-left: 1px solid #e1e4e8;
        border-top: 1px solid #e1e4e8;
        li{
          float: left;
          width: 183px;
          line-height: 48px;
          text-align: center;
          height: 48px;
          border-right: 1px solid #e1e4e8;
          border-bottom: 1px solid #dedede;
          box-sizing: border-box;
        }
        .Bg1{
          background-color: #6d9811;
          color: white;
        }
      }
    }
    .list_of_Goods_contentC_con2{
      width: 1100px;
      height: 40px;
      margin: 0 auto;
      text-align: right;
      border-bottom: solid 1px #9ea0a3;;
      padding: 0px 0px 10px 0px;
      box-sizing: border-box;

      ul{
        margin: 0;
        padding: 0;
        list-style: none;
        width: 280px;
        height: 40px;
        float: right;
        text-align: right;
        clear: both;
        li{
          float: left;
          width: 65px;
          height: 40px;
          text-align: center;
          font-size: 12px;
          padding: 10px 0;
          box-sizing: border-box;
          a{
            text-decoration: none;
            color: grey;
            margin-right: 10px;
          }
        }
        li:nth-child(4){
          width: 80px;
          height: 30px;
          line-height: 1;
          border: 1px solid grey;
          text-align: left;
          position: relative;
          ul{
            width: 80px;
            height: 90px;
            margin: 0;
            padding: 0;
            position: absolute;
            top: 39px;
            list-style: none;
            left: 0;
            li{
              width: 100%;
              height: 30px;
              background-color: white;
              border: 1px solid #dedede;
              margin: 0;
              line-height: 1;
            }
          }
          img{
            float: right;
            margin-top: 3px;
          }
        }
      }
    }
    .list_of_Goods_contentC_con3{
      padding-bottom: 30px;
      clear: both;
      ul{
        margin: 0;
        padding: 0;
        list-style: none;
        clear: both;
        li{
          float: left;
          margin-left: 10px;
          width: 263px;
          height: 322px;
          margin-top: 10px;
          padding: 20px 5px;
          border: 1px solid grey;
          box-sizing: border-box;
          .con3_img{
            width: 251px;
            height: 180px;
            text-align: center;
            line-height: 180px;
            img{
              width: 100%;
              height: 100%;
            }
          }
          h2{
            font-size: 15px;
            text-align: center;
          }
          .BgImg{
            width: 76px;
            height: 17px;
            margin: 0 auto;
            background: url("http://www.thefaceshop.com.cn/skin/frontend/tfs/desktop_eguana/images/review_star.png") repeat 0 0;
            background-position: 0 16px;
          }
          .flag{
            width: 100%;
            text-align: center;
            height: 20px;
            margin-bottom: 20px;
            span{
              padding: 3px ;
              border: 1px solid #b68957;
              font-size: 12px;
              color: #b68957;
            }
          }
        }
      }
    }

    .conent_footer{
      width: 100%;
      height: 120px;
      border: 1px solid #dedede;
      position: relative;
      top: 50%;
      .footer{
        width: 1100px;
        height: 120px;
        margin: 0 auto;
        .footer_left{
          width: 770px;
          height: 118px;
          float: left;
          box-sizing: border-box;
          border-right: 1px solid #dedede;
          padding: 20px 20px 20px 0;
          .table{
            display: table;
            float: left;
            font-size: 12px;
            .table_cell{
              display: table-cell;
              vertical-align: middle;
              img{
                max-width: 100%;
                margin: auto;
                display: block;
                width: 70px;
                height: 70px;
              }
            }
            .table_cell_p{
              width: 533px;
              height: 34px;
              padding-left: 30px;
              box-sizing: border-box;
              p{
                margin: 0;
                padding: 0;
              }
            }
            .table_mingchen{
              width: 533px;
              margin-top: 10px;
              padding-left: 30px;
              box-sizing: border-box;
              p{
                margin: 0;
                padding: 0;
              }
            }
          }
          .table_ri{
            width: 100px;
            float: right;
            height: 100%;
          }
        }
        .footer_right{
          float: right;
          .footer_biaodan{
            width: 310px;
            height: 80px;
            padding: 20px 0 10px 20px;
            box-sizing: border-box;
            div{
              padding: 20px 0 10px 0;
              box-sizing: border-box;
            }
            form{
              input{
                width: 240px;
                height: 32px;
                float: left;
                box-sizing: border-box;
              }
              button{
                width: 50px;
                height: 32px;
                text-align: center;
                line-height: 32px;
                color: white;
                box-sizing: border-box;
                background-color: #5a493f;
                float: left;
              }
            }
          }
        }
      }
    }
    .footer_bottom{
      width: 100%;
      height: 44px;
      background-color: #645848;
      .footer_bottonn_ce{
        width: 1100px;
        height: 100%;
        margin: 0 auto;
        p{
          text-align: center;
          line-height: 44px;
          color: #afa18d;
          font-size: 12px;
          margin: 0;
          padding: 0;
        }
      }
    }
  }
}
</style>
