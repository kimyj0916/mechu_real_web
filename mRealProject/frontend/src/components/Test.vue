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
		},
		decrementCounter() {
			this.counter -= 1;
		},
		multiplyCounter() {
			this.counter *= this.counter;
		},
		init() {
			this.counter = 0;
		}
	}
};
</script>

<template>
	<div id="app">
		<button @click="incrementCounter">증가</button>
		<button @click="decrementCounter">감소</button>
		<button @click="multiplyCounter">배수</button>
		<button @click="init">초기화</button>
		<p>버튼 클릭시 늘어나는 숫자 : {{ counter == Infinity ? '값이 너무 큼' : counter }}</p>
	</div>
</template>


<style scoped></style>