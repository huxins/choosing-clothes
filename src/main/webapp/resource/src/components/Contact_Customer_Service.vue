<template>
  <div class="Contact_wrap">
    <div class="Contact_wrap_title">
      <img src="http://chat16.live800.com/live800/chatClient/version5/style/images/logo.png" alt="">
    </div>
    <div class="Contact_wrap_content">
      <div class="Contact_wrap_content_left">
        <div class="Contact_wrap_content_left1">
          <span>请留言，我们会尽快给您回复!</span><br>
          <i>*</i>姓名 <input type="text" name="username"><br>
          固定电话 <input type="text"><br>
          <i>*</i>电子邮件 <input type="text"><br>
          留言主题 <input type="text"><br>
          <i>*</i>留言内容 <input type="text"><br>
          <button>提交</button>
        </div>
      </div>
      <div class="Contact_wrap_content_right">
          <img src="http://chat16.live800.com/live800/chatClient/version5/style/images/right_zh.png" alt="">
          <img src="http://chat16.live800.com/live800/chatClient/version5/style/images/case/case-01.png" alt="">
          <img src="http://chat16.live800.com/live800/chatClient/version5/style/images/case/case-02.png" alt="">
          <img src="http://chat16.live800.com/live800/chatClient/version5/style/images/case/case-03.png" alt="">
          <img src="http://chat16.live800.com/live800/chatClient/version5/style/images/case/case-04.png" alt="">
          <img src="http://chat16.live800.com/live800/chatClient/version5/style/images/case/case-05.png" alt="">
          <img src="http://chat16.live800.com/live800/chatClient/version5/style/images/case/case-06.png" alt="">
          <img src="http://chat16.live800.com/live800/chatClient/version5/style/images/case/case-07.png" alt="">
          <img src="http://chat16.live800.com/live800/chatClient/version5/style/images/case/case-08.png" alt="">
      </div>
    </div>
  </div>
</template>

<script>
    export default {
        name: "Contact_Customer_Service"
    }
</script>

<style lang="less" scoped>
.Contact_wrap{
  width: 100vw;
  .Contact_wrap_title{
    width: 100%;
    height: 56px;
    background-color: #8BB6E9;
    line-height: 56px;
    padding: 0 20px;
    box-sizing: border-box;
  }
  .Contact_wrap_content{
    width: 100%;
    position: relative;
    .Contact_wrap_content_left{
      margin-left: 10%;
      float: left;
      .Contact_wrap_content_left1{
        margin-left: 30%;
        min-width: 400px;
        margin-top: 150px;
        font-size: 16px;
        text-align: right;
        i{
          color: red;
        }
        span{
          margin-bottom: 30px;
          display: inline-block;
          margin-right: 120px;
        }
        input{
          margin-bottom: 20px;
          width: 246px;
          height: 30px;
        }
        input:nth-child(14){
          height: 82px;
        }
        button{
          display: inline-block;
          min-width: 90px;
          height: 32px;
          line-height: 32px;
          border-radius: 2px;
          padding: 0 14px;
          cursor: pointer;
          user-select: none;
          border: none;
          outline: 0;
          text-align: center;
          text-decoration: none;
          background-color: #8BB6E9;
          color: white;
          float: left;
          margin-top: 30px;
          margin-left: 37%  ;
        }
      }
    }
    .Contact_wrap_content_right{
      position: absolute;
      top: 0;
      right: 0;
      width: 270px;
        img{
          float: left;
        }
      img:nth-child(n+2){
        margin-left: 10%;
        margin-right: 5%;
        margin-top: 20px;
      }
    }
  }
}
</style>
