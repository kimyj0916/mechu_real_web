<script>
export default {
  data() {
    return {
      counter: 0
    };
  },
  methods: {
    incrementCounter() {
      this.counter += 1;
    }
  }
};
</script>

<template>
  <div id="app">
    <button v-on:click="incrementCounter">Test</button>
    <p>버튼 클릭시 늘어나는 숫자 : {{ counter }}</p>
  </div>
</template>


<style scoped>
</style>