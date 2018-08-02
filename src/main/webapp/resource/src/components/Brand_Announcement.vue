<template>
  <div class="Brand_Announcement">
    <Head></Head>
    <div class="Brand_Announcement_content">
      <div class="Brand_Announcement_content_top">
        <h1>公告栏</h1>
        <div>
          <a href="">主页</a>>
          <a href="">公告栏</a>
        </div>
      </div>
      <div class="Brand_Announcement_content_search">
        <div class="Brand_Announcement_content_search1">
          <button>新建</button>
          <button>通知</button>
        </div>
        <input type="text"><img src="http://www.thefaceshop.com.cn/skin/frontend/tfs/desktop_eguana/images/eguana/notifications/search.png" alt="">
      </div>
      <div class="Brand_Announcement_content_list">
        <table>
          <thead>
            <tr>
              <th>号码</th>
              <th>号码</th>
              <th>号码</th>
              <th>号码</th>
              <th>号码</th>
            </tr>
          </thead>
        </table>
      </div>
    </div>
  </div>
</template>

<script>
  import Head from './Head'
    export default {
        name: "Brand_Announcement",
      components:{
        Head
      }
    }
</script>

<style lang="less" scoped>
.Brand_Announcement_content{
  width: 100vw;
  padding-top: 20px;
  .Brand_Announcement_content_top{
    width: 1100px;
    height: 52px;
    border-bottom: 2px solid #333;
    margin: 0 auto;
    margin-bottom: 30px;
    h1{
      display: inline-block;
      margin: 0;
      padding: 0;
    }
    div{
      float: right;
      line-height: 52px;
      a{
        text-decoration: none;
        font-size: 12px;
        color: grey;
      }
    }
  }
  .Brand_Announcement_content_search{
    width: 1100px;
    height: 100px;
    margin: 0 auto;
    position: relative;
    padding: 10px 0 20px;
    box-sizing: border-box;
    input{
      position: absolute;
      bottom: 0;
      right: 0;
      width: 190px;
      height: 29px;
    }
    img{
      position: absolute;
      bottom: 9px;
      right: 9px;
    }
    .Brand_Announcement_content_search1{
      position: absolute;
      width: 600px;
      line-height: 100px;
      left: 50%;
      font-size: 0;
      transform: translateX(-300px);
      button{
        width: 220px;
        height: 41px;
        color: white;
        background-color: #6d9811;
        line-height: 21px;
        text-align: center;
        float: left;
        border: 1px solid #e1e4e8;
        padding: 10px;
      }
      button:nth-child(1){
        background-color: white;
        color: black;
      }
    }
  }
}
</style>
