<template>
  <div class="home">
    <Head></Head>

    <div class="wrap">
      <div class="show">
        <ul class="ul_show">
          <li>
            <div class="shade"></div>
            <img src="http://www.thefaceshop.com.cn/media/wysiwyg/tfs/eguana/promotion/scroll-1100-500-180126-04.jpg" alt=""></li>
          <li>            <div class="shade"></div>
            <img src="http://www.thefaceshop.com.cn/media/wysiwyg/tfs/eguana/promotion/scroll-1100-500-180126-01.jpg" alt=""></li>
          <li>            <div class="shade"></div>
            <img src="http://www.thefaceshop.com.cn/media/wysiwyg/tfs/eguana/promotion/scroll-1100-500-180126-02.jpg" alt=""></li>
          <li>            <div class="shade"></div>
            <img src="http://www.thefaceshop.com.cn/media/wysiwyg/tfs/eguana/promotion/scroll-1100-500-180126-03.jpg" alt=""></li>
          <li>            <div class="shade"></div>
            <img src="http://www.thefaceshop.com.cn/media/wysiwyg/tfs/eguana/promotion/scroll-1100-500-180126-04.jpg" alt=""></li>
          <li>            <div class="shade"></div>
            <img src="http://www.thefaceshop.com.cn/media/wysiwyg/tfs/eguana/promotion/scroll-1100-500-180126-01.jpg" alt=""></li>
        </ul>
      </div>
      <div class="circle">
        <span></span>
        <span></span>
        <span></span>
        <span></span>
      </div>
    </div>

    <div class="wrap2">
      <div class="wrap2_content">
        <div class="wrap2_title">
          <hr>
          <span>BEST ITEM</span>
        </div>
        <div class="wrap2_content_lunbo">

          <div class="swiper-container">
            <div class="swiper-wrapper">
              <div class="swiper-slide">
                <ul>
                  <li @click="go_details('菲诗小铺水润触感唇部')"><img src="http://www.thefaceshop.com.cn/media/catalog/product/cache/2/small_image/230x230/9df78eab33525d08d6e5fb8d27136e95/_/5/_500_6_1.jpg" alt=""></li>
                  <li  @click="go_details('菲诗小铺自然之源精萃面膜-蜂蜜')"><img src="http://www.thefaceshop.com.cn/media/catalog/product/cache/2/small_image/230x230/9df78eab33525d08d6e5fb8d27136e95/a/-/a-102_2.jpg" alt=""></li>
                  <li  @click="go_details('菲诗小铺奇异子水滢保湿水')"><img src="http://www.thefaceshop.com.cn/media/catalog/product/cache/2/small_image/230x230/9df78eab33525d08d6e5fb8d27136e95/3/2/32300357_500_2.jpg" alt=""></li>
                  <li @click="go_details('菲诗小铺奇异子水滢保湿乳')"><img src="http://www.thefaceshop.com.cn/media/catalog/product/cache/2/small_image/230x230/9df78eab33525d08d6e5fb8d27136e95/a/-/a-258-top_1.jpg" alt=""></li>
                </ul>
              </div>
              <div class="swiper-slide">
                <ul>
                  <li @click="go_details('菲诗小铺清透美肌气垫BB修颜乳')"><img src="http://www.thefaceshop.com.cn/media/catalog/product/cache/2/small_image/230x230/9df78eab33525d08d6e5fb8d27136e95/b/-/b-77-top.jpg" alt=""></li>
                  <li @click="go_details('菲诗小铺净妍控油散粉')"><img src="http://www.thefaceshop.com.cn/media/catalog/product/cache/2/small_image/230x230/9df78eab33525d08d6e5fb8d27136e95/a/1/a189_204.jpg" alt=""></li>
                  <li @click="go_details('菲诗小铺金盏花嫩肤精华乳')"><img src="http://www.thefaceshop.com.cn/media/catalog/product/cache/2/small_image/230x230/9df78eab33525d08d6e5fb8d27136e95/a/1/a189_204.jpg" alt=""></li>
                  <li @click="go_details('菲诗小铺可爱甜蜜柔和淡彩腮红')"><img src="http://www.thefaceshop.com.cn/media/catalog/product/cache/2/small_image/230x230/9df78eab33525d08d6e5fb8d27136e95/a/1/a189_204.jpg" alt=""></li>
                </ul>
              </div>
            </div>
            <!-- Add Pagination -->
            <div class="swiper-pagination"></div>

          </div>

        </div>
      </div>
    </div>
    <div class="wrap3">
      <div class="wrap3_content">
        <div class="wrap3_content1">
          <div class="wrap3_content1_left">
            <h1>PRODUCT NEW</h1>
            <ul>
              <li @click="go_liebiao('人气彩妆','触感系列','1')"><img src="http://www.thefaceshop.com.cn/media/wysiwyg/tfs/eguana/main/product-0331-01.jpg" alt=""></li>
              <li @click="go_details('菲诗小铺 调理修护紧致精华素')"><img src="http://www.thefaceshop.com.cn/media/wysiwyg/tfs/eguana/main/product-0441-02_01.jpg" alt=""></li>
              <li @click="go_details('菲诗小铺恒采修护气垫 CC 修颜乳15g')"><img src="http://www.thefaceshop.com.cn/media/wysiwyg/tfs/eguana/main/product-0331-03.jpg" alt=""></li>
            </ul>
          </div>
          <div class="wrap3_content1_right">
            <h1>HOT DEAL</h1>
            <img src="http://www.thefaceshop.com.cn/media/wysiwyg/tfs/eguana/main/hotdeal_0731.jpg" alt="">
          </div>
        </div>
        <div class="wrap3_content2">

          <div class="swiper-container">
            <div class="swiper-wrapper">
              <div @click="go_liebiao('女性基础','调理修护紧致系列','1')" class="swiper-slide"><img src="http://www.thefaceshop.com.cn/media/wysiwyg/tfs/eguana/main/main_bottom_banner2_180126_1.jpg" alt=""></div>
              <div @click="go_details('辛普森限量每日芬芳护手霜系列')" class="swiper-slide"><img src="http://www.thefaceshop.com.cn/media/wysiwyg/tfs/eguana/main/main_bottom_banner2_180126_2.jpg" alt=""></div>
            </div>
            <div class="swiper-button-next"></div>
            <div class="swiper-button-prev"></div>
          </div>

        </div>
      </div>
    </div>
    <div class="wrap4_vivo">
      <div class="wrap4_vivo_hr">
        <hr>
        <span>EVENT</span>
      </div>
      <div class="wrap4_vivo_content">
        <div class="wrap4_vivo_content_left">
          <img @click="go_tianmao()" src="http://www.thefaceshop.com.cn/media/wysiwyg/tfs/eguana/main/stylecare_leftBanner1_180227.jpg" alt="">
        </div>
        <div class="wrap4_vivo_content_right">
          <div class="wrap4_vivo_content_right1">
            <iframe style="border: 0px currentColor;" src="http://player.youku.com/embed/XMzEwOTAzNjAwNA==" height="299" width="540"></iframe>
          </div>
          <div class="wrap4_vivo_content_right2">
            <img src="http://www.thefaceshop.com.cn/media/wysiwyg/tfs/eguana/main/stylecare_rightBanner_0401.jpg" alt="">
          </div>
        </div>
      </div>
    </div>
    <div class="wrap5">
      <div class="wrap5_title">
        <hr>
        <span>PHOTO REVIEW</span>
      </div>
      <div class="wrap5_content">
        <div class="wrap5_content_col">
          <img src="http://www.thefaceshop.com.cn/media//resizedreview/review/product/5/8/58df545dd7cfd7.59234923.jpg" alt="">
          <div class="info">
            <div class="aixin"></div>
            <h3>菲诗小铺水润触感唇部 RD03 梦幻红唇</h3>
            <span>RD03是经典大红色</span><br>
            <span>每一种颜色都各有魅力。</span><br>
            <span>但由于个人的唇色差异显色效果会有差异哦。</span>
            <i><img src="http://www.thefaceshop.com.cn/skin/frontend/tfs/desktop_eguana/images/icon_more_1.png" alt=""></i>
          </div>
        </div>
        <div class="wrap5_content_col">
          <img src="http://www.thefaceshop.com.cn/media//resizedreview/review/product/5/8/58df537f8ca480.42970578.jpg" alt="">
          <div class="info">
            <div class="aixin"></div>
            <h3>菲诗小铺水润触感唇部CR02 性感沙滩</h3>
            <span>菲诗小铺水润触感唇膏</span><br>
            <span>全系列一共16个色号，单价为89元，很亲民 <br>的价位；这个系列整体润感很足，颜色比较。</span><br>
            <i><img src="http://www.thefaceshop.com.cn/skin/frontend/tfs/desktop_eguana/images/icon_more_1.png" alt=""></i>
          </div>
        </div>
      </div>
      <div class="wrap5_footer">
        <hr>
        <span>·</span>
      </div>
    </div>
    <div class="wrap6">
      <div class="wrap6_content">
        <div class="wrap6_content_left">
          <div class="wrap6_content_left_le">
            <img src="http://www.thefaceshop.com.cn/media/qrcode/7bc1046557c261486d32c796b43fcaa4.png" alt="">
            <br>
            <span>MOBILE <br>THE FACE SHOP</span>
          </div>
          <div class="wrap6_content_left_ri">
            <h3>CS CENTER</h3>
            <span>请给我们留言，</span><br> <span>我们会尽快回复您。</span>
            <a href="#">联系我们</a>
          </div>
        </div>
        <div class="wrap6_content_right">
          <div class="wrap6_content_right_he">
            <div class="wrap6_content_right_le">
              <div class="wrap6_content_right_letitle">
                <h3>NOTICE</h3>
                <span>more +</span>
              </div>
              <ul>
                <li>菲诗小铺中国官方网站正式上线发布</li>
                <li>菲诗小铺开业首次“菲常日”，周周有礼！</li>
                <li>菲诗小铺官网开业庆典</li>
                <li>热烈庆祝菲诗小铺中国官方网站暨官方商城盛大开业！</li>
              </ul>
            </div>
            <div class="wrap6_content_right_le">
              <div class="wrap6_content_right_letitle">
                <h3>NEWS</h3>
                <span>more +</span>
              </div>
              <ul>
                <li>有形有色——菲诗小铺全新唇膏笔，打造百变真我</li>
                <li>当红不让，菲诗小铺新年限量版开运单品上市</li>
                <li>看得见的精华水滴 菲诗小铺全新金润胶原蛋白系列</li>
                <li>The Face Shop菲诗小铺携手天猫打造菲诗小铺11周年线下生活体验馆</li>
              </ul>
            </div>
          </div>
        </div>
      </div>
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
</template>

<script>
  let aa = -1100;
  show_lun();
  function show_lun() {
    var timer = setInterval(function () {
      aa-=5;
      $(".ul_show").css("left",aa);
        for (let i = 0; i < $(".circle>span").length; i++) {
          $(".circle>span").eq(i).css("background","grey");
        }
        if(aa == -1105){
          $(".shade").eq(1).css("display","none");
        }else if(aa == -2200){
          $(".shade").eq(2).css("display","none");
        }else if (aa == -3300){
          $(".shade").eq(3).css("display","none");
          $(".shade").eq(4).css("display","block");
        } else if (aa == -4400) {
          $(".shade").eq(4).css("display","none");
        }else{
          for (let i = 0; i < $(".shade").length; i++) {
            $(".shade").eq(i).css("display","block");
          }
        }
      if (aa == -1105||aa==-2200 ||aa==-3300||aa==-4400||aa==-5500){
        clearInterval(timer);
        setTimeout(function () {
          show_lun();
        },2500)
      }

      if (aa < -1100 && aa > -2200) {
        $(".circle>span").eq(1).css("background","red");
      }
      if (aa < -2200 && aa > -3300) {
        $(".circle>span").eq(2).css("background","red");
      }
      if (aa < -3300 && aa > -4400) {
        $(".circle>span").eq(3).css("background","red");
      }
      if (aa < -4400) {
        $(".circle>span").eq(0).css("background","red");
      }
      if (aa<-4400){
        aa = -1100;
      }
    },1)
  }

  import Swiper from 'swiper'
  import Head from '../Head'
    export default {
      name: "home_Page",
      data(){
        return{

        }
      },
      components:{
          Head
      },
      mounted(){
        var swiper = new Swiper('.swiper-container', {
          spaceBetween: 30,
          centeredSlides: true,
          autoplay: {
            delay: 2500,
            disableOnInteraction: false,
          },
          pagination: {
            el: '.swiper-pagination',
            clickable: true,
          },
          navigation: {
            nextEl: '.swiper-button-next',
            prevEl: '.swiper-button-prev',
          },
        });
        var swiper1 = new Swiper('.wrap3_content2>.swiper-container', {
          slidesPerView: 1,
          spaceBetween: 30,
          loop: true,
          pagination: {
            el: '.wrap3_content2>.swiper-pagination',
            clickable: true,
          },
          navigation: {
            nextEl: '.wrap3_content2>.swiper-button-next',
            prevEl: '.wrap3_content2>.swiper-button-prev',
          },
        })
      },
      methods:{
        go_details(a){
          $.ajax({
            type:"post",
            url:'http://10.80.9.234:8093/goods',
            data:{
              commodityname:a
            },
            success:(data)=>{
              // console.log(data);
              data= JSON.stringify(data);
              sessionStorage.getItem('goods_Details',data);
              this.$router.push("/detailss");
            }
          })
        },
        go_liebiao(a,b,c){
          console.log(a,b,c);
          $.ajax({
            type:"post",
            url:'http://10.80.9.234:8093/list',
            data:{
              sortname:b,
              seriesname:a,
              rank:c
            },
            success:(data)=>{
              // console.log(data);
              data= JSON.stringify(data);
              sessionStorage.getItem('list',data);
              this.$router.push(`/List_Of_Goods?p=${a}&w=${b}&ye=2`);
            }
          })
        },
        go_tianmao(){
          window.location.href='https://thefaceshop.tmall.com/';
        }
      }
    }

</script>

<style lang="less" scoped>
  .home{
    margin: 0;
    padding: 0;
    width: 100%;
    overflow: hidden;
    .wrap{
      width: 100%;
      height: 500px;
      overflow: hidden;
      position: relative;
      .circle{
        position: absolute;
        bottom: 30px;
        margin-left: 48%;
        span{
          width: 10px;
          height: 10px;
          display: inline-block;
          margin-left: 5px;
          border-radius: 50%;
          background-color: darkgrey;
        }

      }
      .show{
        width: 1100px;
        height: 100%;
        margin: 0 auto;
        position: relative;
        ul{
          width: 6600px;
          height: 100%;
          margin-left: 10px;
          margin: 0;
          padding: 0;
          list-style: none;
          position: absolute;
          li{
            float: left;
            width: 1100px;
            height: 100%;
            position: relative;
            .shade{
              width: 100%;
              height:100%;
              position: absolute;
              left: 0;
              top: 0;
              background-color: rgba(0,0,0,.6);
            }
            img{
              width: 100%;
              height: 100%;
            }
          }
        }
      }
    }
    .wrap2{
      width: 100vw;
      height: 440px;
      .wrap2_content{
        width: 1100px;
        height: 100%;
        margin: 0 auto;
        .wrap2_content_lunbo{
          width: 1100px;
          height: 328px;
        }
        .wrap2_title{
          width: 100%;
          text-align: center;
          padding: 40px 0 ;
          position: relative;
          span{
            position: absolute;
            top: 20px;
            width: 100px;
            height: 50%;
            line-height: 50px;
            background-color: white;
            left: 48%;
          }
        }
      }
    }
    .swiper-container {
      width: 100%;
      height: 100%;

    }
    .swiper-slide {
      text-align: center;
      font-size: 18px;
      background: #fff;
      ul{
        padding: 0;
        margin: 0;
        width: 100%;
        height: 270px;
        list-style: none;
        li{
          width: 275px;
          height: 270px;
          float: left;
        }
      }
      /* Center slide text vertically */
      display: -webkit-box;
      display: -ms-flexbox;
      display: -webkit-flex;
      display: flex;
      -webkit-box-pack: center;
      -ms-flex-pack: center;
      -webkit-justify-content: center;
      justify-content: center;
      -webkit-box-align: center;
      -ms-flex-align: center;
      -webkit-align-items: center;
      align-items: center;
    }

    .wrap3{
      width: 100%;
      height: 696px;
      .wrap3_content{
        width: 1100px;
        height: 100%;
        margin: 0 auto;
        .wrap3_content1{
          width: 1100px;
          height: 436px;
          .wrap3_content1_left{
            width: 726px;
            height: 436px;
            float: left;
            h1{
              width: 716px;
              height: 49px;
              font-size: 22px;
              padding-bottom: 20px;
              margin: 0;
            }
            ul{
              padding: 0;
              margin: 0;
              width: 716px;
              height: 387px;
              list-style: none;
              li{
                float: left;
                width: 238px;
                height: 387px;
                img{
                  float: left;
                  width: 100%;
                  height: 386px;
                }
              }
            }
          }
          .wrap3_content1_right{
            width: 364px;
            height: 435px;
            float: left;
            padding-left: 10px;
            h1{
              width: 716px;
              height: 49px;
              font-size: 22px;
              padding-bottom: 20px;
              margin: 0;
            }
          }
        }
        .wrap3_content2{
          margin-top: 50px;
          .swiper-container {
            width: 100%;
            height: 100%;
            margin-left: auto;
            margin-right: auto;
            .swiper-slide {
              text-align: center;
              font-size: 18px;
              background: #fff;

              /* Center slide text vertically */
              display: -webkit-box;
              display: -ms-flexbox;
              display: -webkit-flex;
              display: flex;
              -webkit-box-pack: center;
              -ms-flex-pack: center;
              -webkit-justify-content: center;
              justify-content: center;
              -webkit-box-align: center;
              -ms-flex-align: center;
              -webkit-align-items: center;
              align-items: center;
            }
          }
        }

      }
    }
    .wrap4_vivo{
      width: 100vw;
      height: 593px;
      .wrap4_vivo_hr{
        width: 1100px;
        height: 2px;
        padding: 50px 0;
        margin:  0 auto;
        text-align: center;
        position: relative;
        span{
          width: 150px;
          height: 29px;
          line-height: 29px;
          position: absolute;
          font-size: 22px;
          left: 50%;
          transform: translateX(-75px);
          top: 40px;
          background-color: white;
        }
      }
      .wrap4_vivo_content{
        width: 1100px;
        margin:  0 auto;
        .wrap4_vivo_content_left{
          width: 540px;
          height: 439px;
          float: left;
        }
        .wrap4_vivo_content_right{
          width: 550px;
          height: 491px;
          float: left;
          margin-left: 10px;
          .wrap4_vivo_content_right1{
            width: 540px;
            height: 300px;
          }
          .wrap4_vivo_content_right2{
            width: 540px;
            height: 158px;
            margin-top: 30px;
          }
        }
      }
    }
    .wrap5{
      width: 100vw;
      height: 385px;
      .wrap5_title{
        width: 1100px;
        height: 2px;
        padding: 50px 0;
        margin:  0 auto;
        position: relative;
        text-align: center;
        span{
          width: 250px;
          height: 29px;
          background-color: white;
          position: absolute;
          font-size: 22px;
          top: 40px;
          left: 50%;
          transform: translateX(-130px);
        }
      }
      .wrap5_content{
        width: 1100px;
        height: 252px;
        margin: 0 auto;
        .wrap5_content_col{
          width: 540px;
          height: 218px;
          float: left;
          img{
            float: left;
            width: 216px;
            height: 216px;
          }
          .info{
            float: left;
            padding: 20px 30px;
            width: 262px;
            height: 176px;
            font-size: 0;
            border: 1px solid grey;
            position: relative;
            .aixin{
              width: 75px;
              height: 15px;
              background: url("http://www.thefaceshop.com.cn/skin/frontend/tfs/desktop_eguana/images/review_star.png") 0 0;
            }
            span{
              font-size: 13px;
            }
            h3{
              margin: 20px 0;
              padding: 0;
              font-size: 16px;
            }
            i{
              width: 45px;
              height: 45px;
              position: absolute;
              top: 0;
              right: 0;
              img{
                width: 45px;
                height: 45px;
              }
            }
          }
        }
        .wrap5_content_col:nth-child(2){
          margin-left: 20px;
        }
      }
      .wrap5_footer{
        width: 1100px;
        height: 2px;
        padding: 20px 0;
        margin:  0 auto;
        text-align: center;
        position: relative;
        span{
          position: absolute;
          width: 84px;
          height: 34px;
          top: 10px;
          left: 50%;
          transform: translateX(-42px);
          background-color: white;
          border-radius: 20px;
          border: 1px solid darkgray;
          text-align: center;
          line-height: 34px;
          color: #6d9811;
          font-size: 50px;
          font-weight: bold;
        }
      }
    }
    .wrap6{
      width: 100vw;
      height: 224px;
      padding-top: 40px;
      .wrap6_content{
        width: 1100px;
        height: 224px;
        margin:  0 auto;
        .wrap6_content_left{
          width: 404px;
          height: 184px;
          float: left;
          .wrap6_content_left_le{
            width: 117px;
            height: 157px;
            padding: 25px 30px 0 30px;
            border: 1px solid #dedede;
            float: left;
            font-size: 0;
            span{
              font-size: 12px;
              text-indent: 2em;
            }
          }
          .wrap6_content_left_ri{
            width: 224px;
            float: left;
            height: 184px;
            border: 1px solid #dedede;
            border-left: 0px;
            position: relative;
            h3{
              margin: 0 0 10px 0 ;
              padding: 25px 0 0 30px;
              box-sizing: border-box;
              font-size: 22px;
            }
            span{
              padding-left: 30px;
              box-sizing: border-box;
              font-size: 17px;
            }
            a{
              position: absolute;
              width: 100%;
              background-color: #f8f8f8;
              bottom: 0;
              height: 40px;
              text-indent: 2em;
              line-height: 40px;
              font-weight: bolder;
              color: #333;
              text-decoration: none;
              left: 0;
            }
          }
        }
        .wrap6_content_right{
          width: 680px;
          height: 184px;
          float: left;
          margin-left: 13px;
          border: 1px solid #dedede;
          .wrap6_content_right_he{
            overflow: hidden;
            padding: 20px 30px 6px 30px;
            border: 1px solid #dedede;
            box-sizing: border-box;
            .wrap6_content_right_le:nth-child(2){
              margin-left: 10px;
            }
            .wrap6_content_right_le{
              width: 300px;
              height: 156px;
              float: left;
              .wrap6_content_right_letitle{
                width: 300px;
                height: 24px;
                border-bottom: 1px solid #dedede;
                position: relative;
                h3{
                  margin: 0;
                }
                span{
                  position: absolute;
                  top: 0;
                  right: 0;
                  color: #6d9811;
                  line-height: 22px;
                }
              }
              ul{
                margin: 0;
                padding: 0;
                list-style: none;
                li{
                  font-size: 14px;
                  overflow:hidden;
                  text-overflow:ellipsis;
                  white-space:nowrap;
                  margin-top: 5px;
                }
                li:nth-child(1){
                  margin-top: 10px;
                }
              }
            }
          }
        }
      }
    }
    .conent_footer{
      width: 100%;
      height: 120px;
      border: 1px solid #dedede;
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
</style>
