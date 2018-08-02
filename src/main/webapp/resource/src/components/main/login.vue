<template>

  <div>
    <Head></Head>
    <!--<Test></Test>-->
    <div class="login_content">
      <div v-show="login_content_123_show" class="login_content_123">
        <div class="login_content_1">
          <ul>
            <li>当前位置：</li>
            <li>首页</li>
            <li>登录</li>
          </ul>
        </div>
        <div class="login_content_2">
          <h1>会员登录</h1>
        </div>
        <div class="login_content_3">
          <form action="" method="">
            手机号/邮箱：<input v-model.lazy="UserName" @change="changeUsername" type="text" name="username"><span v-show="canTrue">请输入正确的手机号</span><br>
            密码：<input v-model.lazy="Pwd" @change="changePwd" type="password" name="pwd"><span v-show="canFPwd">请输入正确的密码</span><br>
            <input @click="go_Server" type="submit" value="提交"><br>
          </form>
          <div class="wangji">
            <a href="">忘记密码></a>|
            <a @click="go_zhuhce" href="#">点击注册</a>
          </div>
          <div class="sub_log">
            使用第三方登录：<img src="" alt="qq登录"><img src="" alt="微博登录"> <img src="" alt="支付宝登录">
          </div>
        </div>
      </div>
      <div v-show="login_content_456_show" class="login_content_456">
        <div class="login_content_4">
          <ul>
            <li>当前位置：</li>
            <li>首页</li>
            <li>注册</li>
          </ul>
        </div>
        <div class="login_content_5">
          <h1 @click="login_content_6_show=true,login_content_7_show=false">手机注册</h1>
          <h1 @click="login_content_7_show=true,login_content_6_show=false">邮箱登录</h1>
        </div>
        <div v-show="login_content_6_show" class="login_content_6">
          <form action="">
            手机号：<input v-model.lazy="zhuceUserName" @change="zhgucechange" type="text" name="username"><i v-show="zhuceCan">你输入的有误</i><br>
            短信验证码：<input v-model="duanxinUser" type="text" ><span @click="huoqu">获取验证码</span><br>
            请输入验证码：<input type="text"> <br>
            <img :src="getStr" alt="验证码"><span @click="huan" class="logo_chang">点击更换</span><br>
            密码：<input v-model.lazy="zhucePwd"  @change="zhgucePwd" type="password" name="pwd"> <i v-show="zhuceCanPwd">请输入6位数的密码</i><br>
            确认密码：<input v-model.lazy="ageinzhucePwd" @change="changeagaPwd" type="password" name="againpwd"><i v-show="agazhuceCanPwd">密码不相同</i><br>
            <input @click="sub1" class="sub" type="submit" value="提交">
          </form>
        </div>
        <div v-show="login_content_7_show" class="login_content_7">
          <div class="youxiang">
            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp邮箱：<input v-model="youxiang" type="text"><br>
            &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp密码：<input v-model="youxiangpwd" type="password"><br>
            确认密码：<input v-model="youxiangagapwd" type="password"><br>
            <input @click="sub2" type="submit" value="提交">
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

  </div>

</template>

<script>
  import Head from '../Head'
console.log(window.location)

  export default {
    mounted() {
      if (window.location.search == "?a=1") {
        this.login_content_123_show = true;
        this.login_content_456_show = false;
      } else {
        this.login_content_123_show = false;
        this.login_content_456_show = true;
      }
    },
    name: "Login",
    components: {
      Head
    },
    data() {
      return {
        UserName: "",
        canTrue: false,
        Pwd: "",
        canFPwd: false,
        zhuceUserName: "",
        getStr: "http://10.80.9.234:8093/picCode",
        zhuceCan: false,
        zhucePwd: "",
        zhuceCanPwd: false,
        ageinzhucePwd: "",
        agazhuceCanPwd: false,
        yanznum: "",
        yanzC: false,
        duanxin: "",
        duanxinUser: "",
        aa: 1,
        login_content_7_show: false,
        login_content_6_show: true,
        youxiang: "",
        youxiangpwd: "",
        youxiangagapwd: "",
        login_content_123_show: true,
        login_content_456_show: false
      }
    },
    methods: {
      go_zhuhce() {
        this.login_content_123_show = false;
        this.login_content_456_show = true;
      },
      changeUsername() {
        if (this.UserName == "") {
          this.canTrue = false;
        } else if (this.UserName.match(/^1\d{10}$/g) !== null) {
          this.canTrue = false;
        } else {
          this.canTrue = true;
        }
      },
      changePwd() {
        if (this.Pwd == "") {
          this.canFPwd = true;
        } else {
          this.canFPwd = false;
        }
      },
      go_Server() {
        if (this.UserName == "" || this.Pwd == "") {
          alert("请正确的输入手机号或密码");
          this.canTrue = false;
          this.canFPwd = false;
          event.preventDefault();
          return false;
        } else if (this.UserName.match(/^1\d{10}$/g) == null) {
          alert("请正确的输入手机号");
          this.canTrue = false;
          event.preventDefault();
          return false;
        } else {
          // alert("提交成功");
          event.preventDefault();
          $.ajax({
            type: 'post',
            url: "http://10.80.9.234:8093/login",
            data: {
              phone: this.UserName,
              password: this.Pwd
            },
            success: function (data) {
              console.log(data);
              window.location.href = "http://localhost:8080/Home_Page";
            }
          })
        }
      },
      zhgucechange() {
        if (this.zhuceUserName == "") {
          this.zhuceCan = true;
          return false;
        } else if (this.zhuceUserName.match(/^1\d{10}$/g) == null) {
          this.zhuceCan = true;
          return false;
        } else {
          this.zhuceCan = false;
          return true;
        }
      },
      huoqu() {
        if (this.zhuceCan == false) {
          $.ajax({
            type: "post",
            url: "http://10.80.9.234:8093/validateCode",
            data: {
              phone: this.zhuceUserName
            },
            success: function (data) {
              console.log(data);
              this.duanxin = data;
            }
          })
        }
      },
      zhgucePwd() {
        if (this.zhucePwd == "") {
          this.zhuceCanPwd = true;
        } else if (this.zhucePwd.length != 6) {
          this.zhuceCanPwd = true;
        } else {
          this.zhuceCanPwd = false;
        }
      },
      changeagaPwd() {
        if (this.ageinzhucePwd == this.zhucePwd) {
          this.agazhuceCanPwd = false;
        } else {
          this.agazhuceCanPwd = true;
        }
      },
      huan() {
        this.aa++;
        this.getStr = `http://10.80.9.234:8093/picCode?a=${this.aa}`;
      },
      sub1() {
        if (this.zhuceCan) {
          event.preventDefault();
          alert("请正确输入用户名");
          return;
        } else if (this.zhuceCanPwd) {
          event.preventDefault();
          alert("请正确输入密码");
          return;
        } else if (this.agazhuceCanPwd) {
          event.preventDefault();
          alert("请正确输入密码");
          return;
        }
        event.preventDefault();
        $.ajax({
          type: "post",
          url: "http://10.80.9.234:8093/register",
          data: {
            phone: this.zhuceUserName,
            password: this.zhucePwd
          },
          success: function (data) {
            console.log(data);
            alert("登录成功");
            window.location.href = "http://localhost:8080/Home_Page";
          }
        })
      },
      sub2() {
        if (this.youxiang == "") {
          alert("请输入邮箱");
          return;
        } else if (this.youxiang.match(/^[A-Za-z\d]+([-_.][A-Za-z\d]+)*@([A-Za-z\d]+[-.])+[A-Za-z\d]{2,4}$/) == null) {
          alert("请正确输入邮箱");
          return;
        } else if (this.youxiangpwd === "" || this.youxiangagapwd === "") {
          alert("请输入密码");
          return;
        } else if (this.youxiangpwd !== this.youxiangagapwd) {
          alert("请核对密码");
          return;
        }
        $.ajax({
          type: "post",
          url: "http://10.80.9.234:8093/register",
          data: {
            email: this.youxiang,
            password: this.youxiangpwd
          },
          success: function (data) {
            console.log(data);
            window.location.href = "http://localhost:8080/Home_Page";
          }
        })
      }
    },
    computed: {}

  }
</script>

<style lang="less" scoped>
.login_content{
  width: 100%;
  height: 637px;
  .login_content_123{
    .login_content_1{
      width: 1100px;
      height: 50px;
      margin: 0 auto;
      ul{
        padding: 0;
        margin: 0;
        list-style: none;
        font-size: 12px;
        line-height: 50px;
        li{
          float: left;
          width: 24px;
        }
        li:nth-child(1){
          width: 60px;
        }
        li:nth-child(2){
          width: 41px;
        }
      }
    }
    .login_content_2{
      width: 1100px;
      margin: 0 auto;
      height: 38px;
      background-color: rgba(163,125,80,0.5);
      h1{
        font-size: 14px;
        color: #666666;
        text-align: center;
        line-height: 38px;
      }
    }
    .login_content_3{
      width: 781px;
      height: 224px;
      margin: 50px 0 0 35%;
      form{
        input{
          width: 230px;
          height: 15px;
        }
        input:nth-child(1){
          margin-left: 7px;
        }
        input:nth-child(4){
          margin-left: 8%;
          margin-top: 10px;
        }
        input:nth-child(7){
          margin-left: 14%;
          margin-top: 10px;
          height: 32px;
          background-color: #5a493f;
          color: white;
        }
      }
      .wangji{
        font-size: 14px;
        margin-left: 14%;
        margin-top: 10px;
        a{
          color: #5a2f16;
          text-decoration: none;
          width: 245px;
          padding-bottom: 20px;
          border-bottom: 1px #e9e9e9 solid;
        }
        a:hover{
          text-decoration: underline;
        }
      }
      .sub_log{
        margin-top: 20px;
        padding-top: 20px;
        width: 400px;
        img{
          width: 66px;
        }
        img:nth-child(3){
          width: 103px;
        }
      }
    }
  }
  .login_content_456{
    display: block;
    .login_content_4{
      width: 1100px;
      height: 50px;
      margin:  0 auto;
      ul{
        margin: 0;
        padding: 0;
        list-style: none;
        font-size: 12px;
        line-height: 50px;
        li{
          float: left;
        }
        li:nth-child(3){
          margin-left: 1%;
        }
      }
    }
    .login_content_5{
      width: 1100px;
      height: 38px;
      margin: 0 auto;
      h1{
        width: 50%;
        height: 100%;
        text-align: center;
        line-height: 38px;
        border: 1px solid #e8e8e8;
        float: left;
        margin: 0;
        padding: 0;
        font-size: 14px;
        box-sizing: border-box;
      }
      h1:nth-child(1){
        background-color: rgba(163,125,80,0.5);
      }
    }
    .login_content_6,.login_content_7{
      margin: 50px 0 0 31%;
      form{
        input{
          width: 311px;
          height: 29px;
          margin-bottom: 15px;
        }
        input:nth-child(1){
          margin-left: 50px;
        }
        input:nth-child(4){
          width: 204px;
          margin-left: 20px;
        }
        input:nth-child(7){
          width: 311px;
          margin-left: 5px;
        }
        input:nth-child(12){
          width: 311px;
          margin-left: 70px;
          margin-top: 15px;
        }
        input:nth-child(15){
          width: 311px;
          margin-left: 40px;
          margin-top: 15px;
        }
        .sub{
          height: 32px;
          background-color: #3b322b;
          color: white;
          margin-left: 120px;
        }
        img{
          width: 80px;
          height: 30px;
          margin-left: 120px;
          margin-right: 5px;
          vertical-align: middle;
        }
        span{
          width: 100px;
          margin-left: 5px;
          display: inline-block;
          height: 34px;
          text-align: center;
          line-height: 30px;
          background-color: #3b322b;
          color: white;
        }
        .logo_chang{
          width: 223px;
          height: 31px;
        }
      }
    }
    .login_content_7{
      .youxiang{
        input{
          width: 311px;
          height: 29px;
          margin-bottom: 15px;
        }
        input:nth-child(7){
          margin-left: 6%;
          height: 32px;
          background-color: #3b322b;
          line-height: 32px;
          text-align: center;
          color: white;
        }
      }
    }
  }
  .conent_footer{
    width: 100%;
    height: 120px;
    border: 1px solid #dedede;
    margin-top: 100px;
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
