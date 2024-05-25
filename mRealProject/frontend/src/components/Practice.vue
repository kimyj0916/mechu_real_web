<script>
import axios from 'axios';

export default {
    data() {
        return {
            getData: []
        }
    },
    methods: {
        getDatafunction() {
            axios.get('/api/practice/getData').then(
                res => {
                    this.getData = res.data
                    console.log(res)
                }
            )
        }
    },
}

</script>

<template>
  <div>
    <h1>데이터 출력</h1>
    <h2>MariaDB의 test_member 테이블의 데이터를 출력해보는 공간입니다.</h2>
    <hr>
    <button @click="getDatafunction"> 데이터 출력 </button>
    {{ getData }}
  </div>
</template>

<style scoped>

</style>
