<template>
<div>
  <Head></Head>
  {{result}}
</div>
</template>

<script>
  import Head from '../Head'
    export default {
        name: "detailss",
      components:{
        Head
      },
      data:function(){
        return{
          result:""
        }
      },
      created: function () {
        fetch("http://10.80.9.234:8093/classify", {}).then((res)=>{
          return res.json();
        }).then((res)=>{
          this.result = res;
          console.log(this.result);
        }).catch((error)=>{
          console.log(error);
        })
      }
    }
</script>

<style scoped>

</style>
